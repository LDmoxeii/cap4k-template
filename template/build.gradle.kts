
plugins {
    id("buildsrc.convention.kotlin-jvm")
    id("com.only4.cap4k.ddd.codegen")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

kotlin {
    jvmToolchain(17)
}

cap4kCodegen {
    basePackage.set("com.example.demo")
    archTemplate.set("cap4k-ddd-codegen-template-multi-nested.json")

    database {
        url.set("jdbc:mysql://localhost:3306/demo_db?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai")
        username.set("root")
        password.set("123456")
        schema.set("demo_db")
    }

    generation {
        versionField.set("version")
        deletedField.set("deleted")
        readonlyFields.set("id,created_at,updated_at")
        ignoreFields.set("")
    }
}
