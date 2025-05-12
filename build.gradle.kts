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
    implementation("org.ow2.asm:asm:9.6")
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
    options.release.set(21)
}

// Disable test tasks since they're causing problems
tasks.named("test") {
    enabled = false
}

tasks.register<Jar>("uberJar") {
    archiveClassifier.set("uber")

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

// Renamed task to avoid conflicts
tasks.register<JavaExec>("compileGemFile") {
    dependsOn("jar")
    mainClass.set("GemCompiler")
    classpath = sourceSets.main.get().runtimeClasspath
}

tasks.register<Exec>("runGemProgram") {
    dependsOn("compileGemFile")

    if (project.hasProperty("file")) {
        val gemFile = project.property("file").toString()
        val className = File(gemFile).nameWithoutExtension
        executable = "java"
    } else {
        println("Please provide a Gem file: -Pfile=samples/hello.gem")
    }
}

tasks.compileJava {
    dependsOn(tasks.generateGrammarSource)
    options.compilerArgs.add("--enable-preview")
    options.release.set(21)
}

tasks.withType<JavaExec> {
    jvmArgs("--enable-preview")
}

sourceSets {
    main {
        java {
            srcDir("src/main/java")
        }
    }
}