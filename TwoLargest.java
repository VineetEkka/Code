public class TwoLargest {
    public static void main(String[] args) {
        double terminate,nextTerm;
        double max1=(-1*(Double.MAX_VALUE));
        double max2=0;
        int count=0;
        terminate=IO.readDouble();
        do{
             nextTerm=IO.readDouble();
             if(nextTerm!=terminate&& nextTerm>=max1){
                 max1=nextTerm;

                 if(max1<max2||nextTerm==max1){
                    if(max1<max2)
                     max2=max1;
                 }

                 System.out.println("YO");
                 count++;

             }

             else if(nextTerm<max1 && nextTerm!=terminate &&nextTerm>0){

                     max2=nextTerm;


                 System.out.println("aight");
                 count++;
             }


             else if(nextTerm<max2 && nextTerm!=terminate){
                 max2=nextTerm;
                 System.out.println("nei");
                 count++;
             }

        }while (nextTerm!=terminate);
        if(count==1){
            IO.outputDoubleAnswer(max1);
            IO.outputDoubleAnswer(max1);

        }
        else{
            IO.outputDoubleAnswer(max1);
            IO.outputDoubleAnswer(max2);

        }

    }
}
