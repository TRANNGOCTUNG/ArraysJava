package exercise;

public class LonNhatMang2Chieu {
    public static void main(String[] args) {
        int [] [] array = {
                {1,2,3,4},
                {4,5,6,7}
        };
        int max =  array[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4 ; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("giá trị lớn nhất trong mảng 2 chiều là:  " + max);
    }
}
