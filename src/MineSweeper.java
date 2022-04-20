import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class MineSweeper {
    Scanner input = new Scanner(System.in);
    int col;
    static int line;
    String[][] map = new String[line][col];
    String[][] game = new String[line][col];

    MineSweeper(int sutun, int satir) {
        this.line = satir;
        this.col = sutun;
        this.map = new String[line][col];
        this.game = new String[line][col];
    }

    public void PlayGame() {
        int foundMine = 0;
        while (isWin(map)) {
            System.out.println("Hedefinizi girin.");
            System.out.print("Satır: ");
            int a = input.nextInt();
            System.out.print("Sutun: ");
            int b = input.nextInt();
            if ((a < 0 || a > map.length - 1) && (b < 0 || b > map.length - 1)) {
                System.out.println("Lütfen limitleri zorlamayın. Geçerli sayıları girin...");
                continue;
            }
            if (map[a][b].equals(" * ")) {
                System.out.println(":(((((((((((");
                System.out.println("Kaybettiniz.");
                System.out.println(":(((((((((((");
                break;
            }
            if (a == 0 && b == 0 && map[a][b].equals(" - ")) {
                if (map[a - 1][b].equals(" * ")) {
                    foundMine++;
                }
                if (map[a - 1][b + 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a][b + 1].equals(" * ")) {
                    foundMine++;
                }
                game[a][b] = " " + Integer.toString(foundMine);
                map[a][b] = " " + Integer.toString(foundMine);
                foundMine = 0;
            }
            if (a == 0 && b == map[0].length - 1 && map[a][b].equals(" - ")) {
                if (map[a + 1][b].equals(" * ")) {
                    foundMine++;
                }
                if (map[a + 1][b - 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a][b - 1].equals(" * ")) {
                    foundMine++;
                }
                game[a][b] = " " + Integer.toString(foundMine);
                map[a][b] = " " + Integer.toString(foundMine);
                foundMine = 0;
            }
            if (a == map.length - 1 && b == 0 && map[a][b].equals(" - ")) {
                if (map[a - 1][b].equals(" * ")) {
                    foundMine++;
                }
                if (map[a - 1][b + 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a][b + 1].equals(" * ")) {
                    foundMine++;
                }
                game[a][b] = " " + Integer.toString(foundMine);
                map[a][b] = " " + Integer.toString(foundMine);
                foundMine = 0;
            }
            if (a == map.length - 1 && b == map[0].length - 1 && map[a][b].equals(" - ")) {
                if (map[a][b - 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a - 1][b - 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a - 1][b].equals(" * ")) {
                    foundMine++;
                }
                game[a][b] = " " + Integer.toString(foundMine);
                map[a][b] = " " + Integer.toString(foundMine);
                foundMine = 0;
            }
            if (a == 0 && b > 0 && b < map[0].length - 1) {
                if (map[a][b - 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a][b + 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a + 1][b - 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a + 1][b].equals(" * ")) {
                    foundMine++;
                }
                if (map[a + 1][b + 1].equals(" * ")) {
                    foundMine++;
                }
                game[a][b] = "  " + Integer.toString(foundMine);
                map[a][b] = "  " + Integer.toString(foundMine);
                foundMine = 0;
            }
            if (a > 0 && a < map.length - 1 && b == 0) {
                if (map[a - 1][b].equals(" * ")) {
                    foundMine++;
                }
                if (map[a - 1][b + 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a][b + 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a + 1][b].equals(" * ")) {
                    foundMine++;
                }
                if (map[a + 1][b + 1].equals(" * ")) {
                    foundMine++;
                }
                game[a][b] = "  " + Integer.toString(foundMine);
                map[a][b] = "  " + Integer.toString(foundMine);
                foundMine = 0;
            }
            if (a == map.length - 1 && b > 0 && b < map[0].length - 1) {
                if (map[a][b - 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a][b + 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a - 1][b - 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a - 1][b].equals(" * ")) {
                    foundMine++;
                }
                if (map[a - 1][b + 1].equals(" * ")) {
                    foundMine++;
                }
                game[a][b] = "  " + Integer.toString(foundMine);
                map[a][b] = "  " + Integer.toString(foundMine);
                foundMine = 0;
            }
            if (a > 0 && a < map.length - 1 && b == map[0].length - 1) {
                if (map[a - 1][b].equals(" * ")) {
                    foundMine++;
                }
                if (map[a - 1][b - 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a][b - 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a + 1][b - 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a + 1][b].equals(" * ")) {
                    foundMine++;
                }
                game[a][b] = "  " + Integer.toString(foundMine);
                map[a][b] = "  " + Integer.toString(foundMine);
                foundMine = 0;

            }
            if (a > 0 && a < map.length - 1 && b > 0 && b < map[0].length - 1 && map[a][b].equals(" - ")) {
                if (map[a - 1][b].equals(" * ")) {
                    foundMine++;
                }
                if (map[a + 1][b].equals(" * ")) {
                    foundMine++;
                }
                if (map[a][b - 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a][b + 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a - 1][b + 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a - 1][b - 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a + 1][b - 1].equals(" * ")) {
                    foundMine++;
                }
                if (map[a + 1][a + 1].equals(" * ")) {
                    foundMine++;
                }

                game[a][b] = "  " + Integer.toString(foundMine);
                map[a][b] = "  " + Integer.toString(foundMine);
                foundMine = 0;
            }
            Print();
        }
        if (!isWin(map)){
            System.out.println("Tebrikler mayınlara basmadan oyunu bitirdiniz.");
        }
    }
    public void Print() {
        System.out.println("***********-Mine Map-*************");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        System.out.println("***********-Game Map-*************");
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game.length; j++) {
                System.out.print(game[i][j]);
            }
            System.out.println();
        }
    }

    public void Run() {
        Random rnd = new Random();
        int mineCounter = (col * line) / 4;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == null) {
                    map[i][j] = " - ";
                }
            }
        }
        while (mineCounter > 0) {
            int rndLine = rnd.nextInt(this.line);
            int rndCol = rnd.nextInt(this.col);
            if (map[rndLine][rndCol].equals(" - ") == true) {
                map[rndLine][rndCol] = " * ";
            }
            mineCounter--;
        }
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game.length; j++) {
                if (game[i][j] == null) {
                    game[i][j] = " - ";
                }
            }
        }
        Print();
        PlayGame();
    }
    public boolean isWin ( String[][] finish ) {
        for (String[] a : finish ) {
            for ( String b : a ) {
                if ( b.equals(" - ") ) {
                    return true;
                }
            }
        }
        return false;
    }

}
