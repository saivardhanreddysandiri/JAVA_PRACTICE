package Operators;

public class Operators {
    public static void main(String args[]){
        int result;
        result=1+2;
        System.out.println(result);
        result=result*2;
        System.out.println(result);
        result=result/2;
        System.out.println(result);
        result=result%2;
        System.out.println(result);
        int unaryResult=1;
        unaryResult--;
        System.out.println(unaryResult);
        unaryResult++; //unaryResult will become to 1
        System.out.println(unaryResult);
        unaryResult=-unaryResult;
        System.out.println(unaryResult);
        boolean test=true;
        System.out.println(!test);
        int a=1,b=1,c=2;
        if(a==b){
        System.out.println("a==b");}
        if(a!=b){
        System.out.println("a!=b");}
        if((a==b)&(a!=b)){ System.out.println("true");}


        }
    public void display(){
     System.out.println("From Operators class");
    }
}
