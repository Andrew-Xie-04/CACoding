package use_case.clear_users;

// TODO Complete me

import java.util.List;

public class ClearOutputData {

    private List<String> users;

    public ClearOutputData(List<String> users){
        this.users = users;
    }

    public List<String> getDeletedUsers() {
        return users;
    }
}
