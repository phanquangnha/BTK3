package com.google.th_baiktra3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Model> items = new ArrayList<>();
    Adapter adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listPhepTinh);

        items.add(new Model("Huy Cận","Huy Cận sinh ngày 31/5/1919,là một chính khách",R.drawable.huycan1));
        items.add(new Model("Mạc Ngôn","là một nhà văn người Trung Quốc",R.drawable.macngon1)) ;
        items.add(new Model("Shakespeare","là một nhà văn và nhà viết kịch Anh",R.drawable.spac1)) ;
        items.add(new Model("Shakespeare","là một nhà văn và nhà viết kịch Anh",R.drawable.spac1)) ;


        adapter = new Adapter(MainActivity.this,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Detail.class);
                intent.putExtra("thuchien",i);
                startActivity(intent);
            }
        });
    }
}