package com.shreyannag.toolbar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class FourthActivity extends AppCompatActivity {
    TextView text;
    @Override
    public void onCreate(Bundle SavedInstances){
        super.onCreate(SavedInstances);
        setContentView(R.layout.fourth_activity);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Message passing demo");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        text = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        text.setText(str);
        if("".equals(text.getText())){
            Context context = getApplicationContext();
            CharSequence text="Please enter somethings. Try again";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context,text,duration);
            toast.show();
        }
    }
}
