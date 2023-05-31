plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.kotlin.plugin)
    implementation(libs.agp)

    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}