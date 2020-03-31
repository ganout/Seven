import java.util.Scanner;

public interface UserInterface {

    public static void sayPressKey() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nPress a key to roll the dice");
        input.nextLine();
    }

    public static void sayResult(int dice1, int dice2) {

        System.out.println("The first dice roll is " + dice1 + " and second is " + dice2);
        System.out.println("The sum of dice is : " + (dice1 + dice2) + "\n");
    }

    public static void sayCurrentScore(Player player) {

        System.out.println("\n  --> Your current score is : " + player.getScore() + "\n");
    }
    
    public static boolean askWantContinue() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nDo you want roll the dice again ?\n");
        String answer = input.next();
        while (!(answer.equals("yes") || answer.equals("no"))) {
            UserInterface.badAnswer();
            answer = input.next();
        }
        if (answer.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public static void badAnswer() {

        System.out.println("\n'/_\\Write only yes or no please\n");
    }

    public static void sayWinner(String nameWinner) {

        System.out.println("\n  --> The winner is : " + nameWinner + "\n");
    }

    public static void sayDraw() {

        System.out.println("\n  --> Equality !!!\n");
    }

}