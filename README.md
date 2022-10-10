# Chess-Simulator
A Java project where I calculate the outcome of a chess game from its given state!


1-To find out the outcome of a chess game, simply put te pieces you want to the board at Game.java class.
  -To add a piece, example: B.putPiece(new Queen("white"), "a1"); 
  -You can check wether any teams King is under check or check mated. example: if (B.checkMate("black"))
           
2-This program can find out if there is an inevitable checkmate too! When there is not a checkmate but will certainly be in the next round, it is considered a checkmate.
