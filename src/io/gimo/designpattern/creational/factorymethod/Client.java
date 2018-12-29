package io.gimo.designpattern.creational.factorymethod;


/**
 * Created by zmxie on 2018/12/29.
 */
class Client {
    public static void main(String[] args) {
        HeroFactory factory = new HeroFactory();
        // 简单工厂
        factory.getHero("Ezreal").display();
        factory.getHero("Katarina").display();
        factory.getHero("Kayle").display();
        System.out.println();
        // 工厂方法
        factory.getEzreal().display();
        factory.getKatarina().display();
        System.out.println();
        // 静态工厂方法无需实例化工厂
        HeroFactory.newEzreal().display();
        HeroFactory.newKatarina().display();
    }
}
