package Inheritance;

public class InheritanceDemo {
    public static void main(String args[]){
        MountainBike objBike=new MountainBike(20,90,5);
        System.out.println("Accessing the super class property speed " +objBike.speed);
        objBike.applybrake(5);
        System.out.println("Accessing the Behavoir or method from Super class " +objBike.speed);
    }
}
