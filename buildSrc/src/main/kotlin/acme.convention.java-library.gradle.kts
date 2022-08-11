plugins {
    `java-library`
    `java-test-fixtures`
    id("acme.tests-configuration")
}

tasks.test {
    useJUnitPlatform()
}
