import dependencies.Dependencies
import dependencies.TestDependencies

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
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
}

dependencies {

    implementation(Dependencies.appcompat)
    implementation(Dependencies.constraintlayout)
    implementation(Dependencies.dagger)
    implementation(Dependencies.glide)
    implementation(Dependencies.ktx)
    implementation(Dependencies.kotlin_coroutines)
    implementation(Dependencies.kotlin_coroutines_android)
    implementation(Dependencies.lifecycle_viewModel)
    implementation(Dependencies.lifecycle_runtime)
    implementation(Dependencies.lifecycle_compiler)
    implementation(Dependencies.material_design)
    implementation(Dependencies.retrofit)
    implementation(Dependencies.retrofit_gson)


    androidTestImplementation(TestDependencies.androidx_test_ext)
    androidTestImplementation(TestDependencies.espresso_core)
    testImplementation(TestDependencies.junit4)

}