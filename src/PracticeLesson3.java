import java.util.Scanner;

public class PracticeLesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massiv hajmini kiriting ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println(n + " ta son kiriting ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int zeroNumber = array[0];
        int zero = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                    System.out.print (array[i]+ " ");
                }
            }
        }
    }
}