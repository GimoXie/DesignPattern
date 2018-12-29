package io.gimo.designpattern.creational.builder;

/**
 * 建造者模式中的 Director
 */
class Player {
    HeroBuilder heroBuilder;

    Player(HeroBuilder heroBuilder) {
        this.heroBuilder = heroBuilder;
    }

    public Hero buildHero() {
        heroBuilder.builderName();
        heroBuilder.builderSex();
        return heroBuilder.getHero();
    }

}
