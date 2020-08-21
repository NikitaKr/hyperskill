import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        calc();

    }

    public static void calc() {
        String input = null;

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            input = scanner.next();
            if (input.equals(0)) {
                break;
            } else {
                try {
                    if (Integer.parseInt(input) != 0) {
                        System.out.println(Integer.parseInt(input) * 10);
                    } else {
                        break;
                    }
                } catch (NumberFormatException exception) {
                    System.out.println("Invalid user input: " + input);
                }
            }
        }
    }
}
