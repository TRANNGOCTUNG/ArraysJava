package test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = scanner.nextInt();
        int z = sign(i);
        System.out.println(z);

    }
    public static int sign(int n){
        if(n > 0){
            return 1;
        } else if(n == 0){
            return 0;
        } else {
            return -1;
        }
    }

}
