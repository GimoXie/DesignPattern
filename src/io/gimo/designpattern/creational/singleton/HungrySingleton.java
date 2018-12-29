package io.gimo.designpattern.creational.singleton;

/**
 * 饿汉式
 */
class HungrySingleton {

    /**
     * 这里就体现了饿汉的饿，类一加载，实例就已经生成。
     */
    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {
        System.out.println("new HungrySingleton()");
    }

    public static HungrySingleton getInstance() {
        System.out.println("get HungrySingleton instance");
        return singleton;
    }

    public void display() {
        System.out.println("hungry singleton...");
    }
}
