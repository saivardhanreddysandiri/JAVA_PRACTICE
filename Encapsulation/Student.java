package Encapsulation;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }

    public static void main(String args[]){
        Student object=new Student("Sai",25,"Hampton Cir");
        System.out.println(object.getName());
        System.out.println(object.getAge());
        System.out.println(object.getAddress());
        object.setName("vardhan");
        System.out.println(object.getName());
    }

}
