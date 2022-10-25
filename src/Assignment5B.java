//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Assignment5B {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        String[][] array = new String[12][31];
        int intMonth, intDay;

        //fill arrays
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i ==0 && j >= 20) || (i == 1 && j < 19)) {
                    array[i][j] = "Aquarius";
                }
                else if (i ==1 || (i == 2 && j < 21)) {
                    array[i][j] = "Pisces";
                }
                else if (i ==2 || (i == 3 && j < 20)) {
                    array[i][j] = "Aries";
                }
                else if (i ==3 || (i == 4 && j < 21)) {
                    array[i][j] = "Taurus";
                }
                else if (i ==4 || (i == 5 && j < 22)) {
                    array[i][j] = "Gemini";
                }
                else if (i ==5 || (i == 6 && j < 23)) {
                    array[i][j] = "Cancer";
                }
                else if (i ==6 || (i == 7 && j < 23)) {
                    array[i][j] = "Leo";
                }
                else if (i ==7 || (i == 8 && j < 23)) {
                    array[i][j] = "Virgo";
                }
                else if (i ==8 || (i == 9 && j < 24)) {
                    array[i][j] = "Libra";
                }
                else if (i ==9 || (i == 10 && j < 22)) {
                    array[i][j] = "Scorpius";
                }
                else if (i ==10 || (i == 11 && j < 22)) {
                    array[i][j] = "Sagittarius";
                }
                else {
                    array[i][j] = "Aquarius";
                }
            }
        }
        //initial output and get input
        System.out.println("[What's your sign?]\nWhat month were you born in? ");
        intMonth = scan.nextInt() - 1;
        if (intMonth < 0 || intMonth > 11) {
            System.out.println("That is not a valid month...");
        }
        else {
            System.out.println("And what day? ");
            intDay = scan.nextInt() - 1;
            if (intDay < 0 || intDay > 30) {
                System.out.println("That is not a valid day...");
            }
            else {
                System.out.println("Your sign is " + array[intMonth][intDay] + "!");
            }
        }

    }
}