package com.example.john.poldot;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class GameRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_room);

       Button menual_btn = (Button)findViewById(R.id.menual_btn);
        menual_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenualActivity.class);
                startActivity(intent);
            }
        });


        Button ready_btn = findViewById(R.id.ready);

        ready_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GamePlayActivity.class);
                startActivity(intent);
            }
        });
    }


}
