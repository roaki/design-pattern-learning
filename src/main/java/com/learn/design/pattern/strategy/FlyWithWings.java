package com.learn.design.pattern.strategy;

/**
 * @author luo
 * @version 1.0 2017/10/14
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!");
    }
}
