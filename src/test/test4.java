package test;

import java.util.Arrays;

public class test4 {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] test2 = new int[test.length];
        for (int i = 0; i < test.length; i++) {
            test2[i] = test[i];
        }
        for (int i: test2
             ) {
            System.out.print(i);
        }
    }
}
