package com.company;

import java.util.Scanner;

public class CoffeeMachine {
    // attribute
    int water = 10;
    int coffee = 10;
    public void  Makecoffee(int americano){
        System.out.println("select your coffee");
        System.out.println("1.Americano");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();


        if (input == "1"){
            Americano americano = MakeAmericano();
            if (americano != null)
             System.out.println("Here your americano");
            else
                System.out.println("sorry can't make it.");


        }
    }










    //method

    Americano MakeAmericano(){
           // check recipe = americano coffee 1, water, coffee
        if (coffee > 1 && water > 2) {
            coffee -= 1;
            water -= 1;

            // create americano object and return
            Americano americano = new Americano();
            return americano;
        }else
            return null;


    }
}
