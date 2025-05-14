# Simple Volume Controller for Android

A straightforward Android application designed to provide users with quick and easy control over various system volume streams directly from a single interface. The user interface is currently available in Japanese only.

## Overview

This app presents a user-friendly interface with individual sliders (SeekBars) to adjust the following audio volumes on an Android device:
- Media Volume
- Call Volume
- Ringer and Notification Volume
- Alarm Volume

It's built with simplicity in mind, allowing users to manage their device's sound profiles efficiently.

## Features

- **Intuitive UI:** Clean interface with clearly labeled SeekBars for each volume type.
- **Comprehensive Control:** Adjusts the four main system audio streams.
- **Real-time Adjustment:** Volume changes are applied instantly as the user interacts with the SeekBars.
- **Lightweight:** A simple app focused HSPB (on doing one thing well).

## Screenshots

![screen1](https://github.com/silkycove/VolumeControlApp/blob/4eb60e75e9c94140aa084e16ebb5b7ef28ce9580/screen.png)

## Built With

* [Android SDK](https://developer.android.com/sdk)
* [Kotlin](https://kotlinlang.org/) - Primary programming language.
* [Android Studio](https://developer.android.com/studio) - Official IDE for Android development.
* [View Binding](https://developer.android.com/topic/libraries/view-binding) - For easily accessing views in the layout.
* [Material Components for Android](https://material.io/develop/android/docs/getting-started) - For UI elements like SeekBars.

## Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

* Android Studio (latest stable version recommended, e.g., 2022.2 "Flamingo" or newer)
* An Android device or emulator running API level 21 (Android 5.0 Lollipop) or higher.

### Installation

1.  **Clone the repository:**
    ```sh
    git clone https://github.com/silkycove/VolumeControlApp.git
    ```
2.  **Open in Android Studio:**
    * Launch Android Studio.
    * Select "Open" or "Open an Existing Project".
    * Navigate to the cloned repository directory and select it.
3.  **Build the project:**
    * Allow Android Studio to sync and build the project. This may take a few minutes.
    * Once synced, you can run the app on an emulator or a connected Android device by clicking the "Run 'app'" button (green play icon).

## Usage

1.  Launch the app on your Android device.
2.  You will see sliders for "Media Volume," "Call Volume," "Ringer and Notification Volume," and "Alarm Volume."
3.  Drag the slider (for each volume type) to your desired level.
4.  The changes will take effect immediately.

## Roadmap / Future Enhancements

* **Smoother SeekBar animations/transitions:** Improve the visual feedback and smoothness of the sliders. (As mentioned by the user)
* **Theme options:** Allow users to switch between light/dark themes or choose accent colors.
* **Persistent settings:** Save the last set volume levels and restore them on app launch (optional, as system volumes are generally managed by the OS).
* **Quick mute/unmute buttons:** Add buttons for instantly muting/unmuting specific volume streams.
* **Widget support:** Provide a home screen widget for quick volume adjustments.

See the [open issues](https://github.com/silkycove/VolumeControlApp/issues) for a full list of proposed features (and known issues).

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1.  Fork the Project
2.  Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3.  Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4.  Push to the Branch (`git push origin feature/AmazingFeature`)
5.  Open a Pull Request

## License

See `LICENSE.txt` for more information.

## Contact

Project Link: [https://github.com/silkycove/VolumeControlApp](https://github.com/silkycove/VolumeControlApp)
