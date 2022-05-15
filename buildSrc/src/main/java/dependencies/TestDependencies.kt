package dependencies

object TestDependencies {
    val coroutines_test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines_version}"
    val espresso_contrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso_core}"
    val fragment_testing = "androidx.fragment:fragment-testing:${Versions.fragment_version}"
    val idling_resource = "androidx.test.espresso:espresso-idling-resource:${Versions.espresso_idling_resource}"
    val jupiter_api = "org.junit.jupiter:junit-jupiter-api:${Versions.junit_jupiter_version}"
    val jupiter_params = "org.junit.jupiter:junit-jupiter-params:${Versions.junit_jupiter_version}"
    val jupiter_engine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit_jupiter_version}"
    val kotlin_test = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    val mockk_android = "io.mockk:mockk-android:${Versions.mockk_version}"
    val mockk = "io.mockk:mockk:${Versions.mockk_version}"
    val navigation_testing = "androidx.navigation:navigation-testing:${Versions.navigation_components}"
    val test_runner = "androidx.test:runner:${Versions.test_runner}"
    val test_rules = "androidx.test:rules:${Versions.test_runner}"
    val text_core_ktx = "androidx.test:core-ktx:${Versions.test_core}"
}
