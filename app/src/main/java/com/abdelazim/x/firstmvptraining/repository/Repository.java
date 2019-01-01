package com.abdelazim.x.firstmvptraining.repository;

import com.abdelazim.x.firstmvptraining.registration.ContractInterface;

public class Repository {

    public void signinWithTheseData(ContractInterface.PresenterCallbacks presenterCallbacks, String email, String password) {

        String storedEmail = email;
        String storedPassword = email;

        presenterCallbacks.onSingupFinished("Success");
    }
}
