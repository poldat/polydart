package com.example.john.poldot;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class JoinActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        Button button =(Button)findViewById(R.id.join);
        EditText editText1 = (EditText) findViewById(R.id.id);
        EditText editText2 = (EditText) findViewById(R.id.passworld);
        EditText editText3 = (EditText) findViewById(R.id.confirm);

        String data1 = editText1.getText().toString();
        String data2 = editText2.getText().toString();
        String data3 = editText3.getText().toString();
    }




    public void cencel(View v){
        finish();
    }


}


