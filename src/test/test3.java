package test;


import java.util.Arrays;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
       int [] a = new int[5];
       Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Vị trí thứ " + i);
            a[i] = scanner.nextInt();
        }
    }
}
