package com.dp.singleton;

/**
 * 饿汉式   平时可以使用
 * 描述：这种方式比较常用，但容易产生垃圾对象。
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 */
public class SingletonDemo2 {

    private static SingletonDemo2 instance = new SingletonDemo2();

    private SingletonDemo2() {}

    public static SingletonDemo2 getInstance() {
        return instance;
    }

}
