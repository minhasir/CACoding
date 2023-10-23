package use_case.clear_users;

// TODO Complete me

import java.util.List;

public class ClearOutputData {
    private final String usernames;

    public ClearOutputData(List<String> usernames) {

        String result = String.join("\n", usernames);
        this.usernames = result;
    }

    public String getUsernames() { return usernames;}
}
