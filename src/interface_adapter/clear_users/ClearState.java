package interface_adapter.clear_users;

// TODO Complete me

import java.util.Collections;
import java.util.List;

public class ClearState {
    private List<String> usernames = Collections.<String>emptyList();

    public ClearState(ClearState copy){
        this.usernames = copy.usernames;
    }
    public ClearState() {
    }

    public List<String> getUsernames(){
        return this.usernames;
    }

}
