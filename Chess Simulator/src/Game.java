
public class Game{
    public static void main(String[] args){
        Board B = new Board();
        B.putPiece(new King("black"), "a8");
        B.putPiece(new King("white"), "h1");
        B.putPiece(new Queen("white"), "a1");
        B.putPiece(new Rook("white"), "h8");
        B.putPiece(new Pawn("black"), "b7");
        B.putPiece(new Pawn("black"), "a7");

        if (B.check("black"))
            System.out.println("Black is checked");
        if (B.checkMate("black"))
            System.out.println("Black is mated");
        else
            System.out.println("------------------------");


    }

}
