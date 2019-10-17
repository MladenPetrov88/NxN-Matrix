import java.util.Scanner;

public class NxNMatrix {

    public static void NxNMatrix (int number) {
        for (int i = 0; i < number; i++) {
            NxNMatrixOfRows(number);
        }
    }

    public static void NxNMatrixOfRows (int lastNumber) {
        for (int i = 0; i < lastNumber; i++) {
            System.out.print(lastNumber + " ");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        NxNMatrix(number);
    }
}
