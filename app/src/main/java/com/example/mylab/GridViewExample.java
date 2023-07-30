package com.example.mylab;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GridViewExample extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        gridView = findViewById(R.id.mygrid);
        String names [] =
                {"Anish","Ram","Shyam","Sita","Hari","Rita","Gita"};
        //displaying list using ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,R.layout.gridview_items,R.id.list,names);
        gridView.setAdapter(adapter);
    }
}
