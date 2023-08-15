package com.example.mylab;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FormDataDisplay extends AppCompatActivity {
    TextView display;
    @Override
    protected void onCreate(@Nullable Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.user_form_data_display);

       display = findViewById(R.id.display);

        Intent i = getIntent();
        String users = i.getStringExtra("Username");
        String emails =i.getStringExtra("Email");

        display.setText("Username =" + users + "\n" + "Email =" +emails);
    }
}
