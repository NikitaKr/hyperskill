package machine;

import java.util.Scanner;

import static machine.CoffeeMachine.actionToTake;
import static machine.CoffeeMachine.coffeeMachineIngAmounts;

public class CoffeeMachineActionBuy {

    final static Scanner sc = new Scanner(System.in);

    public enum typesOfCoffee {
        ESPRESSO("1"),
        LATTE("2"),
        CAPPUCHINO("3"),
        BACK("back");


        public String state;

        typesOfCoffee(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

    public CoffeeMachineActionBuy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String typeOfCoffee = sc.next();
        switch (typeOfCoffee) {
            case "1":
                if (CoffeeMachine.getWater() >= 250 && CoffeeMachine.getCoffeeBeans() >= 16 && CoffeeMachine.getNumberOfCups() >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    CoffeeMachine.setWater(CoffeeMachine.getWater() - 250);
                    CoffeeMachine.setCoffeeBeans(CoffeeMachine.getCoffeeBeans() - 16);
                    CoffeeMachine.setMoney(CoffeeMachine.getMoney() + 4);
                    CoffeeMachine.setNumberOfCups(CoffeeMachine.getNumberOfCups() - 1);
                }
                break;
            case "2":
                if (CoffeeMachine.getWater() >= 350 && CoffeeMachine.getMilk() >= 75 && CoffeeMachine.getNumberOfCups() >= 1 && CoffeeMachine.getCoffeeBeans() >= 20) {
                    System.out.println("I have enough resources, making you a coffee!");
                    CoffeeMachine.setWater(CoffeeMachine.getWater() - 350);
                    CoffeeMachine.setCoffeeBeans(CoffeeMachine.getCoffeeBeans() - 20);
                    CoffeeMachine.setMoney(CoffeeMachine.getMoney() + 7);
                    CoffeeMachine.setMilk(CoffeeMachine.getMilk() - 75);
                    CoffeeMachine.setNumberOfCups(CoffeeMachine.getNumberOfCups() - 1);
                    break;
                }
            case "3":
                if (CoffeeMachine.getWater() >= 200 && CoffeeMachine.getMilk() >= 100 && CoffeeMachine.getNumberOfCups() >= 1 && CoffeeMachine.getCoffeeBeans() >= 12) {
                    System.out.println("I have enough resources, making you a coffee!");{
                        CoffeeMachine.setWater(CoffeeMachine.getWater() - 200);
                        CoffeeMachine.setCoffeeBeans(CoffeeMachine.getCoffeeBeans() - 12);
                        CoffeeMachine.setMoney(CoffeeMachine.getMoney() + 6);
                        CoffeeMachine.setMilk(CoffeeMachine.getMilk() - 100);
                        CoffeeMachine.setNumberOfCups(CoffeeMachine.getNumberOfCups() - 1);
                        break;
                    }

                }
            case "back":
                actionToTake();

        }

        CoffeeMachine.actionToTake();


    }
}