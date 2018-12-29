package io.gimo.designpattern.creational.builder;

/**
 * Created by zmxie on 2018/12/29.
 */
class KatalinaBuilder extends HeroBuilder{
    @Override
    void builderName() {
        this.getHero().setName("Katalina");
    }

    @Override
    void builderSex() {
        this.getHero().setSex("woman");
    }
}
