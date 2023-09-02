package com.example.mylab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog_main_page);

        Button buttonShowDialog = findViewById(R.id.CustomButton);

        buttonShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog();
            }
        });
    }

    private void showCustomDialog() {
        CustomDialog customDialog = new CustomDialog();
        customDialog.show(getSupportFragmentManager(), "CustomDialog");
    }
}