package app.controller;

import app.views.UserManagementViews;

import java.util.Scanner;

public class UserManagementController {

    public void userManagementProcessing() {
        String title = """
                ##############################
                Realize home work 9 Collection
                ##############################
                """;
        System.out.println(title);
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        UserManagementViews userManagementViews = new UserManagementViews();
        while (running) {
            String menu = """ 
                    --------------
                    Choice action:
                    --------------
                    Choice 1 => print all users
                    Choice 2 => get specific user by index
                    Choice 3 => stop and exit
                    """;
            System.out.println(menu);
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    userManagementViews.printAllUsersProcessing();
                    break;
                case "2":
                    System.out.print("Enter user index: ");
                    String index = scanner.nextLine();
                    userManagementViews.printSpecificUserProcessing(index);
                    break;
                case "3":
                    running = false;
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
