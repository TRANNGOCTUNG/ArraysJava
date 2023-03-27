package practice;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class SearchValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_name;
        int Size;
        do {
            System.out.println("Enter size of newArrays");
            Size = scanner.nextInt();
            if(Size > 10) {
                System.out.println("Please  re-enter");
            }
        } while (Size > 10);

        String[] newArrays = new String[Size];
        int i = 0;
        while (i < newArrays.length) {
            System.out.println("Nhập vị tri thứ " + i);
            newArrays[i] = scanner.nextLine();
            i++;
        }

        System.out.println(" Array after import ");
        for (String a: newArrays) {
            System.out.print(Arrays.toString(new String[]{a}));
        }
        System.out.println("\n Enter name need search");
        input_name = scanner.nextLine();

         boolean isExit = false;
        for (int j = 0; j < newArrays.length; j++) {
            if(newArrays[j].equals(input_name)){
                System.out.println("Name need search " + input_name + " Location " + i);
                isExit = true;
                break;
            }
        }
        if(!isExit){
            System.out.println("Not found" + input_name + " in the list " );
        }
    }
}
