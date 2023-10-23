package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {

    private String usernames = "";

    private String usernamesError = null;

    public ClearState(ClearState copy) {
        usernames = copy.usernames;
        usernamesError = copy.usernamesError;
    }

    public ClearState(){}

    public String getUsernames() {
        return usernames;
    }

    public String getUsernamesError() {
        return usernamesError;
    }

    public void setUsernames(String username) {
        this.usernames = username;
    }

    public void setUsernamesError(String usernameError) {
        this.usernamesError = usernameError;
    }


}
