package io.gimo.designpattern.behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        StrategyContext sc = new StrategyContext(new StrategyB());
        sc.process();
    }
}
