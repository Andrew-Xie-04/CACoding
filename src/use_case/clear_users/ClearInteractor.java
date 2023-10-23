package use_case.clear_users;

// TODO Complete me

import entity.User;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearUserDataAccessInterface;

import java.util.List;


public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary){
        this.userDataAccessObject = userDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }
    @Override
    public void execute() {
        List<String> users = userDataAccessObject.getDeleted();
        userDataAccessObject.delete();

        ClearOutputData clearOutputData = new ClearOutputData(users);
        userPresenter.prepareSuccessView(clearOutputData);
    }
}
