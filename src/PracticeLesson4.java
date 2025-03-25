import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeLesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massiv hajmini kiriting ");
        int n = scanner.nextInt();
        int [] array = new int[n];
        System.out.println(n+" ta son kiriting");
        for (int i = 0; i < n; i++) {
            array[i]=scanner.nextInt();
        }
        int max =array[0];
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if(array[i]<min){
                min=array[i];
                }
            if(max<array[i]){
                max=array[i];
            }
            }
        System.out.println("massivdagi eng kichik son " + min + " ga teng");
        System.out.println("massivdagi eng katta son " + max + " ga teng");

    }
}
