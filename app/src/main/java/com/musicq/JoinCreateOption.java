package com.musicq;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class JoinCreateOption extends AppCompatActivity {

    private Button join_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_create_option);
        join_button  = (Button)findViewById(R.id.join);
        join_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJoinRoom();
            }
        });
    }


    public void openJoinRoom(){
        Intent intent = new Intent(this,JoinRoom.class);
        startActivity(intent);
    }

}
