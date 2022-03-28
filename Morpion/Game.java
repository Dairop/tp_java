import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Game {
    private int[][] table = new int[3][3];
    private int tour = 1;
    private boolean finished = false;
    private Boolean win = false;

    public void Game(){
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                table[i][j] = 0;
            }
        }

        this.tour = 1;
        this.finished = false;

        this.win = false;
    }


    public void Jouer(int x, int y){
        if (finished) return;

        this.table[x][y] = this.tour;

        //test have won
        //row
        int conseq = 0;
        for (int i = 0; i < table[x].length && !win; i++){
            if (table[x][i] == this.tour){
                conseq++;
            } else {
                conseq = 0;
            }
            win = (conseq == 3 || win);
        }

        //column
        conseq = 0;
        for (int i = 0; i < table[x].length && !win; i++){
            if (table[i][y] == this.tour){
                conseq++;
            } else {
                conseq = 0;
            }
            win = (conseq == 3 || win);
        }

        //diag1
        conseq = 0;
        for (int i = 0; i < table.length && !win; i++){
            if (table[i][i] == this.tour){
                conseq++;
            } else {
                conseq = 0;
            }
            win = (conseq == 3 || win);
        }

        //diag2
        conseq = 0;
        for (int i = table.length-1; i >= 0 && !win; i--){
            if (table[table.length-i-1][i] == this.tour){
                conseq++;
            } else {
                conseq = 0;
            }
            win = (conseq == 3 || win);
        }


        if (win){
            System.out.println("The player "+this.tour+" won");
            this.finished = true;
        } else {
            Boolean notFull = false;
            for (int i = 0; i < table.length && !notFull; i++){
                for (int j = 0; j < table[i].length; j++){
                    if (this.table[i][j] == 0){
                        notFull = true;
                    }
                }
            }

            if (!notFull){
                this.finished = true; 
                System.out.println("Game ended in a draw");
            }
        }


        this.tour = this.tour%2 + 1;
    }



    public String toString(){
        String s = "";
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                s += table[i][j];
            }
            s+="\n";
        }

        return s;
    }


    public void printTable(){
        System.out.println(this.toString());
    }


    public int[][] getTable() {
        return table;
    }

}
