package com.dp;

import com.dp.factory.Shape;
import com.dp.factory.ShapeFactory;
import com.dp.singleton.SingletonDemo3;
import com.dp.singleton.SingletonDemo5;

public class Demo {

    public static void main(String[] args) {
        //singleton demo3
        /*
        SingletonDemo3 demo3 = SingletonDemo3.getInstance();
        demo3.run();
        SingletonDemo5.INSTANCE.run(); //枚举实现
         */

        //工厂模式
        /*
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s1 = shapeFactory.getShape("circle");
        Shape s2 = shapeFactory.getShape("rectangle");
        Shape s3 = shapeFactory.getShape("square");
        s1.draw();
        s2.draw();
        s3.draw();
         */
    }

}
