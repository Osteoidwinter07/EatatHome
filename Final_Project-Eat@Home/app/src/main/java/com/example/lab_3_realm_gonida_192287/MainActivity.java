package com.example.lab_3_realm_gonida_192287;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText UsernameLogin;
    private EditText PasswordLogin;
    private CheckBox RememberMe;
    private Button SubmitLogin;
    private Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsernameLogin = findViewById(R.id.inputUsernameLogin);
        PasswordLogin = findViewById(R.id.inputPasswordLogin);
        RememberMe = findViewById(R.id.rememberMe);
        SubmitLogin = findViewById(R.id.submitBtnLogin);
        Register = findViewById(R.id.registerBtnLogin);
    }
}