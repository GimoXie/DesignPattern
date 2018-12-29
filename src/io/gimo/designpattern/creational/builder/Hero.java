package io.gimo.designpattern.creational.builder;

/**
 * 建造者模式中的 Product
 */
class Hero {
    private String name;
    private String sex;

    public void display() {
        System.out.println("my name is " + name );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
