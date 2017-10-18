package com.learn.design.pattern.strategy;

/**
 * @author luo
 * @version 1.0 2017/10/15
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
