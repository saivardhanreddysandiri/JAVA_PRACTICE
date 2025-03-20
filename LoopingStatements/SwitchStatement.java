package LoopingStatements;

public class SwitchStatement {
    public static void main(String args[]){
        int month = 8;
        String monthString;
        switch (month){
            case 1:
                monthString="Jan";
                break;
            case 2:
                monthString="Feb";
                break;
            case 3:
                monthString="March";
                break;
            case 4:
                monthString="April";
                break;
            case 5:
                monthString="May";
                break;
            case 6:
                monthString="June";
                break;
            case 7:
                monthString="July";
                break;
            case 8:
                monthString="August";
                break;
            case 9:
                monthString="Sept";
                break;
            case 10:
                monthString="Oct";
                break;
            case 11:
                monthString="Nov";
                break;
            case 12:
                monthString="Dec";
                break;
            default:
                monthString="Invalid Month";
                break;

        }
        System.out.println(monthString);
    }
}
