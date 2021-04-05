plugins {
    id("groovy")
}

dependencies {
    implementation(gradleApi())
    implementation(localGroovy())
}

group = rootProject.group
version = rootProject.version