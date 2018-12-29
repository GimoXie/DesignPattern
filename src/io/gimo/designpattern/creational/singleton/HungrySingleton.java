package io.gimo.designpattern.creational.singleton;

/**
 * 饿汉式
 */
public class HungrySingleton {

    /**
     * 这里就体现了饿汉的饿，类一加载，实例就已经生成。
     */
    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return singleton;
    }

    public void display() {
        System.out.println("hungry singleton...");
    }
}
