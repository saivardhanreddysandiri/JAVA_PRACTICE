package Operators;

public class TernaryOperator {
    public static void main(String args[]){
        int a=10,b=20;
        int result;
        result=a<b ? a:b;
//      The below code is same as above one statement
//      if(a>b){result=a;}
//        else{result=b;}
        System.out.println(result);
    }
}
