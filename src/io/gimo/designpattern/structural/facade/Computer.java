package io.gimo.designpattern.structural.facade;

/**
 * Created by zmxie on 2019/1/4.
 */
class Computer {
    private Cpu cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        this.cpu = new Cpu();
        this.disk = new Disk();
        this.memory = new Memory();
    }

    public void start() {
        System.out.println("COMPUTER start...");
        cpu.start();
        disk.start();
        memory.start();
    }
}
