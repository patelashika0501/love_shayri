package com.example.love_shayri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import MyAdapter.MyAdapter;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    int imgArr[] = {R.drawable.bestwishesh,R.drawable.husband,R.drawable.child,R.drawable.god,R.drawable.motivational,
    R.drawable.kanjoos,R.drawable.married,R.drawable.officework,R.drawable.politics,R.drawable.love,
    R.drawable.sad,R.drawable.bearbar,R.drawable.bewfa,R.drawable.birthday};

    String    title[] = {"Best Wishes Shayri","Husband Shayri","Child Shayri","God Shayri","Motivational Shayri","Kanjoos Shayri",
    "Married Shayri","Officework Shayri","Politics Shayri","Love Shayri","Sad Shayri","Bearbar Shayri","Bewafa Shayri","Birthday Shayri"};

    MyAdapter adapter = new MyAdapter(MainActivity.this, title, imgArr);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent=new Intent(MainActivity.this,Listview_Activity.class);
                intent.putExtra("pos",position);
                intent.putExtra("title",title);
                intent.putExtra("imgArr",imgArr);
                startActivity(intent);
            }
        });
    }
}
