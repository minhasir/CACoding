package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel, ClearViewModel clearViewModel) {

        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;

    }
    @Override
    public void prepareSuccessView(ClearOutputData response) {
        // On success switch to clear-view.
        ClearState clearState = clearViewModel.getState();
        clearState.setUsernames(response.getUsernames());
        this.clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();


    }
    @Override
    public void prepareFailView(String error) {
        ClearState clearState = clearViewModel.getState();
        clearState.setUsernamesError(error);
        clearViewModel.firePropertyChanged();
    }
}
