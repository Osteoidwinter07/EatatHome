package com.example.lab_3_realm_gonida_192287;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText UsernameReg;
    private EditText PasswordReg;
    private EditText ConfirmPasswordReg;
    private Button SubmitReg;
    private Button CancelReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        UsernameReg = findViewById(R.id.inputUsernameReg);
        PasswordReg = findViewById(R.id.inputPasswordReg);
        ConfirmPasswordReg = findViewById(R.id.confirmPasswordReg);
        SubmitReg = findViewById(R.id.submitBtnReg);
        CancelReg = findViewById(R.id.cancelBtnReg);
    }
}