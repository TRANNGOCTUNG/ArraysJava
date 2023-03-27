package exercise;

import java.util.Scanner;

public class NhapMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập M hàng: = ");
        int m = scanner.nextInt();
        System.out.println(" Nhập N côt: =");
        int n = scanner.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(" array["+ i +"]["+ j +"] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
