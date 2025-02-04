package ThirdFeb2025.Arrays2D.Third;
import java.util.Scanner;

public class printRow {
    public static void main(String[] args) {
        /*
         * Given a matrix of N rows and M columns, 
         * print it row by row. Firstly print 0th row, then 1st row, 2nd row and so on.
         * {{10 20 30 40},
            {50 60 70 80},
            {90 100 110 120}};
            -------output------------
            10  20  30  40 
            50  60  70  80
            90 100  110 120 
         */

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] a = new int[N][M];

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                a[i][j] = sc.nextInt();
            }
        }
         for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(a[i][j]+" ");
            }
             System.out.println("");
        }
    }

}
