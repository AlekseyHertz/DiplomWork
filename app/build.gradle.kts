plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-android")
    id("kotlin-kapt")
    //id("com.google.gms.google-services")
    //id("com.google.dagger.hilt.android")
}

android {
    namespace = "ru.netology.diplomprogect"
    compileSdk = 34

    defaultConfig {
        applicationId = "ru.netology.diplomprogect"
        minSdk = 27
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
            //manifestPlaceholders.usesCleartextTraffic = false
            buildConfigField("String", "BASE_URL", "\"https://nmedia.netology.com/\"")
        }
        debug {
            //manifestPlaceholders.usesCleartextTraffic = true
            buildConfigField("String", "BASE_URL", "\"http://10.0.2.2:9999\"")
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
        viewBinding = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {


    //Base
    implementation ("androidx.core:core-ktx:1.12.0")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("com.google.android.material:material:1.11.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation ("androidx.recyclerview:recyclerview:1.3.2")
    implementation ("androidx.activity:activity-ktx:1.8.2")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("androidx.fragment:fragment-ktx:1.6.2")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.7")
    //Gson use and convert
    implementation ("com.google.code.gson:gson:2.10.1")
    //ROOM library
    implementation ("androidx.room:room-runtime:2.9.8")
    implementation ("androidx.room:room-ktx:2.9.8")
    implementation ("androidx.room:room-paging:2.9.8")
    //noinspection KaptUsageInsteadOfKsp
    kapt ("androidx.room:room-compiler:2.9.8")
    //Firebase
    implementation ("com.google.firebase:firebase-bom:32.7.3")
    implementation ("com.google.firebase:firebase-messaging-ktx")
    //Google Services
    implementation ("com.google.android.gms:play-services-base:18.3.0")
    //Glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    //Retrofit and OkHttp
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.11.0")
    //LiveData для работы Flow-> LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    //Image Picker from device camera
    implementation ("com.github.dhaval2404:imagepicker:2.1")
    //Google play services Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.7.3")
    //Worker Implementation
    implementation ("androidx.work:work-runtime-ktx:2.9.8")
    //Hilt
    implementation ("com.google.dagger:hilt-android:2.48.1")
    kapt ("com.google.dagger:hilt-compiler:2.48.1")
    //Paging
    implementation ("androidx.paging:paging-runtime-ktx:3.2.1")
    //Round images
    implementation ("de.hdodenhof:circleimageview:3.1.0")
}