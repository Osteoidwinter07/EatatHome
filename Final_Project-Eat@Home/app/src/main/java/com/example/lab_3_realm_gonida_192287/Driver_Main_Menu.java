package com.example.lab_3_realm_gonida_192287;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Toast;

import org.androidannotations.annotations.Click;

public class Driver_Main_Menu extends AppCompatActivity {

    @Click(R.id.viewOrdersDriver){
        Intent intent = new Intent(Driver_Main_Menu.this, View_Order_List.class);
        startActivity(intent);
    }

    @Click(R.id.foodDetailsDriver){
        Intent intent = new Intent(Driver_Main_Menu.this, View_Food_Items.class);
        startActivity(intent);
    }

    @Click(R.id.addFoodDriver){
        Intent intent = new Intent(Driver_Main_Menu.this, Add_Food_Item.class);
        startActivity(intent);
    }

    @Click(R.id.addOrdersDriver){
        Intent intent = new Intent(Driver_Main_Menu.this, Add_Order_Page.class);
        startActivity(intent);
    }


    @Click(R.id.CustomerDetailsDriver){
        Intent intent = new Intent(Driver_Main_Menu.this, View_Customer_Detail_Page.class);
        startActivity(intent);
    }

    @Click(R.id.LogOutDriver){
        Intent intent = new Intent(Driver_Main_Menu.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(MainActivity.this, "You have successfully Logged Out!", Toast.LENGTH_SHORT).show();
}