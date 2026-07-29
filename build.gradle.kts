plugins {
    alias(libs.plugins.cap4k.pipeline)
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.spring) apply false
    alias(libs.plugins.kotlin.jpa) apply false
    alias(libs.plugins.spring.boot) apply false
}

cap4k {
    project {
        basePackage.set("com.example.demo")
        domainModulePath.set("domain")
        applicationModulePath.set("application")
        adapterModulePath.set("adapter")
    }
}
