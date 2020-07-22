package GymManagement;

import gym.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        boolean condition = true;

//        while (condition) {
            int Value;
            System.out.println("   MENU    ");
            System.out.println(" Options:                 ");
            System.out.println("        1. Add Member       ");
            System.out.println("        2. Delete Member      ");
            System.out.println("        3. Print member list          ");
            System.out.println("        4. Sort Member          ");
            System.out.println("        5. Write / Save in a file          ");
            System.out.println("        6. Open a GUI           ");
            System.out.println("        7. Exit           ");
          

            myGymManager gymManager = new myGymManager();
            System.out.println("Select Option");
            Scanner in = new Scanner(System.in);
            Value = in.nextInt();
            
            switch (Value) {
                case 1:
                    System.out.println("Add Member selected");
                    gymManager.addMember();
                    System.out.println("Member Added");

                    break;
                case 2:
                    System.out.println("Delete Member selected");
                    //list1 = list.remove(s);
                    //System.out.println(list);
                    break;
                case 3:
                    System.out.println("Print list selected");
                    //System.out.println(list);
                    break;
                case 4:
                    System.out.println("Sort member selected");
                    //Collections.sort(list);
                    //System.out.print(list);
                    break;
                case 5:
                    System.out.println("Write/save selected");
                    //list.save(s);
                    //System.out.println(list);
                    break;
                case 6:
                    System.out.println("Open interface selected");
                    break;
                case 7:
                    condition = false;
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
//        }
    }
}