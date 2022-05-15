import dependencies.Dependencies
import dependencies.StandardLibraries

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "dev.analuiza.mvi_animals"
        minSdk = 26
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(StandardLibraries.appcompat)
    implementation(StandardLibraries.core_ktx)
    implementation(StandardLibraries.constraintlayout)
    implementation(StandardLibraries.material_design)

    implementation(Dependencies.coroutines_core)
    implementation(Dependencies.coroutines_android)
    implementation(Dependencies.glide)
    implementation(Dependencies.lifecycle_viewModel_ktx)
    implementation(Dependencies.lifecycle_runtime_ktx)
    implementation(Dependencies.lifecycle_livedata_ktx)
    implementation(Dependencies.retrofit)
    implementation(Dependencies.retrofit_gson)

    androidTestImplementation(StandardLibraries.androidx_test_ext)
    androidTestImplementation(StandardLibraries.espresso_core)
    testImplementation(StandardLibraries.junit4)
}
