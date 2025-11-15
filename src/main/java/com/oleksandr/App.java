package com.oleksandr;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main( String[] args ) {
        System.out.println("Hello user!\nPlease write two numbers");

        float number1 = getNumberFromInput("One");
        float number2 = getNumberFromInput("Two");
        String operation = getOperationFromInput();

        calculateTwoNums(number1, number2, operation);
    }

    public static String getOperationFromInput() {
        System.out.println("Chose operation (+, -, *, /): ");
        return sc.next();
    }

    public static float getNumberFromInput(String numberCount){
        System.out.println("Number " + numberCount + ": ");
        return sc.nextFloat();
    }
    public static void calculateTwoNums(float num1, float num2, String operation){
        String temp = "%.2f %s %.2f = %.2f";

        float result = 0;

        boolean isValid = true;

        switch (operation) {
            case "+" -> result = add(num1, num2);
            case "-" -> result = subtract(num1, num2);
            case "*" -> result = multiply(num1, num2);
            case "/" -> {
                if(num2 != 0){
                    result = divide(num1, num2);
                }
                else{
                    System.out.println("ERROR you can`t divide on zero");
                    isValid = false;
                }
            }
            default -> {
                System.out.println("ERROR unknown operation");
                isValid = false;
            }
        }
        if(isValid){
            System.out.printf(temp,num1,operation,num2,result);
        }
    }
    public static float add(float num1, float num2){
        return num1 + num2;
    }
    public static float subtract(float num1, float num2){
        return num1 - num2;
    }
    public static float multiply(float num1, float num2){
        return num1 * num2;
    }
    public static float divide(float num1, float num2){
        return num1 / num2;
    }
}
