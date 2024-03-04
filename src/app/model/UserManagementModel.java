package app.model;

import app.essences.User;
import app.mock.MockUserTableQuery;

import java.util.List;
import java.util.stream.IntStream;

public class UserManagementModel {
    private final List<User> users;

    public UserManagementModel() {
        MockUserTableQuery mockQuery = new MockUserTableQuery();
        this.users = mockQuery.query(); // Заповнення списку користувачів моковими даними
    }

    public String allUsersToPrint() {
        StringBuilder allUserData = new StringBuilder();
        allUserData.append("======================================== \n");
        IntStream.range(0, this.users.size()).forEach(index -> {
            User user = this.users.get(index);
            allUserData.append("User at index: ").append(index).append("\n");
            allUserData.append("ID: ").append(user.id()).append("\n");
            allUserData.append("Name: ").append(user.name()).append("\n");
            allUserData.append("Email: ").append(user.email()).append("\n");
            allUserData.append("======================================== \n");
        });
        return allUserData.toString();
    }

    public String printUserByIndex(String indexString) {
        int index;
        try {
            index = Integer.parseInt(indexString);
        } catch (NumberFormatException e) {
            return "Invalid index.";
        }
        if (index >= 0 && index < users.size()) {
            StringBuilder currentUser = new StringBuilder();
            User user = this.users.get(index);
            currentUser.append("======================================== \n");
            currentUser.append("ID: ").append(user.id()).append("\n");
            currentUser.append("Name: ").append(user.name()).append("\n");
            currentUser.append("Email: ").append(user.email()).append("\n");
            currentUser.append("======================================== \n");
            return currentUser.toString();
        } else {
            return "WARNING: User with index " + (index) + " does not exist. Exists index in range 0 - " + (this.users.size() - 1);
        }
    }
}
