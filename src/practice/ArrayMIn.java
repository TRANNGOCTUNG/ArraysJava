package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Menu
                0.Exit.
                1.Search min in array.
                """);
        System.out.println("Choose menu");
        int number = scanner.nextInt();
        switch (number) {
            case 0 -> System.exit(0);
            case 1 -> {
                int size;
                do{
                    System.out.println("Enter size array");
                    size = scanner.nextInt();
                    if(size > 10){
                        System.out.println("Please re-Enter");
                    }
                } while (size > 10);
                int[] arrays = new int[size];
                for (int i = 0; i < arrays.length; i++){
                    System.out.println("Enter location : " + i);
                    arrays[i] = scanner.nextInt();
                }
                for(int j: arrays){
                    System.out.print(Arrays.toString(new int[]{j}));
                }
                System.out.println("\n Min in array");
                int min = arrays[arrays.length - 1];
                int index = 0;
                for (int k = 0; k < arrays.length; k++){
                    if(arrays[k] < min){
                        min = arrays[k];
                        index = k;
                    }
                }
                System.out.println("Mint in array " + min + " Location " + index);
            }
            default -> System.out.println("Please re-enter");
        }
    }
}
