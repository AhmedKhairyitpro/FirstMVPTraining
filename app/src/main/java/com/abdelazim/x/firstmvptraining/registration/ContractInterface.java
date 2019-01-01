package com.abdelazim.x.firstmvptraining.registration;

public interface ContractInterface {

    interface View {
        void showToast(String message);
    }
    
    interface Presenter {
       void  signInClicked(String email, String password);
    }

    interface PresenterCallbacks {

        void onSingupFinished(String state);
    }
}
