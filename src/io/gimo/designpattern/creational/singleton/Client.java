package io.gimo.designpattern.creational.singleton;

/**
 * Created by zmxie on 2018/12/29.
 */
class Client {

    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        hungrySingleton.display();
        System.out.println();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.display();
        System.out.println();
        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
        doubleCheckSingleton.display();
    }
}
