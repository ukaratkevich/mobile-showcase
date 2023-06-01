enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "mobile-showcase"

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        google()
        mavenCentral()
    }

    versionCatalogs {
        create("libs")
    }
}

includeBuild("build-logic")

include(":hello-compose")
