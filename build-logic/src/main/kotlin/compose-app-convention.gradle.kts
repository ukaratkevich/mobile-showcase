import com.android.build.api.dsl.ApplicationExtension

plugins {
    id("android-application-base-convention")
}

configure<ApplicationExtension> {
    // TODO set up later

    dependencies {
        add("implementation", libs.compose.bom)
    }
}
