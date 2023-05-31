import com.android.build.api.dsl.ApplicationExtension

plugins {
    id("android-application-base-convention")
}

configure<ApplicationExtension> {
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }

    dependencies {
        add("implementation", libs.compose.bom)
    }
}
