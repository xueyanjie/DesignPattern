package com.dp.singleton;

/**
 * 登记式/静态内部类   懒加载
 * 这种方式能达到双检锁方式一样的功效，但实现更简单
 */
public class SingletonDemo4 {
    private static class SingletonHolder {
        private static final SingletonDemo4 INSTANCE = new SingletonDemo4();
    }
    private SingletonDemo4 (){}
    public static final SingletonDemo4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
