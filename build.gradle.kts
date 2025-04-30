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
sourceSets {
    main {
        java {
            srcDir("src/main/java")
        }
    }
}