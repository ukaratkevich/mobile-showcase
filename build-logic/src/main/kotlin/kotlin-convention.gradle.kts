import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("android")
}

tasks.withType(KotlinCompile::class) {
    val kotlinVersion = libs.versions.kotlin.language.version.get()
    val jvmTarget = libs.versions.jvm.target.get()

    kotlinOptions {
        languageVersion = kotlinVersion
        this.jvmTarget = jvmTarget

        allWarningsAsErrors = false

        freeCompilerArgs = freeCompilerArgs + listOf(
            // add experimental api here
            "-opt-in=kotlin.RequiresOptIn",
        )
    }
}
