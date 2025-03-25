import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massiv hajmini kiritin ");
        int n = scanner.nextInt();
        int [] array = new int [n];
        System.out.println(n + " ta son kiriting ");
        for (int i = 0; i < n; i++) {
            array[i]=scanner.nextInt();
        }
        int max = 0;
        int max2 = 0;
        for (int i = 0; i <n ; i++) {
               if(max<array[i]){
                   max2=max;
                max = array[i];
               }
               if(array[i]<max && array[i]>max2){
                   max2=array[i];
               }
        }
        System.out.println("Massivdagi eng katta son " + max);
        System.out.println("Massivdagi 2-eng katta son " + max2);

    }
}
