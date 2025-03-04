plugins {
    kotlin("jvm") version "2.1.10"
    java
    application
}

application.mainClass.set("mutex.VisualiseKt")

repositories {
    mavenCentral()
}

dependencies {
    implementation("ch.qos.logback:logback-classic:1.2.10")
    testImplementation(kotlin("test-junit"))
}

sourceSets.main {
    java.srcDir("src")
}

sourceSets.test {
    java.srcDir("test")
}

kotlin {
    jvmToolchain(21)
}
