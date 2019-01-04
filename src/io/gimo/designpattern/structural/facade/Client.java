package io.gimo.designpattern.structural.facade;

/**
 * Created by zmxie on 2019/1/4.
 */
class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
    }
}
