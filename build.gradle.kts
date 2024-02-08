// Top-level build file where you can add configuration options common to all sub-projects/modules.
@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    libs.plugins.run{
        alias(androidApplication) apply false
//        alias(google.services) apply false
        alias(firebase.crashlytics) apply false
        alias(com.android.library) apply false
        alias(kotlinAndroid) apply false
        alias(hilt.plugin) apply false
        alias(ksp) apply false
        alias(kotlin.parcelize) apply false
    }
}
true // Needed to make the Suppress annotation work for the plugins block