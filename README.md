# cap4k 项目模板

[![使用此模板](https://img.shields.io/badge/%E4%BD%BF%E7%94%A8%E6%AD%A4%E6%A8%A1%E6%9D%BF-2ea44f?style=for-the-badge&logo=github)](https://github.com/LDmoxeii/cap4k-template/generate)

点击上方按钮，基于 cap4k 官方模板创建你自己的项目仓库。创建完成后，将新仓库克隆到本地，就可以开始设计领域模型。

本仓库是 cap4k 官方四模块项目起点。

## 环境要求

- JDK 17

## 创建项目

通过上方按钮使用 GitHub Template 创建项目，也可以直接下载本仓库。创建后，可以按项目需要一次性重命名本地目录和默认包名 `com.example.demo`。

请保持 `DemoApplication`、启动测试以及 `cap4k.project.basePackage` 使用的包名一致。

Gradle 根项目名称会跟随本地目录名；构建配置不会固定设置 `rootProject.name`。

## 构建

```bash
./gradlew build
```

Windows：

```powershell
.\gradlew.bat build
```

## 启动

```bash
./gradlew :start:bootRun
```

## 生成源码

初始空项目不包含 schema 或 design 输入，因此源码生成会成功执行并保持 no-op。普通构建会自动运行 build-owned 的 `cap4kGenerateSources` 任务。

在根 `cap4k` 配置中加入项目需要的输入后，先检查生成计划，再写入受控源码：

```bash
./gradlew cap4kPlan
./gradlew cap4kGenerate
```

`build/generated` 下的可重复生成源码会通过 `cap4kGenerateSources` 自动接入对应模块的编译过程。
