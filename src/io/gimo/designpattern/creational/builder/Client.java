package io.gimo.designpattern.creational.builder;

/**
 * Created by zmxie on 2018/12/29.
 */
class Client {
    public static void main(String[] args) {
        Player player1 = new Player(new EzrealBuilder());
        player1.buildHero().display();
        Player player2 = new Player(new KatalinaBuilder());
        player2.buildHero().display();
    }
}
