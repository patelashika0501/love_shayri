package com.example.love_shayri;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import MyAdapter.MyAdapter;

public class Listview_Activity extends AppCompatActivity {

    ListView listView1;

    int imgArr[] = {R.drawable.bestwishesh,R.drawable.husband,R.drawable.child,R.drawable.god,R.drawable.motivational,
            R.drawable.kanjoos,R.drawable.married,R.drawable.officework,R.drawable.politics,R.drawable.love,
            R.drawable.sad,R.drawable.bearbar,R.drawable.bewfa,R.drawable.birthday};

    String title[]={"सूरज निकल रहा है पूरब से;\n" +
            "दिन शुरू हुआ आपकी याद से;\n" +
            "कहना चाहते हैं हम आपको दिल से;\n" +
            "हर दिन हो जाये अच्छा आपकी प्यारी सी मुस्कान से।\n" +
            "सुप्रभात!",
    "आज फिर आपसे वादा करना चाहूंगी\n" +
            "जिंदगी का हर लम्हा आपके साथ जीना चाहूंगी\n" +
            "भले ही ये जिंदगी आपके साथ शुरू न हुईं हो\n" +
            "पर जिंदगी आखरी साँस तक\n" +
            "आपके साथ ही जीना चाहूंगी",
    };

   MyAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView1 = findViewById(R.id.listView1);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent=new Intent(Listview_Activity.this,Listview_Activity.class);
                intent.putExtra("pos",position);
                intent.putExtra("title",title);
                intent.putExtra("imgArr",imgArr);
                startActivity(intent);
            }
        });
    }
}