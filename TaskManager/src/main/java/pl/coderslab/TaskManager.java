package pl.coderslab;


import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {

            useChance(menu);
            input();
        }

    public static void useChance(String[] array) {
        System.out.println(ConsoleColors.BLUE);
        System.out.println("Please select an option: " + ConsoleColors.RESET);
            for (String option : array) {
                System.out.println(option);
            }
    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();

        switch (scan) {
            case "add" :
                System.out.println("ADD");
                break;
            case "remove" :
                System.out.println("REMOVE");
                break;
            case "list" :
                System.out.println("LIST");
                break;
            case "exit" :
                System.out.println(ConsoleColors.RED);
                System.out.println("Koniec programu" + ConsoleColors.RESET);
                break;
            default:
                System.out.println("Please select a corret option.");
        }
    }
    //   static final String file = "tasks.csv";
    static final String[] menu = {"add", "remove", "list" , "exit" };
}
