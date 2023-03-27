package practice;

import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int temp;
        do {
            System.out.println("Nhập kích thước của mảng");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println(" nhập lại vị trí");
            }
        } while (size > 10);
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vị trí thứ : " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập ");
        for (int a: array
             ) {
            System.out.println(a);
        }
        for (int i = 0; i < array.length/2; i++) {

          temp = array[i];
          array[i] = array[size -1 -i];
          array[size -1 -i] = temp;
        }
        for (int b: array
             ) {
            System.out.print(b);
        }
    }
}
