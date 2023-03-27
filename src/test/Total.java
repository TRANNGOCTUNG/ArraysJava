package test;

public class Total {
    public static void main(String[] args) {
        System.out.println("total 1 to 10 " + sum(1, 10));
        System.out.println("total 20 to 37 " + sum(20, 37));
        System.out.println("total 35 to 49 " + sum(35, 49));

    }
    public static int sum(int a, int b){
        int total = 0;
        for (int i = a; i <= b ; i++) {
            total += i;
        }
        return total;
    }
}
