package Abstraction;

public class AbstractionDemo {
    public static void main(String args[]){
        GraphicObject objOfSubClass = new Rectangle();
//         Here we are not instantiated the Abstract class but we have created Sub class
//         and creating an reference of Abstract class by  subclass.
        objOfSubClass.draw();
        objOfSubClass.size();
    }
}
