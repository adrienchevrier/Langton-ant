/**
 * Created by adrien on 30/01/16.
 */
public class display{

    public static void map( LangtonAnt ant){
        for (int i = 0; i < ant.board.length; i++) {
            for (int j = 0; j < ant.board[0].length; j++) {
                if ((ant.p_x == i) && (ant.p_y==j) ){
                    System.out.printf("X");
                }
                else {
                    if (ant.board[i][j]) System.out.print(" ");
                    else System.out.print("W");
                }
            }
            System.out.println("|");
        }
    }




}
