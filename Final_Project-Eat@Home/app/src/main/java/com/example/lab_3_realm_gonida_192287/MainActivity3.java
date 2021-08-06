package com.example.lab_3_realm_gonida_192287;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity

public class MainActivity3 extends AppCompatActivity {
    @Click(R.id.viewOrdersMM){
        Intent intent = new Intent(MainActivity3.this, View_Order_List.class);
        startActivity(intent);
    }

    @Click(R.id.foodDetailsMM){
        Intent intent = new Intent(MainActivity3.this, View_Food_Items.class);
        startActivity(intent);
    }

    @Click(R.id.addFoodMM){
        Intent intent = new Intent(MainActivity3.this, Add_Food_Item.class);
        startActivity(intent);
    }

    @Click(R.id.manageUsersMM){
        Intent intent = new Intent(MainActivity3.this, UserManagement_Page.class);
        startActivity(intent);
    }

    @Click(R.id.CustomerDetailsMM){
        Intent intent = new Intent(MainActivity3.this, View_Customer_Detail_Page.class);
        startActivity(intent);
    }

    @Click(R.id.LogOutBtnMM){
        Intent intent = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(MainActivity.this, "You have successfully Logged Out!", Toast.LENGTH_SHORT).show();
    }
}