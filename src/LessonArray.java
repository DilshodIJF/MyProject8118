import java.util.Scanner;

public class LessonArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[]= new int [n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+ " ");

        }



//        int a[]={4, 5, 8, 2, 12, 45, 56, 45, 89, 98, 15, 22};
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum+=a[i];
//        }
//        System.out.println(sum);
    }
}
