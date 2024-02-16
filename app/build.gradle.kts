@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    libs.plugins.run {
        alias(androidApplication)
        alias(hilt.plugin)
        alias(kotlinAndroid)
        alias(ksp)
        alias(kotlin.parcelize)
//        alias(google.services)
        alias(firebase.crashlytics)
    }
}

android {
    namespace = "com.example.melovibe"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.melovibe"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.8"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    libs.run {
        //junit
        testImplementation(junit)
        //test
        androidTestImplementation(bundles.test)
        //core
        implementation(androidx.core)
        //compose
        implementation(platform(androidx.compose.bom))
        androidTestImplementation(platform(androidx.compose.bom))
        debugImplementation(ui.tooling)
        implementation(bundles.compose)
        //room
        implementation(bundles.room)
        annotationProcessor(androidx.room.compiler)
        ksp(androidx.room.compiler)
        //hilt
        implementation(bundles.hilt)
        ksp(hilt.compiler)
        //navigation
        implementation(bundles.navigation)
        //timber
        implementation(timber)
        //lifecycle
        implementation(bundles.lifecycle)
        //firebase
        implementation(platform(firebaseBom))
//        implementation(bundles.firebase)
        //swipe
        implementation(swipe)
        //pager
        implementation(bundles.accompanist)
        //media
        implementation(bundles.media)
    }
}