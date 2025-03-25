import java.util.Scanner;

public class PracticeLesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massiv hajmini kiriting ");
        int n = scanner.nextInt();
        int [] array = new int[n];
        System.out.println(n + " ta son kiriting");
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            array[i]=scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println("Massivdagi sonlar yig'indisi "+sum + " ga teng");
    }
}
