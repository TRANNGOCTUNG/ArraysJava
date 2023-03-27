package test;

import java.util.Scanner;

public class TestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        printGrade(number);

    }
    public static void printGrade(int number){
        if(number >= 90){
            System.out.println('A');
        } else if(number >= 80){
            System.out.println('B');
        } else if(number >= 70){
            System.out.println('C');
        } else if(number >= 60){
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}
