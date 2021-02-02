public class Recursion {
    public static void main(String[] args) {
        for (int n=1;n<=20;n++){

        }
    }
    public static int fib(int n){
        if (n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }

        return fib(n-1+fib(n-2));
    }
}
