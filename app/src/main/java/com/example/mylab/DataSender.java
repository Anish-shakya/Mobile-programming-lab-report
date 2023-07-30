package com.example.mylab;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DataSender extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_sender);

        Button btn = findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DataSender.this,DataReceiver.class);
                //passing the data
                i.putExtra("name","Anish Shakya");
                i.putExtra("subject","Mobile Programming");
                i.putExtra("lab_no",7);
                startActivity(i);
                }
        });
    }
}
