package xoaChenMang;

import java.util.Scanner;

public class ClearArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] M = new int[100];
        System.out.println("Nhập số phần tử cua mảng: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập M[%d]", i);
            M[i] = scanner.nextInt();
        }
        // xuất mảng
        for (int i = 0; i < n; i++) {
            System.out.printf(" M[%d] = %d\t", i , M[i]);
        }
        // xóa phần tử có giá trị bằng giá trị nhập
        System.out.println(" nhập giá trí xóa: ");
        int gt = scanner.nextInt();
        int vt = 0;
        for(int i = 0 ; i < n; i++){
            if(M[i] == gt){
                vt = i;
                break;
            }
        }
        for (int i = vt; i < n ; i++) {
            M[i] = M[i + 1];
            n--;
        }
        for (int i = 0; i < n; i++){
            System.out.printf("M[%d] = %d\n",i,M[i]);
        }
    }
}
