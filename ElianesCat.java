/*
   Brief Description of the Program:Adds both elianes and ana's cats
   input:ecats,anacats
   output:totalcats
   known bugs:None
   Author:Vineet
   Date:9/17/18
*/


public class ElianesCat {
    public static void main(String[] args) {

        System.out.println("Enter Elianes Cats");
        int ecats = IO.readInt();

        System.out.println("Enter Anas cats");
        int anascats = IO.readInt();

        int totalcats = ecats + anascats;

        IO.outputIntAnswer(totalcats);


    }


}
