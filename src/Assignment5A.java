//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
class Assignment5A {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in), scan2 = new Scanner(System.in);
        int intInput, intInput2, intCount = 0;
        String strInput, strTemp;
        String[] array = new String[5];
        boolean boolStop = false;

        //initialize array with blanks and first output
        Arrays.fill(array, " ");
        System.out.println("[Top 5 Friend's List]");

        //looping menu
        while (!boolStop) {
            System.out.print("What would you like to do?\n1) Enter a friend's name\n2) Replace a friend's name\n3) Display your friends list\n4) Quit\nYour choice: ");
            intInput = scan.nextInt();
            System.out.println("");
            switch(intInput) {

                //add friend to next available index
                case 1:
                    if (intCount >= 5) {
                        System.out.println("Sorry, your friends list is full!\n");
                        break;
                    }
                    System.out.print("Enter a name: ");
                    strInput = scan2.nextLine();
                    for (int i = 0; i < 5; i++) {
                        if (Objects.equals(array[i], strInput)) {
                            System.out.println("Sorry, they're already on the list!");
                            break;
                        }
                    }
                    array[intCount] = strInput;
                    System.out.println("");
                    intCount++;
                    break;

                //replace friend
                case 2:
                    System.out.println("Enter a name: ");
                    strInput = scan2.nextLine();
                    for (int i = 0; i < 5; i++) {
                        if (Objects.equals(array[i], strInput)) {
                            System.out.println("Sorry, they're already on the list!");
                            break;
                        }
                    }
                    System.out.println("Enter an index: ");
                    intInput2 = scan2.nextInt();
                    if (intInput2 < 0 || intInput2 > 4) {
                        System.out.println("Sorry, that’s an invalid command!");
                        break;
                    }
                    strTemp = array[intInput2];
                    array[intInput2] = strInput;
                    System.out.println("\n" + strInput + " has replaced " + strTemp + " on your friends list!\n");
                    break;

                //view friends list
                case 3:
                    System.out.println("Friend's List:");
                    for (int i =0; i <5; i++) {
                        System.out.println((i + 1) + ") " + array[i]);
                    }
                    break;

                //quit
                case 4:
                    boolStop = true;
                    break;
                default:
                    System.out.println("Sorry, that’s an invalid command!");
                    break;
                }
            }
        }
    }