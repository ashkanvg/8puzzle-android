package com.example.a8_puzzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView name = (TextView) findViewById(R.id.editText);
        ImageView click = (ImageView) findViewById(R.id.imageButton);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String inputName = "UNKNOWN";
                    if(!name.getText().toString().trim().equals("")){
                        inputName = name.getText().toString().trim();
                    }
                    Intent intent = new Intent(MainActivity.this,gameActivity.class);
                    intent.putExtra("name",inputName);
                    startActivity(intent);

            }
        });

    }


}
