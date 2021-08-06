package com.example.lab_3_realm_gonida_192287;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import io.realm.Realm;
@EActivity
public class MainActivity extends AppCompatActivity {
    @ViewById(R.id.inputPasswordLogin)
    EditText UsernameLogin;

    @ViewById(R.id.inputPasswordLogin)
    EditText PasswordLogin;

    @ViewById(R.id.rememberMe)
    EditText RememberMe;

    Realm realm;

    @Click(R.id.submitBtnLogin)
    public void login(){

    }

}