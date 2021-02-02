public class Compress {
    public static void main(String[] args) {
        System.out.println(compress("qqwwerrwr"));


    }

    public static String compress(String original){
        String other="";
            //int count=1;
        for(int i=0;i<original.length();i++) {
            int count=1;
            while(i+1<original.length()&&original.charAt(i)==original.charAt(i+1)){
                count++;
                i++;
            }
            if(count!=1){
                other=other+count;
            }
            other=other+original.charAt(i);


        }
        return other;

    }
}

