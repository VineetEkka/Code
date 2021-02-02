public class NumberOfDigits{

        public static void main (String[] args) {

            System.out.print("Enter an integer: ");
            int number = IO.readInt();
            int digits = 0;
            while (number !=0) {
                number/=10;
                digits ++;
            }
            IO.outputIntAnswer(digits);

        }

}
