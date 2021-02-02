public class Loops {
    public static void main(String[] args) {
        int sum=0;
        int upperBound;

        do{
            System.out.println("Please enter an upper bound");
            upperBound=IO.readInt();
        }while (upperBound<0);
        for (int i=0;i<=upperBound;i++){
            sum=sum+i;
        }
        IO.outputIntAnswer(sum);
    }
}
