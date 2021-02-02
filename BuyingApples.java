public class BuyingApples {
    public static void main(String[] args) {
        double pounds=0.0;
        double apples=0.0;
        IO.outputStringAnswer("Enter cost per LB: ");
        apples=IO.readDouble();
        IO.outputStringAnswer("Enter number of pounds: ");
        pounds=IO.readDouble();
        IO.outputDoubleAnswer(apples*pounds);

    }
}
