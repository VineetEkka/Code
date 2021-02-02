public class Vote {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        int age=IO.readInt();
        if(age>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("Can't vote");
        }
    }
}
