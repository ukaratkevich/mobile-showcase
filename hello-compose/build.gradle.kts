plugins {
    id("compose-app-convention")
}

android {
    namespace = "dev.karatkevich.mobile.showcase.hello.compose"

    defaultConfig {
        applicationId = "dev.karatkevich.mobile.showcase.hello.compose"
        versionCode = 1
        versionName = "1.0"
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
    implementation(libs.compose.activity)
    implementation(libs.compose.material)
    implementation(libs.compose.foundation)
}