package Interface;

public class MountainBik implements Bike{
    private int speed;
    int gear;
    int height;

    public MountainBik(int speed, int gear, int height){
        this.speed = speed;
        this.gear = gear;
        this.height = height;
    }
    public void applyBrake(int decrement){
        speed = speed-decrement;
    }
    public void applySpeed(int increament){
        speed = speed+increament;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHeight() {
        return height;
    }
}
