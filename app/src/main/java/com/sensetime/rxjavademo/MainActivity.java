package com.sensetime.rxjavademo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {

                emitter.onNext("Hello");
                emitter.onNext("World");
                emitter.onNext("!");
                emitter.onComplete();
            }
        }).flatMap(new Function<String, ObservableSource<String>>() {
            @Override
            public ObservableSource<String> apply(String s) throws Exception {

                if(s.equals("World")){
                    return Observable.just("God");
                }
                return Observable.just(s);
            }
        }).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                Log.i("qhh",s);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                Log.v("qhh","complete");
            }
        });

        /*Observable.create(new ObservableOnSubscribe<String>() {
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
        });*/

    }
}
