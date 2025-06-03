# CurlView Test

![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-03DAC5?logo=android&logoColor=white)
![PageCurl](https://img.shields.io/badge/PageCurl-000000?logo=github&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?logo=androidstudio&logoColor=white)

Mini Android test of the **CurlView** component implementation from the **PageCurl** library developed by **Oleksandr Balan** https://github.com/oleksandrbalan/pagecurl.

Developed in Kotlin with **Jetpack Compose**, this project tests the integration of the **PageCurl** library into an Android app, to avoid direct manipulation of OpenGL via an **AndroidView**.

---


## 🚀 Project Overview

**Context**:  
The goal is to test the integration of the **PageCurl** library developed by **Oleksandr Balan**. This library allows the creation of page-turning animations in an Android app while being **Compose-friendly**, which eliminates the need to manipulate OpenGL directly.

**Mission**:  
- Test the basic implementation of **CurlView**.
- Explore and use the new features of version 1.5.1 of the library.
- Create a functional demo applied to the first 12 pages of a manga to evaluate performance, especially with larger **.jpg** images.
- The goal is not to reinvent the wheel but to test and validate the implementation of an existing library.

---

## ⚙️ Main Features

- **Basic CurlView Implementation**: Test if the page-turning animation works correctly with a simple setup.
- **Exploring New Features of Version 1.5.1**: Use the new options offered by the library to enhance the page-turning effect.
- **Functional Demo**: Apply the library to a manga to test fluidity and performance with larger **.jpg** images.
- **Performance Testing**: Evaluate the impact of the library on performance with large images and test the smoothness of the animation.

---

## 📈 Tasks Completed

| Step | Objectives | Results |
| :--- | :--- | :--- |
| **Project Initialization** | Set up the PageCurl library in a Compose project | Functional project structure |
| **Basic CurlView Test** | Simple implementation of page-turning effect | Smooth and stable animation |
| **Exploring Version 1.5.1** | Implement new features of the library | Utilized new options and performance tested |
| **Manga Demo** | Apply the library to the first pages of a manga to test performance with large images | Functional demo with tests on **.jpg** images |


---

## 🛠️ Tech Stack

- **Language**: Kotlin
- **UI**: Jetpack Compose
- **Main Library**: PageCurl (https://github.com/oleksandrbalan/pagecurl)
- **Performance Testing**: No specific performance testing conducted, but fluency was checked with larger images
- **IDE**: Android Studio

---

## 📸 Screenshots

| Demo 1 | Demo 2 | Demo 3 |
|:---:|:---:|:---:|
| ![D1](screenshots/demo1.gif) | ![D2](screenshots/demo2.gif) | ![D3](screenshots/demo3.gif) |

---

## 🎯 Final Result

✅ **Test of the PageCurl library** successful with smooth integration into a Compose project.  
✅ **New features of version 1.5.1** tested and integrated successfully.  
✅ **Manga demo** with performance tested, allowing evaluation of page-turning animations with larger **.jpg** images.  
✅ **No direct OpenGL manipulation** required thanks to the Compose-friendly architecture of the library.

---


