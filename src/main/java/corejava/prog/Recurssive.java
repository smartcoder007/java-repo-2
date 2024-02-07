package corejava.prog;


public class Recurssive {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("Sum : " + result);
    }
    static int sum(int k) {
        if (k == 1) {
            System.out.println(k);
            return 1;
        } else {
            System.out.println(k);
             return k + sum(k - 1);
        }
    }
}

