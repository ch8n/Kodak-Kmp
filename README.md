# Kodak-KMP 📸 - Work In Progress

Kodak-KMP is a Kotlin Multiplatform project that implements an image loading library from scratch using Jetpack Compose. This library supports multiple platforms, including Android, iOS, Desktop, and Web (Wasm). It offers efficient, asynchronous image loading with robust caching and memory management mechanisms.

## 🌍 Supported Platforms

- **Android**
- **iOS**
- **Desktop**
- **Web (Wasm)**

## 🛠 Features

- **Asynchronous Image Loading**: Load images from a URL asynchronously using Ktor and Coroutines.
- **Jetpack Compose Compatibility**: Seamlessly integrates with Jetpack Compose for modern UI development.
- **Image Placeholder**: Displays placeholders for both loading and error states to enhance user experience.
- **Caching Mechanism**: Implements both memory and disk caching to optimize loading times and reduce redundant network calls.
- **Memory Management**: Efficiently manages memory by avoiding loading high-quality or raw images unnecessarily.

## 🏗 Functional Requirements

1. **Asynchronous Image Loading from URL**: Fetch images from remote servers without blocking the main thread.
2. **Compatible with Jetpack Compose**: Fully compatible with Jetpack Compose for all target platforms.
3. **Image Placeholder**: Show placeholders during image loading and in case of loading errors.
4. **Caching Mechanism**: Utilize both memory and disk caching strategies to store images.
5. **Memory Management**: Optimize memory usage by preventing the loading of high-quality or raw images when not needed.

## How to use?

### Installation
* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html),
[Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform),
[Kotlin/Wasm](https://kotl.in/wasm/)…

We would appreciate your feedback on Compose/Web and Kotlin/Wasm in the public Slack channel [#compose-web](https://slack-chats.kotlinlang.org/c/compose-web).
If you face any issues, please report them on [GitHub](https://github.com/JetBrains/compose-multiplatform/issues).

You can open the web application by running the `:composeApp:wasmJsBrowserDevelopmentRun` Gradle task.