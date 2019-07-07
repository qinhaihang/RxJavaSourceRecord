package com.sensetime.rxjavademo.testui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.sensetime.rxjavademo.R;
import com.sensetime.rxjavademo.core.Observable;
import com.sensetime.rxjavademo.core.Observer;

public class MyRxJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_rx_java);

    }

    public void startTest(View view) {
        switch(view.getId()){
            case R.id.btn_start_test:
                testMyRxJava();
                break;
            default:
                break;
        }
    }

    private void testMyRxJava() {
        Observable.create(new Observable<String>() {
            @Override
            public void subscribe(Observer<String> observer) {
                observer.next("Hello");
                observer.next("World");
                observer.next("!");
                observer.onComplete();
            }
        }).subscribe(new Observer<String>() {
            @Override
            public void next(String s) {
                Log.i("qhh",s);
            }

            @Override
            public void onComplete() {
                Log.v("qhh","complete");
            }
        });
    }

}
