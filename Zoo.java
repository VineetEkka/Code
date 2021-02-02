public class Zoo {
    public static void main(String[] args) {
        int count=1;
        int giraffes=0;
        int lions=0;
        int snakes=0;
        int totalGiraffes=0;
        int totalLions=0;
        int totalSnakes=0;

        IO.outputStringAnswer("Enter number of Zoos:");
        int zoo=IO.readInt();

        while (zoo>0){
            IO.outputStringAnswer("Enter the amount of giraffes for zoo "+count);
             giraffes=IO.readInt();
            IO.outputStringAnswer("Enter the amount of lions for zoo "+count);
            lions=IO.readInt();
            IO.outputStringAnswer("Enter the amount of snakes for zoo "+count);

              snakes=IO.readInt();
              totalGiraffes+=giraffes;
              totalLions+=lions;
              totalSnakes+=snakes;
            count++;
            zoo--;
        }
        IO.outputIntAnswer(totalGiraffes);
        IO.outputIntAnswer(totalLions);
        IO.outputIntAnswer(totalSnakes);

    }
}
