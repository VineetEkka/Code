public class MaxOfThree {
    public static void main(String[] args) {

        double x, y,z;
        x=IO.readDouble();
        y=IO.readDouble();
        z=IO.readDouble();


        double max=x;

        if(y>max){
            max=y;
        }
        if(z>max){
            max=z;
        }
        IO.outputDoubleAnswer(max);


    }
}
