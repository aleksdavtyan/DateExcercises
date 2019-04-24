package com.aca.dateexercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader {
    String inputStr;
    int inputInt;


    public String readStr() {
        Scanner strScanner = new Scanner(System.in);
        inputStr = strScanner.nextLine();
        return inputStr;
    }

    public int readInt() {
        Scanner intScanner = new Scanner(System.in);
        try {
            inputInt = intScanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, please enter a number.");
        }
        return inputInt;
    }
}
