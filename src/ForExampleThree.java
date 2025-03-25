import java.util.Scanner;

public class ForExampleThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tub=0;
     out:   for (int i = 2; i <= n; i++) {
            for (int j = 2; j<i/2 ; j++) {
                if (i%j == 0){
                    continue out;
                }
            }
         System.out.println(i);
        }
    }
}
