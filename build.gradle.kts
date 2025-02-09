import org.jetbrains.kotlin.fir.declarations.builder.buildScript

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(libs.dagger.classpath)
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}
