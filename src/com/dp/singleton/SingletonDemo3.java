package com.dp.singleton;


/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）   一般情况下可以使用
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class SingletonDemo3 {

    private static volatile SingletonDemo3 instance;

    private SingletonDemo3() { }

    public static SingletonDemo3 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo3.class) { //lock SingletonDemo3
                if (instance == null) {  //第二层检验
                    instance = new SingletonDemo3();
                }
            }
        }
        return instance;
    }

    public void run() {
        System.out.println("I am SingletonDemo3");
    }

}
