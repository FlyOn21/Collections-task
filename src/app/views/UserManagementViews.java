package app.views;

import app.model.UserManagementModel;

public class UserManagementViews {
    public void printAllUsersProcessing() {
        UserManagementModel userManagementModelObj = new UserManagementModel();
        System.out.println(userManagementModelObj.allUsersToPrint());
    }

    public void printSpecificUserProcessing(String stringIndex) {
        UserManagementModel userManagementModelObj = new UserManagementModel();
        System.out.println(userManagementModelObj.printUserByIndex(stringIndex));
    }
}
