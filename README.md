# cap4k Template

This repository is the official four-module starting point for a cap4k project.

## Requirements

- JDK 17

## Create a project

Use this repository as a GitHub Template or download it, then optionally rename the local directory and the default `com.example.demo` package once for your project. Keep the package used by `DemoApplication`, its test, and `cap4k.project.basePackage` aligned.

The Gradle root project name follows the local directory name; the build does not set `rootProject.name`.

## Build

```bash
./gradlew build
```

On Windows:

```powershell
.\gradlew.bat build
```

## Run

```bash
./gradlew :start:bootRun
```

## Generate sources

The empty project has no schema or design input, so source generation is a successful no-op. A normal build runs the build-owned `cap4kGenerateSources` task automatically.

After adding the inputs needed by your project to the root `cap4k` configuration, inspect the plan before writing controlled source files:

```bash
./gradlew cap4kPlan
./gradlew cap4kGenerate
```

Repeatable generated sources under `build/generated` remain wired into module compilation through `cap4kGenerateSources`.
