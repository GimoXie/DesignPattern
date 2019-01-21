package io.gimo.designpattern.behavioral.strategy;

/**
 * 在构造context的时候确定调用哪一种策略的方法
 */
public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void process() {
        this.strategy.process();
    }
}
