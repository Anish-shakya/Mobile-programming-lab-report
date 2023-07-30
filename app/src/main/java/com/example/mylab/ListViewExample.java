package com.example.mylab;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListViewExample extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        listView = findViewById(R.id.mylist);
        String names [] =
                {"Anish","Ram","Shyam","Sita","Hari","Rita","Gita"};
        //displaying list using ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,R.layout.listview_items,R.id.list,names);
        listView.setAdapter(adapter);
    }
}
