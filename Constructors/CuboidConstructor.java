package Constructors;

public class CuboidConstructor {
    int length;
    int width;
    int height;

    public CuboidConstructor(int length, int width, int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }

    public CuboidConstructor(int length, int width){
        this.length=length;
        this.width=width;
        this.height=10;
    }

    public CuboidConstructor(int dimension){
        this.length=dimension;
        this.width=dimension;
        this.height=dimension;
    }

    public CuboidConstructor(){
        this.length=10;
        this.width=10;
        this.height=10;
    }

    int volume(){
        return length*width*height;
    }

    public static void main(String args[]){
        int volume;
        CuboidConstructor firstConstructor= new CuboidConstructor(10,20,30);
        volume = firstConstructor.volume();
        System.out.println(volume);

        CuboidConstructor secondConstructor= new CuboidConstructor(10,20);
        volume = secondConstructor.volume();
        System.out.println(volume);

        CuboidConstructor thirdConstructor= new CuboidConstructor(10);
        volume = thirdConstructor.volume();
        System.out.println(volume);

        CuboidConstructor lastConstructor= new CuboidConstructor();
        volume = lastConstructor.volume();
        System.out.println(volume);
    }
}
