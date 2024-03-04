package app;

import app.controller.UserManagementController;

public class App {
    static final UserManagementController startApp = new UserManagementController();

    public void run() {
        startApp.userManagementProcessing();
    }
    public static void main(String[] args) {
        new App().run();
    }
}
