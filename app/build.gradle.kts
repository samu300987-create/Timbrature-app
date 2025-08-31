plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }

android {
    namespace = "it.sam.timbrature"
    compileSdk = 34
    defaultConfig { minSdk = 26; targetSdk = 34 }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.activity:activity-compose:1.9.2")
}