package com.sensetime.rxjavademo.core;

/**
 * @author qinhaihang_vendor
 * @version $Rev$
 * @time 2019/6/24 21:56
 * @des
 * @packgename com.sensetime.rxjavademo.core
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes
 */
public abstract class Observable<T> /*implements ObservableOnSubscribe<T>*/{

    public abstract void subscribe(Observer<T> observer);

    public static <T> Observable<T> create(Observable<T> observable){
        return observable;
    }

    public Observable<T> nullMap(){
        return new Observable<T>() {
            @Override
            public void subscribe(Observer<T> observer) {

                Observable.this.subscribe(observer);
            }
        };
    }

}
