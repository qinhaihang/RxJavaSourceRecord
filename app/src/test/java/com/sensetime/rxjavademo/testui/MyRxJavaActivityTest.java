package com.sensetime.rxjavademo.testui;

import com.sensetime.rxjavademo.core.Observable;
import com.sensetime.rxjavademo.core.Observer;

import org.junit.Test;

/**
 * @author qinhaihang
 * @version $Rev$
 * @time 19-7-7 下午10:49
 * @des
 * @packgename com.sensetime.rxjavademo.testui
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes
 */
public class MyRxJavaActivityTest {

    @Test
    public void testMyRxJava(){
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
                System.out.println(s);
            }

            @Override
            public void onComplete() {
                System.out.println("complete");
            }
        });
    }

}
