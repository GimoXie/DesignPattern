package io.gimo.designpattern.creational.builder;

/**
 * 建造者模式中的 Concrete Builder 角色
 */
class EzrealBuilder extends HeroBuilder {

    @Override
    void builderName() {
        this.getHero().setName("Ezreal");
    }

    @Override
    void builderSex() {
        this.getHero().setSex("man");
    }
}
