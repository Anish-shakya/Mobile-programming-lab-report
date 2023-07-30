package com.example.mylab;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerViewMain extends AppCompatActivity {
    ArrayList<ContactModelRv> arrContacts = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);
        RecyclerView recyclerView = findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModelRv(R.drawable.contact,"Anish ","9849245269"));
        arrContacts.add(new ContactModelRv(R.drawable.contact,"Ram","9876543210"));
        arrContacts.add(new ContactModelRv(R.drawable.contact,"Shyam","123456789"));
        arrContacts.add(new ContactModelRv(R.drawable.contact,"Hari","1274525718"));
        arrContacts.add(new ContactModelRv(R.drawable.contact,"Sita","8276453980"));
        arrContacts.add(new ContactModelRv(R.drawable.contact,"Anish ","9849245269"));
        arrContacts.add(new ContactModelRv(R.drawable.contact,"Ram","9876543210"));
        arrContacts.add(new ContactModelRv(R.drawable.contact,"Shyam","123456789"));
        arrContacts.add(new ContactModelRv(R.drawable.contact,"Hari","1274525718"));
        arrContacts.add(new ContactModelRv(R.drawable.contact,"Sita","8276453980"));
      
        RecyclerAdapter adapter = new RecyclerAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);
    }
}
