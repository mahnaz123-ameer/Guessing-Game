package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome");
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello !" + name);
        System.out.println("Start the game?");
        System.out.println("\t1 : Yes");
        System.out.println("\t1 : No");

        int ans = scanner.nextInt();


        Random random = new Random();
        int number = random.nextInt(20)+1;
        System.out.println("Guess a number");
        int input;

        boolean win = false , finish = false;
        int t=0;

        while(!finish){
             input = scanner.nextInt();
            t++;
            if(t<5){
                if(input == number){
                    win= true;
                    finish = true;
                }
                else if(input>number){
                    System.out.println("guess lower");
                }
                else if(input<number){
                    System.out.println("guess higher");
                }
            }else{
                finish = true;
            }
        }
        if(win){
            System.out.println("Congratulations");
        }
        else {
            System.out.println("Game over");
            System.out.println("The number was: " + number);
        }



    }
}
