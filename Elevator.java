public class Elevator {
    private int floor;
    private int MaxFloor;
    private int MaxWeight;
    private int CurrentWeight;

    public Elevator(int floors, int MaxWeight){
        this.MaxWeight=MaxWeight;
        this.floors=floors;

    }

    public int getFloor() {
        return floor;
    }
    public boolean checkfloor(int floor){
        if(floor>MaxFloor|| floor<0){
            return floor;
        }
        else{

        }
    }
    public boolean checkWeight(int MaxWeight, int CurrentWeight){
        if(CurrentWeight>MaxWeight){
            return false;
        }
        else{
            return true;
        }

    }
}
