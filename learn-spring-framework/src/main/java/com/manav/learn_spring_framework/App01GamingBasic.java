package com.manav.learn_spring_framework;

import com.manav.learn_spring_framework.game.GameRunner;
import com.manav.learn_spring_framework.game.PacManGame;

public class App01GamingBasic {

    public static void main(String[] args) {

//        var game  = new MarioGame();
        var game  = new PacManGame(); // 1: Object Creation
//        var game = new SuperContraGame();

        var gameRunner = new GameRunner(game);
        // 2 : Object Creation + writing of dependencies
        // Game is a dependency of GameRunner

        gameRunner.run();
    }
}
