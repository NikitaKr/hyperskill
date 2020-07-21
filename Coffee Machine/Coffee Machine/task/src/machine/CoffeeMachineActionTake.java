package machine;


public class CoffeeMachineActionTake {


    public CoffeeMachineActionTake() {
        CoffeeMachine CoffeeMachine = new CoffeeMachine();
        System.out.println("I gave you " + "$" + CoffeeMachine.getMoney());
        CoffeeMachine.setMoney(0);

        CoffeeMachine.actionToTake();

    }
}