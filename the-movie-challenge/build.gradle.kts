import dependencies.StandardLibraries

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "dev.analuiza.the_movie_challenge"
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

    implementation(StandardLibraries.core_ktx)
    implementation(StandardLibraries.appcompat)
    implementation(StandardLibraries.material_design)
    implementation(StandardLibraries.constraintlayout)
    testImplementation(StandardLibraries.junit4)
    androidTestImplementation(StandardLibraries.androidx_test_ext)
    androidTestImplementation(StandardLibraries.espresso_core)
}
