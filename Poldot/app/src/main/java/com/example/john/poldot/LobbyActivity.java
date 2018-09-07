package com.example.john.poldot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class LobbyActivity extends AppCompatActivity{
    Button create_room_btn;
    Button ranking_btn;

    private ArrayList<HashMap<String,String>> Data = new ArrayList<HashMap<String, String>>();
    private HashMap<String,String> InputData1 = new HashMap<>();
    private HashMap<String,String> InputData2 = new HashMap<>();
    private HashMap<String,String> InputData3 = new HashMap<>();
    private HashMap<String,String> InputData4 = new HashMap<>();
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);

        create_room_btn = findViewById(R.id.create);
        ranking_btn = findViewById(R.id.ranking);
        create_room_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GameRoomActivity.class);
                startActivity(intent);
            }
        });


        ranking_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RankingActivity.class);
                startActivity(intent);
            }
        });



        listView =(ListView)findViewById(R.id.List_view);
        //데이터 초기화
        InputData1.put("school","서울대");
        InputData1.put("name","유혁");
        Data.add(InputData1);

        InputData2.put("school","연세대");
        InputData2.put("name","유재석");
        Data.add(InputData2);

        InputData3.put("school","연세대");
        InputData3.put("name","유재석");
        Data.add(InputData3);

        InputData4.put("school","연세대");
        InputData4.put("name","유재석");
        Data.add(InputData3);

        //simpleAdapter 생성
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,Data,android.R.layout.simple_list_item_2,new String[]{"school","name"},new int[]{android.R.id.text1,android.R.id.text2});
        listView.setAdapter(simpleAdapter);



    }
}

