import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("M[" + i + "][" + j + "]: ");
                m[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.print("Principal Diagonal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(m[i][i] + " ");
        }
        System.out.println();
    }
}
