rootProject.name = "gradle-self-conflict-issue"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(":a")
include(":b")
