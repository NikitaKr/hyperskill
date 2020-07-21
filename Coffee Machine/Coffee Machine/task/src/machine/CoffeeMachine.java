package machine;

import java.util.Scanner;

public class CoffeeMachine {

    final static Scanner sc = new Scanner(System.in);

    private static int water = 400;
    private static int milk = 540;
    private static int coffeeBeans = 120;
    private static int numberOfCups = 9;
    private static int money = 550;


    public enum CoffeeMachineActions {

        BUY("buy"),
        FILL("fill"),
        TAKE("take"),
        REMAINING("remaining"),
        EXIT("exit");

        public String state;

        CoffeeMachineActions(String state) {
            this.state = state;
        }

        public String getState() {
            return this.state;
        }
    }

    public static void coffeeMachineIngAmounts() {

        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(numberOfCups + " of disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();

    }

    public static void actionToTake() {

        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String action = sc.next();
        if (action.equals(CoffeeMachineActions.BUY.getState())) {
            new CoffeeMachineActionBuy();
        } else if (action.equals(CoffeeMachineActions.FILL.getState())) {
            new CoffeeMachineActionFill();
        } else if (action.equals(CoffeeMachineActions.TAKE.getState())) {
            new CoffeeMachineActionTake();
        } else if (action.equals(CoffeeMachineActions.REMAINING.getState())) {
            coffeeMachineIngAmounts();
            actionToTake();
        } else if (action.equals(CoffeeMachineActions.EXIT.getState())) {
            System.exit(2);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        actionToTake();
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        CoffeeMachine.money = money;
    }

    public static int getMilk() {
        return milk;
    }

    public static void setMilk(int milk) {
        CoffeeMachine.milk = milk;
    }

    public static int getWater() {
        return water;
    }

    public static void setWater(int water) {
        CoffeeMachine.water = water;
    }

    public static int getCoffeeBeans() {
        return coffeeBeans;
    }

    public static void setCoffeeBeans(int coffeeBeans) {
        CoffeeMachine.coffeeBeans = coffeeBeans;
    }

    public static int getNumberOfCups() {
        return numberOfCups;
    }

    public static void setNumberOfCups(int numberOfCups) {
        CoffeeMachine.numberOfCups = numberOfCups;
    }
}