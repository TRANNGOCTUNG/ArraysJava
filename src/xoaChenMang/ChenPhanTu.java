package xoaChenMang;

import java.util.Scanner;

public class ChenPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] M = new int[100];
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập M[%d]",i);
            M[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("M[%d] = %d\n",i,M[i]);
        }
        System.out.println(" Nhập giá trị chèn: ");
        int gt = scanner.nextInt();
        System.out.printf(" Nhập vị trí chèn: ");
        int vt = scanner.nextInt();
        for (int i = n - 1; i >= vt ; i--) {
            M[i + 1] = M[i];
        }
        M[vt] = gt;
        n++;
        for (int i = 0; i < n; i++) {
            System.out.printf("M[%d] = %d\n ",i,M[i]);
        }
    }
}
