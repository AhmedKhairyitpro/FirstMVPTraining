package com.abdelazim.x.firstmvptraining.registration.presenter;

import com.abdelazim.x.firstmvptraining.registration.ContractInterface;
import com.abdelazim.x.firstmvptraining.registration.model.Model;

public class Presenter implements ContractInterface.Presenter ,ContractInterface.PresenterCallbacks {

    Model model;
    ContractInterface.View view;

    public Presenter(ContractInterface.View view) {

        model = new Model();
        this.view = view;
    }

    @Override
    public void signInClicked(String email, String password) {

        model.signinWithTheseData(this, email, password);
    }

    @Override
    public void onSingupFinished(String state) {

        view.showToast(state);
    }
}
