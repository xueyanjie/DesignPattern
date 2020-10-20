package com.dp.singleton;

/**
 * 懒汉式
 */
public class SingletonDemo1 {

    private static SingletonDemo1 instance;

    //让构造函数为 private，这样该类就不会被实例化
    private SingletonDemo1() {}

    public static synchronized SingletonDemo1 getInstance() {
        /**
         * 懒汉式  这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步
         * 懒汉式如果不加 synchronized ，则在多线程情况下会有问题，可能产生多个实例
         */
        if (SingletonDemo1.instance.equals(null)) {
            SingletonDemo1.instance = new SingletonDemo1();
        }
        return SingletonDemo1.instance;
    }

}
