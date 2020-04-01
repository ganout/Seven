public class Playground {

    public static void main(String[] args) {
        
        //Création des joueurs
        Player player1 = new Player(UserInterface.askName());
        Player player2 = new Player(UserInterface.askName());

        //Affichage des règles
        boolean hasWant= UserInterface.askWantRules();
        if (hasWant) UserInterface.printRules();

        //Tour du joueurs 1
        Playground.playerTurn(player1);

        //Tour du joueurs 2
        Playground.playerTurn(player2);

        //Qui a gagné ?
        Playground.whoWon(player1, player2);
        
    }

    public static void playerTurn(Player player) {
        
        int diceRoll1 = 0;
        int diceRoll2 = 0;
        int sumOfDice = 0;
        boolean wantContinue = false;

        UserInterface.yourTurn(player);
        do {
            if (!wantContinue) UserInterface.sayPressKey();
            diceRoll1 = player.diceRoll();
            diceRoll2 = player.diceRoll();
            UserInterface.printDice(diceRoll1, diceRoll2);
            System.out.println();
            sumOfDice = diceRoll1 + diceRoll2;
            if (sumOfDice == 7) {
                player.setScore(0);
                UserInterface.sayCurrentScore(player);
            } else {
                player.setScore(player.getScore() + sumOfDice);
                UserInterface.sayCurrentScore(player);
                wantContinue = UserInterface.askWantContinue();
            }
        } while (player.getScore() != 0 && wantContinue);
    }

    public static void whoWon(Player player1, Player player2) {

        String winner = "";
        if (player1.getScore() < player2.getScore()) {
            winner = player2.getName();
            UserInterface.sayWinner(winner);
        } else if (player1.getScore() > player2.getScore()) {
            winner = player1.getName();
            UserInterface.sayWinner(winner);
        } else {
            UserInterface.sayDraw();
        }
    }
}