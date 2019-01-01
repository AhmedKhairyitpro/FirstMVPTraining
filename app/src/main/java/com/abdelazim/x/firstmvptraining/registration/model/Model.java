package com.abdelazim.x.firstmvptraining.registration.model;

import com.abdelazim.x.firstmvptraining.registration.ContractInterface;
import com.abdelazim.x.firstmvptraining.repository.Repository;

public class Model {

    Repository repository;

    public Model() {

        repository = new Repository();
    }

    public void signinWithTheseData(ContractInterface.PresenterCallbacks presenterCallbacks, String email, String password){

        repository.signinWithTheseData(presenterCallbacks, email, password);
    }
}
