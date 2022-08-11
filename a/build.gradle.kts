plugins {
    id("acme.convention.java-library")
}

dependencies {
    implementation(project(":b"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testImplementation(project(path = ":b", configuration = "tests"))
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
}
