public class Duplicates {
    public static void main(String[] args) {
        int x,y,z;
        x=IO.readInt();
        y=IO.readInt();
        z=IO.readInt();
        if(x==y){
            IO.outputStringAnswer("True");

        }
        else{
            if(x==z){
                IO.outputStringAnswer("True");
            }
            else if(y==z){
                IO.outputStringAnswer("True");
            }
            else {
                IO.outputStringAnswer("False");
            }

        }

    }
}
