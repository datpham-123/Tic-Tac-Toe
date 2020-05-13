Tic Tac Toe game

Author: dat pham

1. Run game:

- run game through Main.java
- you can set first player (default: TicTacToe game = new TicTacToe("X") ). You can change to "O"

2. How it's work

- enter coordinate for row and column: (you must enter value from 0-2)
- example board coordinate: 
(0,0), (0,1), (0,2)
(1,0), (1,1), (1,2)
(2,0), (2,1), (2,2)

- You win if:
 	- you first reach 3 "X" or "O" in a row
	- you first reach 3 "X" or "O" in a column
	- you first reach 3 "X" or "O" in a diagonal

3. Code detail

- code has 3 class: + TicTacToe.java : main logic of the game
		    + Main.java : this is where you run the program
		    + Validate.java: use to validate if user enter a valid integer number 
		    (not a character, and must in range 0-2 )	

TY!
