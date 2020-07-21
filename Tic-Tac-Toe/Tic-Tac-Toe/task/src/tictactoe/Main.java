package tictactoe;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        System.out.print("Enter cells: ");
        String in;
        in = sc.nextLine().trim();
        StringBuilder myIn = new StringBuilder(in);

        for (int i = 0; i < myIn.length() ; i++) {
            if (myIn.charAt(i) == '_') {
                myIn.setCharAt(i, ' ');
            }
        }
        int indexStr = 0;
        if (in.replaceAll("[XO_]", "").length() != 0) {
            System.out.println("Error: invalid input");
            return;
        }









        System.out.println("---------");
        System.out.println("| " + myIn.charAt(0) + " " + myIn.charAt(1) + " " + myIn.charAt(2) + " |");
        System.out.println("| " + myIn.charAt(3) + " " + myIn.charAt(4) + " " + myIn.charAt(5) + " |");
        System.out.println("| " + myIn.charAt(6) + " " + myIn.charAt(7) + " " + myIn.charAt(8) + " |");
        System.out.println("---------");

        System.out.print("Enter the coordinates: ");
        int coor1  = sc.nextInt();
        int coor2  = sc.nextInt();


        if (coor1 == 1 && coor2 == 3) {
            indexStr = 0;
        } else if (coor1 == 2 && coor2 == 3) {
            indexStr = 1;
        } else if (coor1 == 3 && coor2 == 3) {
            indexStr = 2;
        } else if (coor1 == 1 && coor2 == 2) {
            indexStr = 3;
        } else if (coor1 == 2 && coor2 == 2) {
            indexStr = 4;
        } else if (coor1 == 3 && coor2 == 2) {
            indexStr = 5;
        } else if (coor1 == 1 && coor2 == 1) {
            indexStr = 6;
        } else if (coor1 == 2 && coor2 == 3) {
            indexStr = 7;
        } else if (coor1 == 3 && coor2 == 1) {
            indexStr = 8;
        }

        if (myIn.charAt(indexStr) == 'X' || myIn.charAt(indexStr) == 'O') {
            System.out.println("This cell is occupied! Choose another one!");
            return;
        }

        myIn.setCharAt(indexStr, 'X');

        System.out.println("---------");
        System.out.println("| " + myIn.charAt(0) + " " + myIn.charAt(1) + " " + myIn.charAt(2) + " |");
        System.out.println("| " + myIn.charAt(3) + " " + myIn.charAt(4) + " " + myIn.charAt(5) + " |");
        System.out.println("| " + myIn.charAt(6) + " " + myIn.charAt(7) + " " + myIn.charAt(8) + " |");
        System.out.println("---------");


    }
}
