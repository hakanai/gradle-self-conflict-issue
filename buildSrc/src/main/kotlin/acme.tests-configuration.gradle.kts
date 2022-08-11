// Simulates what legacy plugin is doing to add tests configuration

plugins {
    java
}

configurations {
    register("tests") {
        extendsFrom(configurations["testRuntimeClasspath"])
    }
}

val testJar by tasks.registering(Jar::class) {
    dependsOn("testClasses")
    group = "build"
    archiveClassifier.set("test")
    from(sourceSets["test"].output)
}

artifacts.add("tests", testJar)
