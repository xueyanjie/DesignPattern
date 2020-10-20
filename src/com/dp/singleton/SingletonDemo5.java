package com.dp.singleton;

/**
 * 枚举
 * 在effective java（这本书真的很棒）中说道，最佳的单例实现模式就是枚举模式。利用枚举的特性，让JVM来帮我们保证线程安全和单一实例的问题
 */
public enum SingletonDemo5 {
    INSTANCE;
    public void run() {
        System.out.println("I am demo 5");
    }
}
