import java.util.Scanner;

/**
 * Created by adrien on 30/01/16.
 */
public class test_ant {
    public static void main(String[] args) {

        //initialisation
        //board
        Scanner input = new Scanner(System.in);

        System.out.println("square size (number of cases on a line :");
        int squareLine = input.nextInt();
        System.out.println("init with 2 colors?(1/0)");
        int color = input.nextInt();
        boolean colorChoice;
        colorChoice = color == 1;

        LangtonAnt Ant = new LangtonAnt(squareLine / 2, squareLine / 2, squareLine, colorChoice);
        Attente wait = new Attente();
        System.out.println("coucou");
        System.out.println(Ant.board.length);
        System.out.println("OK");

       int iteration = 0;
        while (wait.Continue()) {
        iteration++;
            System.out.println("iteration num : "+ iteration);
            display.map(Ant);
            Ant.move();
        }

    }
}
