package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapArray2 {
    public static void main(String[] args) {
      int[] array = {1,2,3,4,5,6};
      int temp;
        for (int i = 0, j= array.length -1; i < j ; i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        for (int a:array
             ) {
            System.out.print(a);
        }
    }
}
