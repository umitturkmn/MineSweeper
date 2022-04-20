import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int col,line;
        System.out.println("*******************************************");
        System.out.println("****-MAYIN TARLASI OYUNUNA HOŞGELDİNİZ-****");
        System.out.println("*******************************************");
        System.out.println("Oyunun genişliğini belirleyin.");
        System.out.print("Satır aralığını girin: ");
        line = input.nextInt();
        System.out.print("Sutun aralığını girin: ");
        col = input.nextInt();
        MineSweeper mine = new MineSweeper(line,col);
        mine.Run();


    }
}
