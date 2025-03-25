import java.util.Scanner;

public class PracticeLesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massiv Hajmini kiriting ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        boolean d = true;
        int first = array[0];
        System.out.println(n + " ta son kiriting");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i-1]) {
                d = false;
                break;
            }

        }
        System.out.println(d);
    }
}