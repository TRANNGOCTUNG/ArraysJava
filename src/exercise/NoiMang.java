package exercise;

import java.util.Arrays;

public class NoiMang {
    public static void main(String[] args) {
        int[] a ={1,2,3,4};
        int[] b ={5,6,7,8};
        int length = a.length + b.length ;
        int[] result = new int[length];
        int pop = 0;
        for (int array1:a
             ) {
            result[pop] = array1;
            pop++;
        }
        for (int array2:b
             ) {
            result[pop] = array2;
            pop++;
        }
        System.out.println(Arrays.toString(result));
    }

}
