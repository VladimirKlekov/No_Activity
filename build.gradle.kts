// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id("com.google.dagger.hilt.android") version "2.44" apply false
}
buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
    }
}


