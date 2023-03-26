package exercise;

public class NhoNhatTrongMang2Chieuf {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3,4},
                {5,6,7,8}
        };
        int min = numbers[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng 2 chiều là: " + min);
    }

}
