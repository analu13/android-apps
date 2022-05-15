package dependencies

object StandardLibraries {
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    val material_design = "com.google.android.material:material:${Versions.material_design}"

    // Test Standard Libraries
    val junit4 = "junit:junit:${Versions.junit4}"
    val androidx_test_ext = "androidx.test.ext:junit:${Versions.androidx_test_ext}"
    val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
}
