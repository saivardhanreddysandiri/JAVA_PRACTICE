package Inheritance;

public class Bike {
    public int speed;
    public int gear;

    public Bike(int bikeSpeed, int bikegear){
        speed=bikeSpeed;
        gear=bikegear;
    }

    public void applybrake(int s){
        speed= speed-s;
    }
}
