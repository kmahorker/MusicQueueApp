package com.musicq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button join_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
