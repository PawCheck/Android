// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("com.google.dagger.hilt.android") version "2.51.1" apply false
    id("com.google.devtools.ksp") version "2.0.21-1.0.26" apply false
}
buildscript {
    dependencies {
        classpath(libs.com.google.devtools.ksp.gradle.plugin)
        classpath(libs.hilt.android.gradle.plugin)
    }
}