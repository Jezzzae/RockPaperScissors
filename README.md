# RockPaperScissors

<img height="200" src="C:\Users\GWC-CHC-14\Desktop\rocpap.png" width="350"/>







# **Feature Requirements**

_My Game's Features:_

1. Has a main menu with options to enter 2 players or vs. computer.


2. If the user enters 2 players, they should be able to play rock–paper–scissors against a human competitor.


3. If the user enters vs. computer, they should be able to play against the computer.
When the game is over, the winner should be declared.

# Technical Requirements

* Use's classes to remove repetitive parts of code, and create an abstract Player class to manage the state of the player (if they won or lost, how many points they have, what move they made).


* Handle invalid user input.


* Handle incorrect capitalization of otherwise valid user input ("rock," "Rock," "RoCk," "ROCK," and more).


* Each class (including a Player class) should have methods associated with it and be instantiated as an object (as opposed to a singleton or an interface).


* Use public, private, and static variables, methods, and members within each class appropriately.


* Incorporate exception handling to make sure your game crashes gracefully if it receives bad input.


* Get standard input with Java using a Scanner, or use Processing to get mouse, keyboard, or other input.
Use arrays or array lists to store game history (if applicable).

# GamePlay Deliverables
```Welcome to Rock, Paper, Scissors!

MAIN MENU
=====
1. Type 'play' to play.
2. Type 'history' to view your game history.
3. Type 'quit' to stop playing.

play


Type 'rock', 'paper', or 'scissors' to play.
Type 'quit' to go back to the main menu.

rock
Computer picks: scissors
User picks: rock
You win!

Welcome to Rock, Paper, Scissors!

MAIN MENU
=====
1. Type 'play' to play.
2. Type 'history' to view your game history.
3. Type 'quit' to stop playing.

play


Type 'rock', 'paper', or 'scissors' to play.
Type 'quit' to go back to the main menu.

paper
Computer picks: scissors
User picks: paper
You lose!

Welcome to Rock, Paper, Scissors!

MAIN MENU
=====
1. Type 'play' to play.
2. Type 'history' to view your game history.
3. Type 'quit' to stop playing.

history
=== GAME HISTORY ===
WIN: Player picked rock, computer picked scissors
LOSS: Player picked paper, computer picked scissors

Welcome to Rock, Paper, Scissors!

MAIN MENU
=====
1. Type 'play' to play.
2. Type 'history' to view your game history.
3. Type 'quit' to stop playing.

quit```