package com.example.mylab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CustomDialogMain extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog_main_page);

        Button btn = findViewById(R.id.CustomButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ShowDialog();
            }
        });
    }

    public void ShowDialog(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Calculate");
        builder.setCancelable(true);

        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_dialog,null);

        EditText first,second;
        Button calculate;
        TextView result;

        first= view.findViewById(R.id.firstnum);
        second = view.findViewById(R.id.secondnum);
        calculate = findViewById(R.id.calculate);
        result = findViewById(R.id.txtResult);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int FirstNum = Integer.parseInt(first.getText().toString());
                int SecondNum = Integer.parseInt(second.getText().toString());
                int Result = FirstNum+SecondNum;

                result.setText("Result:"+Result);
            }
        });
    }
}
