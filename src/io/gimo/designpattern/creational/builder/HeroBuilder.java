package io.gimo.designpattern.creational.builder;

/**
 * 建造者模式中的 Builder 角色
 */
abstract class HeroBuilder {
    private Hero hero = new Hero();

    abstract void builderName();
    abstract void builderSex();

    public Hero getHero() {
        return hero;
    }
}
