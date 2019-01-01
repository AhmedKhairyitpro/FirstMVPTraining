package com.abdelazim.x.firstmvptraining.registration.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.abdelazim.x.firstmvptraining.R;
import com.abdelazim.x.firstmvptraining.registration.ContractInterface;
import com.abdelazim.x.firstmvptraining.registration.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener, ContractInterface.View {

    Button signUp;
    EditText email, password;

    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(this);
        calling();
    }

    private void calling() {

        signUp = findViewById(R.id.signup);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(android.view.View v) {

        switch (v.getId()) {

            case R.id.signup:
                presenter.signInClicked(email.getText().toString(), password.getText().toString());
                break;
        }
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
