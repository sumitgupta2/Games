package com.game;

import java.util.*;

public class PlaySnakeAndLadder {
    public static void main(String[] args) {
        Dice dice = new Dice(1);
        Player p1 = new Player("Player1",1);
        Player p2 = new Player("Player2",2);
        Queue<Player> allPlayers = new LinkedList<>();
        allPlayers.offer(p1);
        allPlayers.offer(p2);
        Jumper snake1 = new Jumper(35,2);
        Jumper snake2 = new Jumper(99,10);
        Jumper snake3 = new Jumper(77,47);
        Jumper snake4 = new Jumper(65,18);
        Jumper snake5 = new Jumper(27,4);
        List<Jumper> snakes = new ArrayList<>();
        snakes.add(snake1);
        snakes.add(snake2);
        snakes.add(snake3);
        snakes.add(snake4);
        snakes.add(snake5);
        Jumper ladder1 = new Jumper(5,25);
        Jumper ladder2 = new Jumper(39,91);
        Jumper ladder3 = new Jumper(29,80);
        Jumper ladder4 = new Jumper(52,76);
        Jumper ladder5 = new Jumper(41,65);
        List<Jumper> ladders = new ArrayList<>();
        ladders.add(ladder1);
        ladders.add(ladder2);
        ladders.add(ladder3);
        ladders.add(ladder4);
        ladders.add(ladder5);
        Map<String,Integer> playersCurrentPosition = new HashMap<>();
        playersCurrentPosition.put("Player1",0);
        playersCurrentPosition.put("Player2",0);
        GameBoard gb=new GameBoard(dice,allPlayers,snakes,ladders,playersCurrentPosition,100);
        Scanner userInput = new Scanner(System.in);
        gb.startGame(userInput);
    }
}
