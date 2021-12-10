package RockPaperScissorsShoot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class RockPaperScissor {
    public static void main(String[] args)  {

        Scanner scan = new Scanner(System.in);
        while (true) {
            String[] rocPapScis = {"rock", "paper", "scissors"};
            String computerTurn = rocPapScis[new Random().nextInt(rocPapScis.length)];
            String playerTurn ;
            String playerTwoTurn;

            //OUTPUT FOR MAIN MENU AND CHOICES DISPLAYED HERE
            System.out.println("MAIN MENU");
            System.out.println("=====");
            System.out.println("1. Type 'play' to play.");
            System.out.println("2. Type 'history' to view your game history.");
            System.out.println("3. Type 'quit' to stop playing.");

            // WHEN USER CHOOSES QUIT PROGRAM WILL END
            String menuChoice = scan.nextLine();
            if (menuChoice.equals("quit")) {
                System.out.println("Thanks for playing !");
                return;
            }
            //USING ELSE IF TO SAY IF THEY PICK PLAY INSTEAD THEN OUTPUT CHOICES FOR PLAYERS(HUMAN 0R COMP.)
            else if (menuChoice.equals("play")) {
                System.out.println(" Play with Computer or Human Player ? (type human for Human & computer for Computer \n\n");
            }

            //COMPUTER PLAYER LOGIC -> IF USER CHOSE COMPUTER THEN EXECUTE ALL THIS CODE WITH WIN CONDITIONS INSIDE
                else if(menuChoice.equals("computer")){
                    //LETTING USER KNOW WHO THEY ARE PLAYING WITH
                System.out.println("Playing with Computer");

                //DISPLAY GAME OPTIONS TO THE USER AND SCAN IN THEIR INPUT AND MAKE SURE THE INPUT IS VALID IF NOT THEN RETURN AN ERROR
                while (true) {
                    System.out.println("Type 'rock', 'paper', or 'scissors' to play.\n");
                    playerTurn = scan.nextLine();
                    playerTurn = playerTurn.trim();//removes extra white space
                    if (playerTurn.equals("rock") || playerTurn.equals("paper") || playerTurn.equals("scissors") || playerTurn.equals("quit")) {
                        break;
                        //TERMINATES LOOP ONCE USER CHOOSES ONE OF THE CHOICES ABOVE
                    }
                    System.out.println(playerTurn + "Invalid Input");
                    //RETURN ERROR FOR INVALID INPUT
                }
                if (playerTurn.equals("quit")) {
                    System.out.println("Bye !");
                    break;
                    //BREAKS OUT IF PLAYER TYPES QUIT
                }
                //DISPLAYS WHAT COMPUTER CHOSE
                System.out.println("Computer chose " + computerTurn);

                //BEGINNING OF WIN LOSE CONDITIONS FOR GAME
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
                }
            }   // computer if stmt
                //END OF WIN LOSE CONDITIONS


            // BEGINNING OF PLAYER TWO LOGIC
            else if (menuChoice.equals("human")) {
                // !!PASTED SAME CODE THAT I CREATED FOR COMPUTER LOGIC BUT CREATED PLAYERTWO!!
                //DISPLAYS TO USER WHO THEY CHOSE TO PLAY AGAINST
                System.out.println("Playing with Player Two (human)");


                //BEGINS WHILE LOOP FOR USER INPUT(PLAYER1 & PLAYER2)
                while (true) {
                    System.out.println("Player One can you type 'rock', 'paper', or 'scissors' to play .\n");
                    playerTurn = scan.nextLine();
                    playerTurn = playerTurn.trim();//TRIM() removes extra white space

                    if (playerTurn.equals("rock") || playerTurn.equals("paper") || playerTurn.equals("scissors") || playerTurn.equals("quit")) {
                        break;
                    }
                    System.out.println(playerTurn + "Invalid Input");

                    //DISPLAY TO PLAYER TWO THAT THEY ARE NEXT AND ASK FOR A VALID INPUT TO PLAY
                    System.out.println("Player Two can you type 'rock', 'paper', or 'scissors' to play .\n");
                    //BEGINNING TO SCAN FOR PLAYER TWO INPUT AND PASSING THROUGH IF STATEMENT
                    playerTwoTurn = scan.nextLine();
                    playerTwoTurn = playerTwoTurn.trim();

                    if (playerTwoTurn.equals("rock") || playerTwoTurn.equals("paper") || playerTwoTurn.equals("scissors") || playerTwoTurn.equals("quit")) {
                        break;
                    }
                    System.out.println(playerTwoTurn + "Invalid Input");
                } //END OF WHILE LOOP FOR USER INPUT(PLAYER1 & PLAYER2)


                //BEGINNING OF QUIT STATEMENTS FOR BOTH PLAYER! & PLAYER2
                if (playerTwoTurn.equals("quit")) {
                    System.out.println("Bye Player two!");
                    break;
                } else if (playerTurn.equals("quit")) {
                    System.out.println("Bye Player One!");
                    break;
                }
                //END OF QUIT STATEMENTS FOR BOTH PLAYER! & PLAYER2

                //DISPLAY USER INPUT OF PLAYER TURN
                System.out.println("Player two chose " + playerTwoTurn);

                //START OF WIN LOSE CONDITIONALS FOR PLAYER1 & PLAYER2
                if (playerTurn.equals(playerTwoTurn)) {
                    System.out.println("Tie");

                } else if (playerTurn.equals("rock")) {

                    if (playerTwoTurn.equals("paper")) {
                        System.out.println("You lost");

                    } else if (playerTwoTurn.equals("scissors")) {
                        System.out.println("You won");
                    }
                } else if (playerTurn.equals("paper")) {
                    if (playerTwoTurn.equals("rock")) {
                        System.out.println("You won");

                    } else if (playerTwoTurn.equals("scissors")) {
                        System.out.println("You lost");
                    }
                } else if (playerTurn.equals("scissor")) {
                    if (playerTwoTurn.equals("paper")) {
                        System.out.println("You won");

                    } else if (playerTwoTurn.equals("rock")) {
                        System.out.println("You lost");
                    }
                }
                //END OF WIN LOSE CONDITIONALS FOR PLAYER1 & PLAYER2
            } //IF STMNT FOR PLAYER! & PLAYER2


        } // TOP WHILE LOOP END


    //HISTORY ELSE STATEMENT >> WAS NOT ABLE TO READ OR WRITE INTO IT WITHOUT AN ERROR WILL ONLY DISPLAY THAT IT HAS BEEN UPDATED
    //            else if(menuChoice.equals("history")) {
    //                //print to file ->
    ////                FileWriter historyWriter = new FileWriter(("gamehistory.txt"));
    ////                historyWriter.write("history\n" +
    ////                        "=== GAME HISTORY ===");
    ////                historyWriter.write("Player Picked " + playerTurn + ", " + "computer picked " + computerTurn  );
    ////                historyWriter.close();
    ////                System.out.println("Game History Saved");
    ////
    ////                //read from file
    ////                Scanner historyReader = new Scanner(("gamehistory.txt"));
    ////                while(historyReader.hasNextLine()){
    ////                    String gameHistory = historyReader.nextLine();
    ////                    System.out.println(gameHistory);
    ////                }
    //
    //            }
//        Scanner.close();
        }
    }



