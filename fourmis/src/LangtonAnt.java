/**
 * Created by adrien on 30/01/16.
 */
public class LangtonAnt extends table{
    //ressources declaration
   protected int p_x;
    protected int p_y;
    protected char orientation;

    //containers
    public LangtonAnt(int x, int y,int length, boolean both){
        super(length,both);
        p_x = x;
        p_y = y;
        orientation = Consts.LOOKING_TOP;

    }

    public LangtonAnt(){
        super();
        p_x = Consts.DEFAULT_ANT_POS;
        p_y = Consts.DEFAULT_ANT_POS;
        orientation = Consts.LOOKING_TOP;

    }
    //get Methods
    public int getP_x(){
        return p_x;
    }
    public int getP_y(){
        return p_y;
    }
    public int getOrientation() {
        return orientation;
    }
    public int getSize(){return board.length;}

    //set methods
    public void setP_x(int x){
        this.p_x = x;
    }
    public void setP_y(int y){
        this.p_y = y;
    }
    public void setOrientation(char orientation) {
        this.orientation = orientation;
    }

    /*
    Ant movements method
    Input none
    Output none
    Ant turns right if on white case
    Ant turns left if on black case
    Case is inverted when ant is on a case
    */
    public void move(){
        //register old positions
        int old_x = p_x;
        int old_y = p_y;

        this.InvertCase();
            if (!board[p_x][p_y]){
                //Ant turns right
                    switch (orientation) {
                            case Consts.LOOKING_TOP:
                                p_y++;
                                orientation = Consts.LOOKING_RIGHT;
                                break;
                            case Consts.LOOKING_BOT:
                                p_y--;
                                orientation = Consts.LOOKING_LEFT;
                                break;

                            case Consts.LOOKING_LEFT:
                                p_x--;
                                orientation = Consts.LOOKING_TOP;
                                break;

                            case Consts.LOOKING_RIGHT:
                                p_x++;
                                orientation = Consts.LOOKING_BOT;
                                break;
                            default:
                                System.out.println("error_orientation");
                    }
            }
        else {
                //Ant turns left
                switch (orientation) {
                    case Consts.LOOKING_TOP:
                        p_y--;
                        orientation = Consts.LOOKING_RIGHT;
                        break;

                    case Consts.LOOKING_BOT:
                        p_y++;
                        orientation = Consts.LOOKING_LEFT;
                        break;

                    case Consts.LOOKING_LEFT:
                        p_x++;
                        orientation = Consts.LOOKING_TOP;
                        break;

                    case Consts.LOOKING_RIGHT:
                        p_x--;
                        orientation = Consts.LOOKING_BOT;
                        break;
                    default:
                        System.out.println("error_orientation");
                }


        }
        OutOfTable(old_x,old_y);
    }

    public void InvertCase(){
        board[p_x][p_y]= ! board[p_x][p_y];
    }

   public void OutOfTable(int back_x, int back_y){
       if((p_x>=this.getSize()) || (p_x < 0) || (p_y >= this.getSize()) || (p_y <0)){
           p_x = back_x;
           p_y = back_y;
       }
   }


}
