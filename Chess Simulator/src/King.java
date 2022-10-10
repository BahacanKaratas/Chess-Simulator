import java.util.Arrays;
public class King extends Piece {
    Piece checkBoard=new Piece("white");
    private String[][] strBoard=new String[8][8];
    public King(String color) {
        super(color);
        strBoard[0][0]="a8";
        strBoard[0][1]="b8";
        strBoard[0][2]="c8";
        strBoard[0][3]="d8";
        strBoard[0][4]="e8";
        strBoard[0][5]="f8";
        strBoard[0][6]="g8";
        strBoard[0][7]="h8";
        strBoard[1][0]="a7";
        strBoard[1][1]="b7";
        strBoard[1][2]="c7";
        strBoard[1][3]="d7";
        strBoard[1][4]="e7";
        strBoard[1][5]="f7";
        strBoard[1][6]="g7";
        strBoard[1][7]="h7";
        strBoard[2][0]="a6";
        strBoard[2][1]="b6";
        strBoard[2][2]="c6";
        strBoard[2][3]="d6";
        strBoard[2][4]="e6";
        strBoard[2][5]="f6";
        strBoard[2][6]="g6";
        strBoard[2][7]="h6";
        strBoard[3][0]="a5";
        strBoard[3][1]="b5";
        strBoard[3][2]="c5";
        strBoard[3][3]="d5";
        strBoard[3][4]="e5";
        strBoard[3][5]="f5";
        strBoard[3][6]="g5";
        strBoard[3][7]="h5";
        strBoard[4][0]="a4";
        strBoard[4][1]="b4";
        strBoard[4][2]="c4";
        strBoard[4][3]="d4";
        strBoard[4][4]="e4";
        strBoard[4][5]="f4";
        strBoard[4][6]="g4";
        strBoard[4][7]="h4";
        strBoard[5][0]="a3";
        strBoard[5][1]="b3";
        strBoard[5][2]="c3";
        strBoard[5][3]="d3";
        strBoard[5][4]="e3";
        strBoard[5][5]="f3";
        strBoard[5][6]="g3";
        strBoard[5][7]="h3";
        strBoard[6][0]="a2";
        strBoard[6][1]="b2";
        strBoard[6][2]="c2";
        strBoard[6][3]="d2";
        strBoard[6][4]="e2";
        strBoard[6][5]="f2";
        strBoard[6][6]="g2";
        strBoard[6][7]="h2";
        strBoard[7][0]="a1";
        strBoard[7][1]="b1";
        strBoard[7][2]="c1";
        strBoard[7][3]="d1";
        strBoard[7][4]="e1";
        strBoard[7][5]="f1";
        strBoard[7][6]="g1";
        strBoard[7][7]="h1";
    }
    public boolean canMove(String newPosition){
        int position1=checkBoard.findij(newPosition);
        int jWeWantToGo=position1%10;
        int iWeWantToGo=position1-jWeWantToGo;
        iWeWantToGo=iWeWantToGo/10;

        int position2=checkBoard.findij(this.getPosition());
        int jWeAreOn=position2%10;
        int iWeAreOn=position2-jWeAreOn;
        iWeAreOn=iWeAreOn/10;
        if(!(checkBoard.isPossible(newPosition))){
            return false;
        }
        if(jWeAreOn==jWeWantToGo && iWeAreOn==iWeWantToGo){
            return false;
        }
        if(jWeAreOn==jWeWantToGo || jWeAreOn+1==jWeWantToGo || jWeAreOn-1==jWeWantToGo ){
            if(iWeAreOn==iWeWantToGo || iWeAreOn+1==iWeWantToGo || iWeAreOn-1==iWeWantToGo){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    public String[] getAllMoves(){
        String[]returnThis=new String[64];
        int count=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(canMove(strBoard[i][j])){
                    returnThis[count]=strBoard[i][j];
                    count++;
                }
            }
        }
        count=0;
        for(int i=0;i<64;i++){
            if(returnThis[i]!=null){
                count++;
            }
        }
        String[]returnThis2=new String[count];
        for(int i=0;i<count;i++){
            returnThis2[i]=returnThis[i];
        }
        Arrays.sort(returnThis2);
        return returnThis2;
    }


}
