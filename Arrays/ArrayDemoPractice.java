package Arrays;

public class ArrayDemoPractice {
    public static void main(String args[]){
        int[] anArray; //declares ana array of integers
        anArray = new int[10];// allocation of memory takes place here
        char[] charArray;
        charArray=new char[5];
        String[] stringArray;
        stringArray=new String[5];

        anArray[0]=10; //initialize first element
        anArray[1]=20; //initialize second element same way for all till index 9 as we have created array length as 10
        System.out.println(anArray[0]);
        System.out.println(anArray[1]);

        charArray[0]='a';
        stringArray[0]="Sai";
        System.out.println(charArray[0]);
        System.out.println(stringArray[0]);

    }
}
