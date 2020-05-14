#  Tic Tac Toe game

----
##Run game:
see [Wikipedia](https://en.wikipedia.org/wiki/Tic-tac-toe)

- run game through Main.java
- you can set first player (default: TicTacToe game = new TicTacToe("X") ). You can change to "O"

----
## How it's work
- enter coordinate for row and column: (you must enter value from 0-2)
- example board coordinate: 

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (0,0), (0,1), (0,2)
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (1,0), (1,1), (1,2)
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (2,0), (2,1), (2,2)

----
- You win if:
      - you first reach 3 "X" or "O" in a row
      - you first reach 3 "X" or "O" in a column
      - you first reach 3 "X" or "O" in a diagonal

## Code detail
- program 3 class:
     + TicTacToe.java: main logic of the game
     + Main.java: this is where you run the program
     + Validate.java: use to validate if user enter a valid integer number 
   (not a character, and must in range 0-2 )	

----
## changelog
* 14-May-2020 re-design
