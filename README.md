# First Form

A simple Android registration form app built with Java in Android Studio. After the user fills in the form and taps **Create account**, a dialog shows all the entered details.

## Screenshots

| Registration form | Registration Details dialog |
|:-----------------:|:---------------------------:|
| <img src="https://github.com/user-attachments/assets/d0ba2855-70ef-4a2e-838a-0aed2fb6c8ad" alt="Registration form" width="260" /> | <img src="https://github.com/user-attachments/assets/00b0d96a-d6ea-4333-976a-7cb7ff8df704" alt="Registration Details dialog" width="260" /> |

## Features

- Input fields: Username, Full name, Country, Email, Phone number, Password
- Gender selection (Male / Female) with a `RadioGroup`
- "Agree with Terms & Conditions" checkbox
- Scrollable layout, so it works on small screens
- **Create account** button that opens a **Registration Details** dialog with all entered data and `Terms Accepted: Yes/No`

## Built With

- Java
- Android Studio
- XML layouts (`ScrollView`, `LinearLayout`)
- `AlertDialog`

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/FirstForm.git
   ```
2. Open it in Android Studio and let Gradle sync.
3. Run the app on an emulator or a physical device.

## Note

This is a learning project. The password is shown in the dialog only because the assignment requires all data to be displayed.
