package test;

public class Max {
    public static void main(String[] args) {
        System.out.println("Số lớn nhất: " + max(5,8));
        int z = max(5,10);
        System.out.println("max: " + z);

    }
    public static int max(int a, int b) {
        int total;
        if (a > b){
            total = a;
        } else {
            total = b;
        }
        return total;
    }
}
