package io.gimo.designpattern.creational.abstractfactory;

/**
 * Created by zmxie on 2018/12/29.
 */
class EzrealFactory implements HeroFactory {
    @Override
    public Hero getHero() {
        return new Ezreal();
    }
}
