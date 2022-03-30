import dependencies.Dependencies
import dependencies.TestDependencies

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "dev.analuiza.learning"
        minSdk = 26
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = TestDependencies.instrumentation_runner
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(Dependencies.appcompat)
    implementation(Dependencies.constraintlayout)
    implementation(Dependencies.dagger)
    kapt(Dependencies.dagger_compiler)
    implementation(Dependencies.gson)
    implementation(Dependencies.kotlin_standard_library)
    implementation(Dependencies.kotlin_reflect)
    implementation(Dependencies.ktx)
    implementation(Dependencies.legacy_support)
    implementation(Dependencies.material_design)
    implementation(Dependencies.navigation_fragment)
    implementation(Dependencies.navigation_ui)
    implementation(Dependencies.navigation_dynamic)
    implementation(Dependencies.room_runtime)
    implementation(Dependencies.room_ktx)
    kapt(Dependencies.room_compiler)


    //tests
    testImplementation(TestDependencies.junit4)
    androidTestImplementation(TestDependencies.espresso_core)
    androidTestImplementation(TestDependencies.androidx_test_ext)
}