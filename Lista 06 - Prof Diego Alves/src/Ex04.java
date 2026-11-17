import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] m = new int[2][3];
        int pares = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("M[" + i + "][" + j + "]: ");
                m[i][j] = Integer.parseInt(sc.nextLine());
                if (m[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }

        System.out.println("Quantia de pares: " + pares);
    }
}
