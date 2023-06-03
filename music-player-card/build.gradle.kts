plugins {
    id("compose-app-convention")
}

android {
    namespace = "dev.karatkevich.mobile.showcase.music.player.card"

    defaultConfig {
        applicationId = "dev.karatkevich.mobile.showcase.music.player.card"
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
    implementation(libs.coil.compose)
    implementation(libs.androidx.pallete)
}
