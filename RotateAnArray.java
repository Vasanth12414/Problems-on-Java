import java.util.Scanner;
import java.util.Random;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int n = sc.nextInt();
        int not = sc.nextInt();
        int [] arr = new int[n];
        int i;
        for(i=0; i<n; i++)
        {
            arr[i] = rnd.nextInt(100);
        }
        for(i=0; i<n; i++)
        {
            System.out.printf("%d ",arr[i]);
        }
        System.out.println();
        not = (not % n);
        int result[] = new int[n];
        int index = 0;
        long start = System.currentTimeMillis();
        for(i=n-not; i<n; i++)
        {
            result[index++] = arr[i];
        }
        for(i=0; i<n-not; i++)
        {
            result[index++] = arr[i];
        }
        for(i=0; i<n; i++)
        {
            System.out.printf("%d ", result[i]);
        }
        long end = System.currentTimeMillis();
        double TimeTaken = (end - start)/1000.00;
        System.out.printf("%.3f ",TimeTaken);
        sc.close();
    }
}
