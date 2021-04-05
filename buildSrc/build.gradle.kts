plugins {
    java
    `kotlin-dsl`
}

allprojects {
    apply(from = "${rootProject.rootDir}/../gradle/actions/repositories.gradle")
}

group = "io.github.orchid-revival"

tasks.create("publishPlugins") {
    doLast {}
}

dependencies {
    runtimeOnly(project(":orchidPlugin"))
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}
