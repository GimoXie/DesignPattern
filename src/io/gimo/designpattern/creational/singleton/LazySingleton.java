package io.gimo.designpattern.creational.singleton;

/**
 * 懒汉式
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    private static LazySingleton getInstance() {
        /**
         * 这里就提现了懒汉式的懒
         * 实例在第一次用到的时候才加载 懒加载
         */
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public void display() {
        System.out.println("lazy singleton...");
    }
}
