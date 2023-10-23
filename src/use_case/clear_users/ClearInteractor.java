package use_case.clear_users;

// TODO Complete me
import entity.User;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = clearUserDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(ClearInputData clearInputData) {
        ArrayList<User> deleted_users = userDataAccessObject.getAll();
        userDataAccessObject.clear();
        ClearOutputData clearOutputData = new ClearOutputData(deleted_users);
        userPresenter.prepareSuccessView(clearOutputData);
    }
}
