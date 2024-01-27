package com.game2;

import java.util.LinkedList;
import java.util.Queue;

public class PlayGame {

    GameBoard gameBoard;
    Queue<Player> player;

    public PlayGame(Player[] players) {
        gameBoard = new GameBoard(players);
        player = new LinkedList<>();
    }

    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setPlayerId(1);
        p1.setPlayerName("Player1");
        p1.setPlayerSymbol('X');

        Player p2 = new Player();
        p2.setPlayerId(2);
        p2.setPlayerName("Player2");
        p2.setPlayerSymbol('O');
        Player[] players = new Player[]{p1,p2};
        PlayGame playGame = new PlayGame(players);
        playGame.play();
    }

    private void play(){
        gameBoard.start();
    }

}
