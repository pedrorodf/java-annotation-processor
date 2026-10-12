plugins {
    id("java")
    id("idea")
}

subprojects {
    apply(plugin = "idea")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

}

tasks.test {
    useJUnitPlatform()
}