package machine;

import java.util.Scanner;


public class CoffeeMachineActionFill {

    static Scanner sc = new Scanner(System.in);

    public CoffeeMachineActionFill() {

        System.out.println("Write how many ml of water do you want to add:");
        CoffeeMachine.setWater(CoffeeMachine.getWater() + sc.nextInt());

        System.out.println("Write how many ml of milk do you want to add:");
        CoffeeMachine.setMilk(CoffeeMachine.getMilk() + sc.nextInt());

        System.out.println("Write how many grams of coffee beans do you want to add:");
        CoffeeMachine.setCoffeeBeans(CoffeeMachine.getCoffeeBeans() + sc.nextInt());

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        CoffeeMachine.setNumberOfCups(CoffeeMachine.getNumberOfCups() + sc.nextInt());

        CoffeeMachine.actionToTake();
    }

}