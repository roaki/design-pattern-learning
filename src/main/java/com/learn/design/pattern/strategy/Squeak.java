package com.learn.design.pattern.strategy;

/**
 * @author luo
 * @version 1.0 2017/10/14
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
