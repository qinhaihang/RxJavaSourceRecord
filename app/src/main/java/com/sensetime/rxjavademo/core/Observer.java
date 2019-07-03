package com.sensetime.rxjavademo.core;

/**
 * @author qinhaihang
 * @version $Rev$
 * @time 19-7-3 下午10:46
 * @des
 * @packgename com.sensetime.rxjavademo.core
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes
 */
public abstract class Observer<T> {

    public abstract void next(T t);
    public abstract void onComplete();

}
