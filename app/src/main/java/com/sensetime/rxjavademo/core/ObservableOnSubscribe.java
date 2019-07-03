package com.sensetime.rxjavademo.core;

/**
 * @author qinhaihang
 * @version $Rev$
 * @time 19-7-3 下午10:54
 * @des
 * @packgename com.sensetime.rxjavademo.core
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes
 */
public interface ObservableOnSubscribe<T> {

    void subscribe(Observer<T> observer);

}
