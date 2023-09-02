package com.example.mylab;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OptionMenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_items,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        switch(id){
            case R.id.option1:
                Toast.makeText(this,"Option 1 Selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.option2:
                Toast.makeText(this,"Option 2 Selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.option3:
                Toast.makeText(this,"Option 3 is Selected",Toast.LENGTH_SHORT).show();
                break;

        }
        return onOptionsItemSelected(item);

    }

}
