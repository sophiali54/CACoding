package use_case.clear_users;

// TODO Complete me
import entity.User;

import java.util.ArrayList;

public interface ClearUserDataAccessInterface {
    void clear();

    ArrayList<User> getAll();
}
