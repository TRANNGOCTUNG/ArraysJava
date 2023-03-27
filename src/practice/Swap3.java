package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Swap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int temp;
        System.out.println("""
                Choose are you.
                1.Swap
                2.Swap2.
                3.Create array
                0.exit
                """);
        int[] array = new int[]{1,2,3,4,5,6,7,};
        for (int a :array
             ) {
            System.out.print(Arrays.toString(new int[]{a}));
        }
        System.out.printf("\n Enter choose are you");
        int choice = scanner.nextInt();

        switch (choice) {
            case 0 -> System.exit(0);
            case 1 -> {
                for(int i = 0; i < array.length / 2; i++) {
                    temp = array[i];
                    array[i] = array[array.length - 1 - i];
                    array[array.length - 1 - i] = temp;
                }
                for (int a:array
                     ) {
                    System.out.print(Arrays.toString(new int[]{a}));
                };
            }
            case 2 -> {
                for(int i = 0, j = array.length -1; i < j; i++, j--){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                for (int a: array
                     ) {
                    System.out.print(Arrays.toString(new int[]{a}));
                }
            }
            case 3 -> {
                do{
                    System.out.println("Enter size");
                    size = scanner.nextInt();
                    if(size > 10){
                        System.out.println("Please re-enter");
                    }
                } while (size > 10);
                int[] newArray = new int[size];
                for (int i = 0; i < newArray.length; i++) {
                    System.out.println("Nhập phần tử thứ i: " + i);
                    newArray[i] = scanner.nextInt();
                }
                for (int i = 0; i < newArray.length / 2; i++) {
                    temp = newArray[i];
                    newArray[i] = newArray[size -1 -i];
                    newArray[size -1 -i] = temp;

                }
                for(int i: newArray){
                    System.out.print(Arrays.toString(new int[] {i}));
                }
            }
            default -> System.out.println("Please re-enter");
        }

    }
}
