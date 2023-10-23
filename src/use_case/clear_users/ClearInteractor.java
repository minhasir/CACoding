package use_case.clear_users;

// TODO Complete me

import java.util.List;

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface userDataAccessObject;

    final ClearOutputBoundary clearPresetner;


    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface, ClearOutputBoundary clearOutputBoundary) {

        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresetner = clearOutputBoundary;
    }

    @Override
    public void execute(ClearInputData clearInputData) {

        List<String> usernames = userDataAccessObject.clear_all();
        ClearOutputData clearOutputData = new ClearOutputData(usernames);
        clearPresetner.prepareSuccessView(clearOutputData);

    }


}
