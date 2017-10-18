package com.learn.design.pattern.strategy;

/**
 * @author luo
 * @version 1.0 2017/10/15
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
