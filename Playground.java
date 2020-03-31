public class Playground {

    public static void main(String[] args) {
        
        //Création des joueurs
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        //Tour du joueurs 1
        int diceRoll1 = 0;
        int diceRoll2 = 0;
        int sumOfDice = 0;
        boolean wantContinue = false;

        do {
            UserInterface.sayPressKey();
            diceRoll1 = player1.diceRoll();
            diceRoll2 = player1.diceRoll();
            sumOfDice = diceRoll1 + diceRoll2;
            UserInterface.sayResult(diceRoll1, diceRoll2);
            if (sumOfDice == 7) {
                player1.setScore(0);
                UserInterface.sayCurrentScore(player1);
            } else {
                player1.setScore(player1.getScore() + sumOfDice);
                UserInterface.sayCurrentScore(player1);
                wantContinue = UserInterface.askWantContinue();
            }
        } while (player1.getScore() != 0 && wantContinue);

        //Tour du joueurs 2
        do {
            UserInterface.sayPressKey();
            diceRoll1 = player2.diceRoll();
            diceRoll2 = player2.diceRoll();
            sumOfDice = diceRoll1 + diceRoll2;
            UserInterface.sayResult(diceRoll1, diceRoll2);
            if (sumOfDice == 7) {
                player2.setScore(0);
                UserInterface.sayCurrentScore(player2);
            } else {
                player2.setScore(player2.getScore() + sumOfDice);
                UserInterface.sayCurrentScore(player2);
                wantContinue = UserInterface.askWantContinue();
            }
        } while (player2.getScore() != 0 && wantContinue);

        //Qui a gagné ?
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