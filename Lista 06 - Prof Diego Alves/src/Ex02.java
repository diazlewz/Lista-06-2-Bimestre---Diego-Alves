import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("M[" + i + "][" + j + "]: ");
                m[i][j] = Integer.parseInt(sc.nextLine());
                soma += m[i][j];
            }
        }

        System.out.println("Soma: " + soma);
    }
}

