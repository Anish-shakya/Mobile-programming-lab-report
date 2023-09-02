package com.example.mylab;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class CustomDialog extends DialogFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.custom_dialogs, container, false);

        final EditText editTextPrincipal = view.findViewById(R.id.editTextPrincipal);
        final EditText editTextRate = view.findViewById(R.id.editTextRate);
        final EditText editTextTime = view.findViewById(R.id.editTextTime);
        Button buttonCalculate = view.findViewById(R.id.buttonCalculate);
        Button buttonCancel = view.findViewById(R.id.buttonCancel);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input
                double principal = Double.parseDouble(editTextPrincipal.getText().toString());
                double rate = Double.parseDouble(editTextRate.getText().toString());
                double time = Double.parseDouble(editTextTime.getText().toString());

                // Calculate simple interest
                double interest = (principal * rate * time) / 100;

                // Display the result
                Toast.makeText(getActivity(), "Simple Interest: " + interest, Toast.LENGTH_SHORT).show();

                // Dismiss the dialog
                dismiss();
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Dismiss the dialog
                dismiss();
            }
        });

        return view;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }
}
