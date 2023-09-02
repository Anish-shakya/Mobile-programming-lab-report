package com.example.mylab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MultiplyFragment extends Fragment {

    EditText first,second;
    Button mul;
    TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view =inflater.inflate(R.layout.fragment_multiply, container, false);
        first = view.findViewById(R.id.edtFirst);
        second = view.findViewById(R.id.edtSecond);
        mul = view.findViewById(R.id.btnMultiply);
        result =view.findViewById(R.id.txtResult);

        mul.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                int First = Integer.parseInt(first.getText().toString());
                int Second = Integer.parseInt(second.getText().toString());
                int Result = First*Second;
                result.setText("Result:"+Result);
            }
        });
        return view;
    }
}