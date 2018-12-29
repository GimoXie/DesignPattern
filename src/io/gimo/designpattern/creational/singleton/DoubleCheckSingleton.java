package io.gimo.designpattern.creational.singleton;

/**
 * Created by zmxie on 2018/12/29.
 */
class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton doubleCheckSingleton = null;

    private DoubleCheckSingleton() {

    }

    // todo: 解释为何出现这种写法
    static DoubleCheckSingleton getInstance() {
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }

    void display() {
        System.out.println("double check singleton");
    }
}
