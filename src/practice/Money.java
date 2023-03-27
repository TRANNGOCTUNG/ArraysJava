package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Menu:
                0.Exit.
                1.Enter money.
                """);
        int number = scanner.nextInt();
        switch (number){
            case 0 -> System.exit(0);
            case 1 -> {
                int size;
                do{
                    System.out.println("nhập kích cỡ của mảng");
                    size = scanner.nextInt();
                    if(size > 10){
                        System.out.println("vui lòng nhập lại");
                    }
                } while (size > 10);
                double[] arrayList = new double[size];
                for (int i = 0; i < arrayList.length; i++) {
                    System.out.println("Nhập vị trí thứ :" + i);
                    arrayList[i] = scanner.nextDouble();
                }
                System.out.println("Mảng vừa nhập :");
                for (double a: arrayList) {
                    System.out.print(Arrays.toString(new double[]{a}));
                }
                int max = (int) arrayList[0];
                int index = 0;
                for (int i = 1; i < arrayList.length; i++) {
                    if(arrayList[i] > max){
                        max = (int) arrayList[i];
                        index = i +1;
                    }
                }
                System.out.println("\n Max is " + max + " index " + index);
            }
        }
    }
}
