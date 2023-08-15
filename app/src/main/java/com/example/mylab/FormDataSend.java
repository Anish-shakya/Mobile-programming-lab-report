package com.example.mylab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FormDataSend extends AppCompatActivity {
    Button button;
    TextView UserName,Email;
    @Override
    protected void onCreate(@Nullable Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.user_form);

        UserName = findViewById(R.id.username);
        Email = findViewById(R.id.email);
        button = findViewById(R.id.submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Users = UserName.getText().toString();
                String Emails = Email.getText().toString();

                Intent intent = new Intent(FormDataSend.this,FormDataDisplay.class);
                intent.putExtra("Username :", Users);
                intent.putExtra("Email :",Emails);
                startActivity(intent);
            }
        });
    }
}
