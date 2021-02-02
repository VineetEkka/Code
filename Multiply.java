public class Multiply {
    public static void main(String[] args) {
        int x, y;
        /*
        System.out.println("Enter Number");
        x=IO.readInt();
        System.out.println("Enter Number");
        y=IO.readInt();
        IO.outputIntAnswer((x*y));
        */
        int n = IO.readInt();
//horizontally
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n ; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }

    }
}
