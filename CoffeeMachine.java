package machine;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class CoffeeMachine {

    static int defaultWater = 400;
    static int defaultMilk = 540;
    static int defaultBeans = 120;
    static int defaultMoney = 550;
    static int defaultCups = 9;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        machineCall();
        //coffeeMachineResult();
    }

    public static void coffeeMachineResult() {
        System.out.println("The coffee machine has: ");
        System.out.println(defaultWater + " of water");
        System.out.println(defaultMilk + " of milk");
        System.out.println(defaultBeans + " of coffee beans");
        System.out.println(defaultCups + " of disposable cups");
        System.out.println(defaultMoney + " of money");
        System.out.println();

    }

    public static void machineCall() {


        while(true){
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String input = sc.nextLine();

            if (input.equals("buy")) {
                callBuy();
            } else if (input.equals("take")) {
                callTake();
            } else if (input.equals("fill")) {
                callFill();
            } else if (input.equals("remaining")) {
                coffeeMachineResult();
            } else if (input.equals("exit")) {
                System.exit(0);
            } else {
                System.out.println("Wrong input try again!");
            }
        }
    }


    public static void callBuy() {
        System.out.println("What you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String buyInput = sc.next();

        switch (buyInput) {
            case "1":
                espresso();
                break;
            case "2":
                latte();
                break;
            case "3":
                cappuccino();
                break;
            case "back":
                machineCall();

        }
    }


        public static void espresso() {
            if (defaultWater >= 250 && defaultCups >= 1 && defaultBeans >= 16){
                defaultWater -= 250;
                defaultBeans -= 16;
                defaultCups -= 1;
                defaultMoney += 4;
                System.out.println("I have enough resources, making you a coffee!");
            }else if(defaultWater - 250 <= 0){
                System.out.println("Sorry, not enough water!");
            }else if (defaultBeans - 20 <= 0){
                System.out.println("Sorry, not enough coffee beans!");
            }else if (defaultCups - 1 == 0){
                System.out.println("Sorry, not enough disposable cups!");
            }else{
                System.out.println("Sorry, I am out of everything");
            }


        }

        public static void latte() {
            if (defaultWater >= 350 && defaultMilk >= 75 && defaultCups >= 1 && defaultBeans >= 20){
                defaultWater -= 350;
                defaultMilk -= 75;
                defaultBeans -= 20;
                defaultCups -= 1;
                defaultMoney += 7;
                System.out.println("I have enough resources, making you a coffee!");
            }else if(defaultWater - 350 <= 0){
                System.out.println("Sorry, not enough water!");
            }else if (defaultMilk - 75 <= 0){
                System.out.println("Sorry, not enough milk!");
            }else if (defaultBeans - 20 <= 0){
                System.out.println("Sorry, not enough coffee beans!");
            }else if (defaultCups - 1 == 0){
                System.out.println("Sorry, not enough disposable cups!");
            }else{
                System.out.println("Sorry, I am out of everything");
            }

        }

        public static void cappuccino() {
            if (defaultWater >= 200 && defaultMilk >= 100 && defaultCups >= 1 && defaultBeans >= 12) {
                defaultWater -= 200;
                defaultMilk -= 100;
                defaultBeans -= 12;
                defaultCups -= 1;
                defaultMoney += 6;
                System.out.println("I have enough resources, making you a coffee!");
            } else if (defaultWater - 200 <= 0) {
                System.out.println("Sorry, not enough water!");
            } else if (defaultMilk - 100 <= 0) {
                System.out.println("Sorry, not enough milk!");
            } else if (defaultBeans - 12 <= 0) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (defaultCups - 1 == 0) {
                System.out.println("Sorry, not enough disposable cups!");
            } else {
                System.out.println("Sorry, I am out of everything");
            }
        }

        public static void callFill(){
            System.out.println("Write how many ml of water do you want to add: ");
            int waterFill = sc.nextInt();
            System.out.println("Write how many ml of milk do you want to add: ");
            int milkFill = sc.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add: ");
            int beansFill = sc.nextInt();
            System.out.println("Write how many cups of coffee do you want to add: ");
            int cupsFill = sc.nextInt();

            defaultWater += waterFill;
            defaultMilk += milkFill;
            defaultBeans += beansFill;
            defaultCups += cupsFill;

        }


        public static void callTake(){
            System.out.println("I gave you all the $ " + defaultMoney);
            defaultMoney = 0;

        }

}
