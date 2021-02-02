public class CheckerN {
    public static void main(String[] args) {

    }
    public static int repeats(String text,String word){
        int count=0;
        if(text.substring(0).equals(" ")){
            return 0;
        }
        else if(text.charAt(0)==word.charAt(0)){
            count++;
            return(repeats(text.substring(1)),word);
        }
    }
}
