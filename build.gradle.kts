plugins {
    kotlin("jvm") version "1.8.21"
    application
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.jetbrains.kotlin:kotlin-stdlib'
    testImplementation 'junit:junit:4.13.2'
}

tasks.test {

}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}