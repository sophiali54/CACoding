package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String deleted_users = "";
    private String deleted_users_error = null;

    public ClearState(ClearState copy) {
        this.deleted_users = copy.deleted_users;
        this.deleted_users_error = copy.deleted_users_error;
    }

    public ClearState() {
    }

    public String getDeleted_users() {
        return this.deleted_users;
    }

    public String getDeleted_users_error() {
        return this.deleted_users_error;
    }

    public void setDeletedUsers(String deleted_users) {
        this.deleted_users = deleted_users;
    }

    public void setDeletedUsersError(String error) {
        this.deleted_users_error = error;
    }

}
