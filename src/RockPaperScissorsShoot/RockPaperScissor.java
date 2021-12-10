package RockPaperScissorsShoot;

import java.util.Random;
import java.util.Scanner;


public class RockPaperScissor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            String[] rocPapScis = {"rock", "paper", "scissors"};
            String computerTurn = rocPapScis[new Random().nextInt(rocPapScis.length)];
            String playerTurn;
            System.out.println("MAIN MENU");
            System.out.println("=====");
            System.out.println("1. Type 'play' to play.");
            System.out.println("2. Type 'history' to view your game history.");
            System.out.println("3. Type 'quit' to stop playing.");

            String menuChoice = scan.nextLine();
            if (menuChoice.equals("quit")) {
                return;
            } else if (menuChoice.equals("play")) {

                while (true) {
                    System.out.println("Type 'rock', 'paper', or 'scissors' to play.\n");
                    playerTurn = scan.nextLine();
                    playerTurn = playerTurn.trim();
                    if (playerTurn.equals("rock") || playerTurn.equals("paper") || playerTurn.equals("scissors") || playerTurn.equals("quit")) {
                        break;
                    }
                    System.out.println(playerTurn + "Invalid Input");
                }
                if (playerTurn.equals("quit")) {
                    System.out.println("Bye !");
                    break;
                }
                System.out.println("Computer chose " + computerTurn);

                if (playerTurn.equals(computerTurn)) {
                    System.out.println("Tie");

                } else if (playerTurn.equals("rock")) {

                    if (computerTurn.equals("paper")) {
                        System.out.println("You lost");

                    } else if (computerTurn.equals("scissors")) {
                        System.out.println("You won");
                    }
                } else if (playerTurn.equals("paper")) {
                    if (computerTurn.equals("rock")) {
                        System.out.println("You won");

                    } else if (computerTurn.equals("scissors")) {
                        System.out.println("You lost");
                    }
                } else if (playerTurn.equals("scissor")) {
                    if (computerTurn.equals("paper")) {
                        System.out.println("You won");

                    } else if (computerTurn.equals("rock")) {
                        System.out.println("You lost");
                    }
                //print results to file
                }

            }//play if stmt
            else if(menuChoice.equals("history")){
                //print to file ->
                //read from file
            }
        }
//        scan.close();

    }
}
//

