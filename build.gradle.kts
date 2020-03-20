import org.jetbrains.kotlin.gradle.tasks.*

group = "ru.ifmo.pds"
version = "1.0-SNAPSHOT"

plugins {
    kotlin("jvm") version "1.3.70"
    application
}

application.mainClassName = "mutex.VisualiseKt"

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("ch.qos.logback:logback-classic:1.2.3")
    testImplementation(kotlin("test-junit"))
}

sourceSets {
    main {
        java.setSrcDirs(listOf("src"))
    }
    test {
        java.setSrcDirs(listOf("test"))
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
    }
}
