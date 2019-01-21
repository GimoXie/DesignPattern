package io.gimo.designpattern.behavioral.strategy;

public class StrategyA implements Strategy {
    @Override
    public void process() {
        System.out.println("this is strategy A");
    }
}
