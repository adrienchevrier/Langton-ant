import java.util.Random;

/**
 * Created by adrien on 30/01/16.
 */
public class table {

    protected boolean board[][];

    //constructors
    //default constructor
    public table (){
        boolean newboard1[][] = new boolean[Consts.DEFAULT_LENGTH][Consts.DEFAULT_LENGTH];
        for (int i = 0; i < Consts.DEFAULT_LENGTH; i++) {
            for (int j = 0; j < Consts.DEFAULT_LENGTH; j++) {
                board[i][j]=Consts.WHITE;
            }
        }
        board = newboard1;

    }
    //constructor with possibility to init with black cases
    public table(int length, boolean both){
       boolean newboard2[][] = new boolean[length][length];
        if (!both){
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    newboard2[i][j] = Consts.WHITE;
                }
            }
            board = newboard2;
        }
        else {
            Random rand = new Random();
            boolean newboard3[][] = new boolean[length][length];
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    boolean color = rand.nextBoolean();
                    newboard3[i][j] = color;

                }
            }
            board = newboard3;
            }

    }

    public boolean[][] getBoard() {
        return board;
    }

    public boolean getInstance(int x, int y) {
        return this.board[x][y];
    }

}

