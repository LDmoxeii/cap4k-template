plugins {
    kotlin("jvm") version "2.1.20"
    id("com.only4.cap4k.ddd.codegen") version "0.3.2-SNAPSHOT"
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
    archTemplateFile.set(file("cap4k-ddd-codegen-template-multi-nested.json"))
    designFiles.from(
        file("design/role/_gen.txt"),
        file("design/role/_gen_01.txt"),
    )

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
