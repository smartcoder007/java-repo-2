package corejava.prog;

public class Fibanaci {
    public static void main(String[] args) {
        for(int i=0; i<=20; i++)
        System.out.println(fib(i));
    }

    static int fib(int number){
        System.out.printf("number : %s%n ", number);
        if(number <=1){
            return 1;
        } else {

            return  fib(number -1) + fib (number-2);

        }
    }
}
