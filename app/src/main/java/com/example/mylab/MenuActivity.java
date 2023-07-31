package com.example.mylab;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MenuActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    Button btnContextMenu,btnPopMenu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        btnContextMenu = findViewById(R.id.btn_context_menu);
        btnPopMenu = findViewById(R.id.btn_pop_menu);
        registerForContextMenu(btnContextMenu);

        btnPopMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showPopMenu(v);
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_items,menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.option1:
                Toast.makeText(this,
                        "You have selected Option 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.option2:
                Toast.makeText(this,
                        "You have selected Option 2", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.option3:
                Toast.makeText(this,"You have selected Option 3",Toast.LENGTH_SHORT).show();
            case android.R.id.home://Home icon id
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch  (item.getItemId()){
            case R.id.option1:
                Toast.makeText(this,
                        "You have selected Option 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.option2:
                Toast.makeText(this,
                        "You have selected Option 2", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.option3:
                Toast.makeText(this,"You have selected Option 3",Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
    private void showPopMenu(View view){
        PopupMenu popupMenu=new PopupMenu(this,view);
        popupMenu.inflate(R.menu.menu_items);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option1:
                Toast.makeText(this,
                        "You have selected Option 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.option2:
                Toast.makeText(this,
                        "You have selected Option 2", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.option3:
                Toast.makeText(this,"You have selected Option 3",Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}