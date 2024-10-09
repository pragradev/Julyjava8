package io.pragra.learning;


public interface ICalculator {

    int a =10;

    int calculate(int a,int b);




    default void play(){
        System.out.println("playing");
    }

    default void work(){
        System.out.println("working");
    }

    static void run(){
        System.out.println("running");
    }



}
