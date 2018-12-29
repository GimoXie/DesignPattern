package io.gimo.designpattern.creational.factorymethod;


/**
 * Created by zmxie on 2018/12/29.
 */
class HeroFactory {

    Hero getEzreal() {
        return new Ezreal();
    }

    Hero getKatarina() {
        return new Katarina();
    }

    static Hero newEzreal() {
        return new Ezreal();
    }

    static Hero newKatarina() {
        return new Katarina();
    }

    Hero getHero(String name) {
        if ("Ezreal".equals(name)) {
            return new Ezreal();
        } else if ("Katarina".equals(name)) {
            return new Katarina();
        } else {
            throw new IllegalArgumentException("The hero " + name + " is not exist...");
        }
    }
}
