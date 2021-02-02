public class AppendRec {
    public static void main(String[] args) {
        System.out.println( appendNTimes("cat",0));


    }





    public static String appendNTimes(String original,int n) {
        if (n == 0) {
           // return original+next;
            return original;
        }
        else {
            return original+appendNTimes(original,n-1);
           // next= appendNTimes(original,n-1);
            //return next;
        }
    }






}
