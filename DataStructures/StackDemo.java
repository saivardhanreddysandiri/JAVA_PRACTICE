package DataStructures;

import java.util.Stack;

public class StackDemo {
    public static void main(String args[]){
        Stack<String> stack=new Stack<>();
        stack.push("America");
        stack.push("England");
        stack.push("India");

        // stores like top as India, England, America
        System.out.println(stack);

        String poppedElement=stack.pop();
        System.out.println(poppedElement);

        String topElement= stack.peek(); // Gives us the top element
        System.out.println(topElement);
    }
}
