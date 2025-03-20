package Inheritance;

public class MountainBike extends Bike{
    public int height;

    public MountainBike(int bikeHeight, int bikeSpee, int bikegear){
        super(bikeSpee,bikegear);
        height=bikeHeight;

    }
}
