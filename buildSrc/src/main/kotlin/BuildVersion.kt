object BuildVersion {
    object environment {
        private const val majorVersion = 1
        private const val minorVersion = 0
        private const val bugfixVersion = 0

        const val minSdkVersion = 23
        const val compileSdkVersion = 33
        const val targetSdkVersion = 33
        const val applicationId = "io.github.afalalabarce.mvvmproject"
        const val appVersionCode = majorVersion * 1000 + minorVersion * 100 + bugfixVersion
        const val appVersionName = "${majorVersion}.${minorVersion}.$bugfixVersion"
    }

    object gradleCatalog {
        const val versionId = "0.41.0"
        const val littleRobotsVersion = "0.7.0"
    }

    object devTools {
        const val kotlinVersion = "1.8.0"
        const val gradleVersion = "7.4.1"
        const val kspVersion = "1.8.0-1.0.9"
        const val koinKspVersion = "1.0.1"
        const val googleServicesVersion = "4.3.15"
        const val timberVersion = "5.0.1"
    }

    object dependencyInjection {
        const val hiltVersion = "2.44"
        const val hiltNavigationComposeVersion = "1.0.0"
        const val koinVersion = "3.3.3"
        const val koinKspVersion = "1.0.1"
        const val koinAnnotationsVersion = "1.1.1"
    }

    object core {
        const val coreKtx = "1.9.0"
        const val runtimeKtx = "2.5.1"
        const val lifecycleVersion = "2.5.1"
        const val lifecycleExtensions = "2.2.0"

        const val desugaringVersion = "1.2.0"
        const val multidexVersion = "2.0.1"
    }

    object coroutines {
        const val coroutinesVersion = "1.6.4"
    }

    object compose {
        const val runtimeVersion = "1.3.3"
        const val animationVersion = "1.3.3"
        const val materialVersion = "1.3.1"
        const val materialIconsVersion = "1.3.1"
        const val material3Version = "1.0.1"
        const val compilerVersion = "1.4.0"
        const val activityVersion = "1.6.1"
        const val navigationVersion = "2.5.3"
        const val afalabarceComposeVersion = "1.4.4"
    }

    object accompanist {
        const val runtimeVersion = "0.26.1-alpha"
        const val biometricVersion = "1.2.0-alpha05"
    }

    object utilities {
        const val coilVersion = "2.1.0"
        const val splashScreenVersion = "1.0.0"
        const val gsonVersion = "2.9.1"
        const val paging3Version = "3.1.1"
    }

    object dataSource {
        const val retrofitVersion = "2.9.0"
        const val okHttpVersion = "4.9.3"
        const val roomVersion = "2.5.0"
        const val jetPackDataStoreVersion = "1.0.0"
    }

    object testing {
        const val jUnitVersion = "5.8.2"
        const val jUnitExtVersion = "1.1.5"
        const val espressoVersion = "3.5.1"
        const val roboelectricVersion = "4.8.1"
        const val mockKVersion = "1.12.5"
        const val kluentVersion = "1.68"
        const val coroutineTest = "1.6.0"
        const val archCoreTest = "2.2.0"
        const val coreTest = "1.5.0"
        const val kakaoVersion = "2.1.0"
        const val mannodermausJUnit5Version = "1.3.0"
        const val mannodermausVersion = "1.8.2.1"
        
    }
    object jacocoSettings{
        const val jacocoVersion = "0.8.8"
        val codeCoverageExclusions = listOf(
            // data binding
            "android/databinding/**/*.class",
            "**/databinding/*Binding.class",
            "**/android/databinding/*Binding.class",
            "**/android/databinding/*",
            "**/androidx/databinding/*",
            "**/BR.*",
            // android
            "**/R.class",
            "**/R2*.*",
            "**/R2.class",
            "**/R2$*.class",
            "**/R$*.class",
            "**/BuildConfig.*",
            "**/Manifest*.*",
            "**/*Test*.*",
            "android/**/*.*",
            "androidx/**/*.*",
            "com/android/**/*.*",
            "com/google/**/*.*",
            // kotlin
            "**/*MapperImpl*.*",
            "**/*\$ViewInjector*.*",
            "**/*\$ViewBinder*.*",
            "**/*Component*.*",
            "**/*BR*.*",
            "**/*\$Lambda$*.*",
            "**/*Companion*.*",
            "**/*Module*.*",
            "**/*Dagger*.*",
            "**/*Hilt*.*",
            "**/*Koin*.*",
            "**/*MembersInjector*.*",
            "**/*_MembersInjector.class",
            "**/*_Factory*.*",
            "**/*_Provide*Factory*.*",
            "**/*_ViewBinding*.*",
            //"**/*Extensions*.*",
            // sealed and data classes
            "**/*\$Result.*",
            "**/*\$Result$*.*",
            // adapters generated by moshi
            "**/*JsonAdapter.*",
            // others
            "**/AutoValue_*.*",
            "**/*Directions$*",
            "**/*Directions.*",
            "**/*JavascriptBridge.class",
            "**/*\$InjectAdapter.class",
            "**/*\$ModuleAdapter.class",
            "**/*Mock*.*", // Mock classes
        )
    }
}