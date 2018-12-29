package io.gimo.designpattern.creational.abstractfactory;


/**
 * Created by zmxie on 2018/12/29.
 */
class Client {
    public static void main(String[] args) {
        HeroFactory heroFactory = new EzrealFactory();
        heroFactory.getHero().display();
        heroFactory = new KatarinaFactory();
        heroFactory.getHero().display();
    }
}
