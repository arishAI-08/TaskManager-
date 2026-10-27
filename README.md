# 📋 TaskManager App

A modern Android application built with Java and XML layouts designed to help users efficiently manage their tasks, track daily progress, and stay organized.

---

## ✨ Features

- **User Authentication Flow**:
  - **Splash Screen**: Branded launch screen.
  - **Login & Registration**: Secure user sign-in and account creation.
  - **Password Recovery**: Forgot Password & Reset Password workflows.
- **Task Management**:
  - **Add Task**: Create new tasks with title, description, due date, and priority.
  - **Task List & RecyclerView**: View, organize, and manage active and completed tasks.
  - **Task Items**: Custom list item cards with intuitive Material UI.
- **User Profile & Progress**:
  - **Profile Management**: View and update user account details.
  - **Progress Tracking**: Monitor task completion rates and productivity metrics.

---

## 🛠️ Tech Stack & Architecture

- **Language**: Java
- **UI Toolkit**: Android Views & XML Layouts with Material Design components
- **Components**:
  - `RecyclerView` & custom `TaskAdapter` for dynamic task lists
  - Intents for seamless navigation across activities

---

## 📱 App Screens & Activities

| Activity | Description |
| :--- | :--- |
| `SplashActivity` | Initial entry point and branding screen |
| `LoginActivity` | User authentication screen |
| `RegisterActivity` | New user account creation |
| `ForgotPasswordActivity` | Password recovery initiation |
| `ResetPasswordActivity` | Password update screen |
| `MainActivity` | Main dashboard / home hub |
| `AddTaskActivity` | Create and schedule new tasks |
| `TaskListActivity` | Browse and manage all tasks |
| `ProfileActivity` | User profile settings and information |
| `ProgressActivity` | Visual analytics and task completion tracking |

---

## 🚀 Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/arishAI-08/TaskManager-.git
   ```
2. Open the project in **Android Studio**.
3. Sync Gradle and run the app on an Android Emulator or physical device.
