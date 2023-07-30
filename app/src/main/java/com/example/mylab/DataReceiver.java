package com.example.mylab;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DataReceiver extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_receiver);

        //receiving the data
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String subject = i.getStringExtra("subject");
        int lab_no = i.getIntExtra("lab_no",0);
        //displaying the data
        TextView text =findViewById(R.id.txtview);
        text.setText("Name="+name+"\n"+"Subject="+subject+"\n"+"Lab_no="+lab_no);

    }
}
