package ex02.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 William Weatherlow
 */
public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();

        String inputString = myApp.readString();

        myApp.displayString(inputString);

    }
    private String readString(){
        System.out.print("What is the input string? ");
        String input = in.nextLine();
        return input;
    }

    private void displayString(String input){
        System.out.printf("%s has %d characters.",input,input.length());
    }

}
