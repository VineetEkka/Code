public class StringRec {
    public static void main(String[] args) {
        System.out.println(decompress("3qr"));
        String s = null;

        int[][] array = {{1, 2, 3}, 4};


    }
    public static String decompress(String compressedText){
        String other="";
        if(compressedText.length()<=1){
            return compressedText;
        }
        if(compressedText.charAt(0)==49){
            return decompress(compressedText.substring(1));
        }
        if(compressedText.charAt(0)>49 && compressedText.charAt(0)<=57){
            char t=compressedText.charAt(0);
            t--;
            other=t+compressedText.substring(1);
            return compressedText.substring(1,2)+decompress(other);

        }
        return compressedText.charAt(0)+decompress(compressedText.substring(1));

    }
}
