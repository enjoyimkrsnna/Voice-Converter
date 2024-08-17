# Voice Converter Android Application

This Android application is designed to facilitate communication for individuals with hearing and speech disabilities. It includes features for real-time text-to-speech, speech-to-text conversion, voice recording, and text translation. The app aims to provide seamless and accessible communication solutions.

## Features

### 1. Voice Recorder
- **Record Audio**: Use `MediaRecorder` to capture audio.
- **Play Audio**: Use `MediaPlayer` to play recorded audio.
- **Control Buttons**: Includes buttons to start/stop recording and playback.
- **Service Notifications**: Notifications for recording and playback services.

### 2. Speech-to-Text
- **Real-Time Conversion**: Convert spoken words into text using `RecognizerIntent`.
- **Display**: Recognized text is shown in a `TextView`.
- **Language Support**: Supports multiple languages for speech recognition.

### 3. Text-to-Speech
- **Convert Text**: Convert text input into speech using `TextToSpeech`.
- **Language Selection**: Supports various languages and accents.
- **Playback Control**: Play and pause the spoken text.

### 4. Translator
- **Text Translation**: Translate text into multiple languages using `TranslateAPI`.
- **Supported Languages**: Includes languages like Hindi, Gujarati, Telugu, Italian, Japanese, German, and French.
- **Language Selector**: Select the target language from a dropdown menu.

### 5. Login
- **Firebase Authentication**: Log in with email and password using Firebase.
- **Password Reset**: Allows users to reset their passwords via email.
- **Account Creation**: Option to create a new account.

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/enjoyimkrsnna/Voice-Converter
   ```

2. **Open the Project**:
   - Open Android Studio.
   - Select `Open an existing Android Studio project`.
   - Navigate to the cloned directory and open it.

3. **Set Up Firebase**:
   - Obtain your `google-services.json` file from the Firebase Console.
   - Place the `google-services.json` file in the `app` directory of your project.
   - Follow the Firebase setup instructions to link your app with Firebase.

4. **Build and Run**:
   - Sync the project with Gradle files by clicking `Sync Now` in Android Studio.
   - Build the project and resolve any dependency issues.
   - Run the application on an emulator or physical device.

## Usage

### 1. Voice Recorder
- **Start Recording**: Click `Start Recording` to begin capturing audio.
- **Stop Recording**: Click `Stop Recording` to end the recording session.
- **Play Recording**: Click `Play Recording` to play back the recorded audio.
- **Stop Playing**: Click `Stop Playing` to stop audio playback.

### 2. Speech-to-Text
- **Start Speech Recognition**: Click `Speak` to initiate voice recognition.
- **View Recognized Text**: The recognized speech will appear in a `TextView`.

### 3. Text-to-Speech
- **Input Text**: Enter the text you want to convert to speech in the `EditText` field.
- **Play Speech**: Click `Speak` to hear the text spoken aloud.
- **Adjust Settings**: Configure language and speech rate as needed.

### 4. Translator
- **Enter Text**: Type the text you want to translate in the `EditText` field.
- **Select Language**: Choose the target language from the dropdown menu.
- **Translate**: Click `Translate` to view the translated text.

### 5. Login
- **Log In**: Enter your email and password to log in.
- **Password Reset**: Use the `Forgot Password` link to reset your password if necessary.
- **Create Account**: Click `Create Account` to navigate to the registration page.

## Screenshots

![a06150ea-0cfb-4a44-8c46-aecf20515dc1](https://github.com/user-attachments/assets/f41a8f95-145a-4dc1-9995-35ac39da6d9f)
![8e799bb2-395c-4c75-99ba-bbbb06387959](https://github.com/user-attachments/assets/ba5ac215-d1fd-4efe-9c22-8ce2536f7e73)
![dfa43e5d-c229-494b-bce7-ffa424d34f15](https://github.com/user-attachments/assets/56ba3366-c1c5-49e3-9a5e-234f8d4d7aea)
![d75682df-8df8-428f-8921-3d0dbcf8e478](https://github.com/user-attachments/assets/dff19578-c33e-481e-9999-8a581ed7bcf2)
![fb1633c0-625d-43fd-891b-7a62dc2507b8](https://github.com/user-attachments/assets/83c198c6-c342-4d2f-89be-d3a8d868680a)
![c618a146-6e65-4ed3-9438-2e68db69d2bb](https://github.com/user-attachments/assets/d977534c-d243-4af8-ab91-9899561f1c5f)


