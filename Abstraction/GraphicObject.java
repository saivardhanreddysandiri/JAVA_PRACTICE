package Abstraction;

public abstract class GraphicObject {
    abstract void draw();
    abstract void size();
    GraphicObject(){
        System.out.println("Parent Abstract Class");
    }
}
