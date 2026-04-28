plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "pt.ipt.dama2026.camerax"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "pt.ipt.dama2026.camerax"
        minSdk = 28
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    // CameraX core library using the camera2 implementation
    // val cameraxVersion = "1.3.3"
    // The following line is optional, as the core library is included indirectly by camera-camera2
    // implementation("androidx.camera:camera-core:${cameraxVersion}")
    // implementation("androidx.camera:camera-camera2:${cameraxVersion}")
    implementation(libs.androidx.camera.core)
    implementation(libs.androidx.camera.camera2)
    // If you want to additionally use the CameraX Lifecycle library
    // implementation("androidx.camera:camera-lifecycle:${cameraxVersion}")
    implementation(libs.androidx.camera.lifecycle)
    // If you want to additionally use the CameraX VideoCapture library
    //    implementation "androidx.camera:camera-video:${camerax_version}"
    // If you want to additionally use the CameraX View class
    // implementation("androidx.camera:camera-view:${cameraxVersion}")
    implementation(libs.androidx.camera.view)
    // If you want to additionally add CameraX ML Kit Vision Integration
    //       implementation "androidx.camera:camera-mlkit-vision:${camerax_version}"
    // If you want to additionally use the CameraX Extensions library
    // implementation("androidx.camera:camera-extensions:${cameraxVersion}")
    implementation(libs.androidx.camera.extensions1)


    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}