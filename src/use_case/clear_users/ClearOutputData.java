package use_case.clear_users;

// TODO Complete me
import entity.User;

import java.util.ArrayList;

public class ClearOutputData {
    private final ArrayList<User> deleted_Users;

    public ClearOutputData(ArrayList<User> deleted_users) {
        this.deleted_Users = deleted_users;
    }

    public ArrayList<User> getDeleted_Users() {
        return deleted_Users;
    }
}
