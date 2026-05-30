package app;

public class Main {
    public static void main(String[] args) {
        LoginApp.window("Login", 350, 220)
                .panel("Login Form")
                .field("Username:", "username", "text")
                .field("Password:", "password", "password")
                .button("Login", "login")
                .button("Cancel", "cancel")
                .show();
    }
}