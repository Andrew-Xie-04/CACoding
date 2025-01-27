package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;


public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;
    private final SignupViewModel signupViewModel;
    public ClearPresenter(ClearViewModel clearViewModel , ViewManagerModel viewManagerModel, SignupViewModel signupViewModel){
        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;
        this.signupViewModel = signupViewModel;
    }

    public void prepareSuccessView(ClearOutputData response) {
        // On success, switch to the login view.


        ClearState clearState = clearViewModel.getState();
        clearState.getUsernames(response.getDeletedUsers());
        this.clearViewModel.setState(clearState);
        signupViewModel.firePropertyChanged();

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }
}
