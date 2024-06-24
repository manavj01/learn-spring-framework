package com.manav.learn_spring_framework.game;

public class PacManGame implements GamingConsole{

    public void up() {
        System.out.println("Go up");
    }

    public void down() {
        System.out.println("Go Down");
    }

    public void left() {
        System.out.println("Go left");
    }

    public void right() {
        System.out.println("Go Right");
    }
}
