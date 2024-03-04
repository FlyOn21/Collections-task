package app.mock;

import app.essences.User;

import java.util.ArrayList;
import java.util.List;

public class MockUserTableQuery {
    private final List<User> queryResult = new ArrayList<>();

    private List<User> make() {
        queryResult.add(new User(1, "Jone Doy", "jd@mymail.com"));
        queryResult.add(new User(2, "Mike Pool", "mikep@mymail.com"));
        queryResult.add(new User(3, "Paul Mock", "pm@mymail.com"));
        queryResult.add(new User(4, "Nat Sunny", "sunny@mymail.com"));
        queryResult.add(new User(5, "Olga Zh", "oz@mymail.com"));
        return queryResult;
    }

    public List<User> query() {
        return make();
    }
}
