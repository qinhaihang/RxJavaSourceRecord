package com.sensetime.rxjavademo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sensetime.rxjavademo.testui.MyRxJavaActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void start(View view) {
        switch(view.getId()){
            case R.id.btn:
                startActivity(new Intent(this,MyRxJavaActivity.class));
                break;
            default:
                break;
        }
    }
}
