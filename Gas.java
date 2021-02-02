public class Gas {
    public static void main(String[] args) {
        IO.outputStringAnswer("Enter cost of gallon of gas:");
        double cost=IO.readDouble();
        IO.outputStringAnswer("Enter the amount of gas");
        double gallons=IO.readDouble();
        IO.outputStringAnswer("Is customer paying with credit card?");
        boolean pay=IO.readBoolean();
        if(pay==true){
            double total=cost*gallons;
            IO.outputDoubleAnswer((total*.10)+total);
        }
        else{
            IO.outputDoubleAnswer(cost*gallons);
        }

    }
}
