import java.util.Scanner;

public class UniqueEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int freq[] = new int[n];  
        int i, j;

        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < n; i++) {
            if (arr[i] == -1)
                continue;

            int count = 1; 

            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;                 }
            }

            freq[i] = count;
        }


for(i=0; i<n; i++)
{
    System.out.printf("%d " , freq[i]);
}

        
        System.out.println("\nElement Frequencies:");
        for (i = 0; i < n; i++) {
            if (arr[i] != -1) {
                System.out.printf("%d occurs %d time(s)\n", arr[i], freq[i]);
            }
        }

        
        for (i = 0; i < n; i++) {
            if (arr[i] != -1 && freq[i] == 1) {
                System.out.printf("\nThe Unique Element is: %d\n", arr[i]);
                break; 
            }
        }

        sc.close();
    }
}
