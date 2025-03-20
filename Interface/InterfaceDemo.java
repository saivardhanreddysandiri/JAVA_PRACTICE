package Interface;


public class InterfaceDemo {
    public static void main(String args[]){
        MountainBik objClass = new MountainBik(10,20,5);
        System.out.println(objClass.getSpeed());
        System.out.println(objClass.getGear());
        System.out.println(objClass.getHeight());
        objClass.applyBrake(3);
        System.out.println(objClass.getSpeed());
        objClass.applySpeed(5);
        System.out.println(objClass.getSpeed());

    }
}
