import java.util.Scanner;

public interface UserInterface {

    public static String askName() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nNew player, enter your name :");
        return input.nextLine();
    }

    public static boolean askWantRules() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nDo you want to view the rules ?\n");
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

    public static void printRules () {

        System.out.println();
        System.out.println("                                          ~~~~~~~~~~~~~~~~~~~");
        System.out.println("                             ▂ ▃ ▄ ▅ ▆ ▇ █ THE GAME OF SEVEN █ ▇ ▆ ▅ ▄ ▃ ▂");
        System.out.println("                                          ~~~~~~~~~~~~~~~~~~~");
        System.out.println("    ----------------------------------------------------------------------------------------------");
        System.out.println("    |                                                                                            |");
        System.out.println("    |              The game of seven is played with two players and two dice of six              |");
        System.out.println("    |              ----------------------------------------------------------------              |");
        System.out.println("    |                                                                                            |");
        System.out.println("    |   1) Player 1 turn :                                                                       |");
        System.out.println("    |       - The first player rolls the dice.                                                   |");
        System.out.println("    |       - while he doesn't make seven, he can re-roll the dice and his score adds up.        |");
        System.out.println("    |       - he can either :                                                                    |");
        System.out.println("    |               * Roll the dice again and his score adds up.                                 |");
        System.out.println("    |               * Decide to stop.                                                            |");
        System.out.println("    |       - If he makes seven, his score goes to zero and his turn ends.                       |");
        System.out.println("    |                                                                                            |");
        System.out.println("    |   2) Player 2 turn :                                                                       |");
        System.out.println("    |       - He must obey the same rules as the 1st player.                                     |");
        System.out.println("    |                                                                                            |");
        System.out.println("    |   3) At the end of the round, the player with the highest score wins.                      |");
        System.out.println("    |                                                                                            |");
        System.out.println("    |                                                                                            |");
        System.out.println("    |                                        ⚀ ⚁ ⚂ ⚃ ⚄ ⚅                                         |");
        System.out.println("    |                                         ¯\\_(ツ)_/¯                                         |");
        System.out.println("    ----------------------------------------------------------------------------------------------\n");
        System.out.println("    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  Let's play  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    public static void yourTurn(Player player) {

        System.out.println("\n" + player.getName() + ", It's your turn");
    }

    public static void sayPressKey() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nPress enter to roll the dice");
        input.nextLine();
    }

    public static void sayCurrentScore(Player player) {

        System.out.println("\n  --> Your current score is : " + player.getScore() + "\n");
    }
    
    public static boolean askWantContinue() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nDo you want roll the dice again ? yes or no\n");
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

        System.out.println("\nWrite only yes or no please\n");
    }

    public static void sayWinner(String nameWinner) {

        System.out.println("\n  --> The winner is : " + nameWinner + " ＼＼٩(＾o＾ )و //／／\n");
    }

    public static void sayDraw() {

        System.out.println("\n  --> Equality !\n");
    }

    public static void printDice(int number1, int number2) { 
        
        String [] one = {
            " ______________ ",
            "/              \\",
            "|     1111     |",
            "|   111111     |",
            "|   111111     |",
            "|     1111     |",
            "|     1111     |",
            "|     1111     |",
            "|   11111111   |",
            "\\______________/",
        };

        String [] two = {
            " ______________ ",
            "/              \\",
            "|   22222222   |",
            "| 2222    2222 |",
            "|         2222 |",
            "|     222222   |",
            "|   2222       |",
            "| 2222         |",
            "| 222222222222 |",
            "\\______________/",
        };

        String [] three = {
            " ______________ ",
            "/              \\",
            "|   33333333   |",
            "| 3333    3333 |",
            "|         3333 |",
            "|     333333   |",
            "|         3333 |",
            "| 3333    3333 |",
            "|   33333333   |",
            "\\______________/",
        };

        String [] four = {
            " ______________ ",
            "/              \\",
            "| 4444    4444 |",
            "| 4444    4444 |",
            "| 4444    4444 |",
            "| 4444    4444 |",
            "|   4444444444 |",
            "|         4444 |",
            "|         4444 |",
            "\\______________/",
        };

        String [] five = {
            " ______________ ",
            "/              \\",
            "| 555555555555 |",
            "| 5555         |",
            "| 5555555555   |",
            "|         5555 |",
            "|         5555 |",
            "| 5555    5555 |",
            "|   55555555   |",
            "\\______________/",
        };

        String [] six = {
            " ______________ ",
            "/              \\",
            "|   66666666   |",
            "| 6666    6666 |",
            "| 6666         |",
            "| 6666666666   |",
            "| 6666    6666 |",
            "| 6666    6666 |",
            "|   66666666   |",
            "\\______________/",
        };

        String [][] matrice = {one, two, three, four, five, six};
        
        for (int i = 0; i < 10;i++) {
            System.out.println(matrice[number1 - 1][i] + "  " + matrice[number2 - 1][i]);
        }
    }
}