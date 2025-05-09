plugins {
    id("java")
    id("antlr")
    id("application")
}

group = "edu.seattleu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    antlr("org.antlr:antlr4:4.13.2")
    implementation("org.antlr:antlr4-runtime:4.13.2")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

application {
    mainClass.set("GemCompiler")
}

tasks.generateGrammarSource {
    maxHeapSize = "64m"
    arguments = arguments + listOf("-visitor", "-listener")
    outputDirectory = file("src/main/java")
}

tasks.compileJava {
    dependsOn(tasks.generateGrammarSource)
}

tasks.test {
    useJUnitPlatform()
}

tasks.register<Jar>("uberJar") {
    archiveClassifier.set("uber")

    // Add this section to specify the main class
    manifest {
        attributes(
            "Main-Class" to "GemCompiler"
        )
    }

    from(sourceSets.main.get().output)

    dependsOn(configurations.runtimeClasspath)
    from({
        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
    })

    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.register<JavaExec>("compileGem") {
    dependsOn("jar")
    mainClass.set("GemCompiler")
    classpath = sourceSets.main.get().runtimeClasspath

    // Accept command line arguments
    if (project.hasProperty("file")) {
        args = listOf(project.property("file").toString())
    } else {
        println("Please provide a Gem file: -Pfile=samples/hello.gem")
    }
}

tasks.register<Exec>("runGemProgram") {
    dependsOn("compileGem")

    if (project.hasProperty("file")) {
        val gemFile = project.property("file").toString()
        val className = File(gemFile).nameWithoutExtension
        executable = "java"
        args = listOf("-cp", ".", className)
    } else {
        println("Please provide a Gem file: -Pfile=samples/hello.gem")
    }
}

// Add these configurations to build.gradle.kts
tasks.compileJava {
    options.compilerArgs.add("--enable-preview")
    options.release.set(24)
}

tasks.withType<JavaExec> {
    jvmArgs("--enable-preview")
}

tasks.withType<Test> {
    jvmArgs("--enable-preview")
}

// Update the compileGem task
tasks.register<JavaExec>("compileGem") {
    dependsOn("jar")
    mainClass.set("GemCompiler")
    classpath = sourceSets.main.get().runtimeClasspath
    jvmArgs("--enable-preview")

    // Accept command line arguments
    if (project.hasProperty("file")) {
        args = listOf(project.property("file").toString())
    } else {
        println("Please provide a Gem file: -Pfile=samples/hello.gem")
    }
}

sourceSets {
    main {
        java {
            srcDir("src/main/java")
        }
    }
}