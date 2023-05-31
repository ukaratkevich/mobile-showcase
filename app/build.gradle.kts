plugins {
    id("compose-app-convention")
}

android {
    namespace = "dev.karatkevich.mobile.showcase"

    defaultConfig {
        applicationId = "dev.karatkevich.mobile.showcase"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation("com.google.android.material:material:1.9.0")
}