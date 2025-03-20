package LoopingStatements;

public class IfElseStatements {
    public static void main(String args[]){
        int score=68;
        char grade;
        if(score>=75){ grade='A';}
        else if (score>=70){ grade='B';}
        else if (score>=60){ grade='C';}
        else if (score>=50){ grade='D' ;}
        else { grade='F'; }
        System.out.println("Garde "+grade);
    }
}
