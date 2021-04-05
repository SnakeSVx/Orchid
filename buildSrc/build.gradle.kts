plugins {
    java
    `kotlin-dsl`
}

allprojects {
    apply(from = "${rootProject.rootDir}/../gradle/actions/repositories.gradle")
    apply(from = "${rootProject.rootDir}/../gradle/actions/publish.gradle")
}

group = "io.github.orchid-revival"

dependencies {
    runtimeOnly(project(":orchidPlugin"))
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}
