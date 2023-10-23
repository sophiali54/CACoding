package interface_adapter.clear_users;

// TODO Complete me

import entity.User;
import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import javax.swing.*;
import java.util.ArrayList;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private final ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                          ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData deleted_users) {
        StringBuilder user_names = new StringBuilder();
        ArrayList<User> deleted_Users = deleted_users.getDeleted_Users();

        for (User user: deleted_Users) {
            user_names.append(user.getName());
            user_names.append("\n");

        }

        ClearState clearState = clearViewModel.getState();
        clearState.setDeletedUsers(user_names.toString());
        this.clearViewModel.setState(clearState);
        this.clearViewModel.firePropertyChanged();

        this.viewManagerModel.setActiveView(clearViewModel.getViewName());
    }
    public void prepareFailView(String error) {
        ClearState clearState = this.clearViewModel.getState();
        clearState.setDeletedUsersError(error);
        this.clearViewModel.firePropertyChanged();

    }
}
