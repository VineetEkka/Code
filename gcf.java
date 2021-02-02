public class gcf {
    public static void main(String[] args) {

    }
    public static int gcff(int x, int y){
        int gc=0;

        for(int i=x;i>0;i--){
            if(x%i==0&& y%i==0){
                gc=i;
            }

        }
        return gc;


    }
}
