# SVJ App

Android app for Sportverein Jestetten 1920 e.V. (SV Jestetten).

## Overview

This is a native Android app that provides easy access to the content and features of
[sv-jestetten.de](https://www.sv-jestetten.de) in a convenient mobile format.

## Features

- **News** – Latest club news and match reports
- **Teams** – Overview of all teams (1st/2nd men's teams, youth squads)
- **Schedule** – Fixtures, results, and league tables
- **Contact** – Club information, address, and contact details

## Design

The app uses the club's official colors (Red #CC0000 and White) throughout the Material 3
design system, giving it a consistent look that matches the SV Jestetten brand.

## Tech Stack

- **Language**: Kotlin
- **UI**: Jetpack Compose + Material 3
- **Navigation**: Compose Navigation
- **Min SDK**: 24 (Android 7.0)
- **Target SDK**: 34 (Android 14)

## Building

```bash
./gradlew assembleDebug
```

## Running Tests

```bash
./gradlew test
./gradlew connectedAndroidTest
```
