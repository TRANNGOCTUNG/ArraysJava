package test;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        double [][] a = {
                {1, 2, 3},
                {4,5,6}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(Arrays.toString(new double[]{a[i][j]}));
                
            }
            
        }
    }
}
