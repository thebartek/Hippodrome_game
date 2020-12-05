package com.codegym.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    static Hippodrome game;

    private List<Horse> horses;

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("Mark", 3, 0));
        game.getHorses().add(new Horse("Tom", 3, 0));
        game.getHorses().add(new Horse("Jack", 3, 0));

        game.run();
        game.printWinner();
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    public void run(){
        for(int i=1; i<=100; i++){
            move();
            print();
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move(){
        for(Horse horse : horses){
            horse.move();
        }
    }

    public void print(){
        for(Horse horse : horses){
            horse.print();
        }
        for(int i=0; i<10; i++){
            System.out.println();
        }
    }

    public Horse getWinner(){
        Horse winner = horses.get(0);
        for(Horse horse : horses){
            if(horse.getDistance() > winner.getDistance()){
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner(){
        System.out.println("The winner is " + getWinner().getName() + "!");
    }
}
