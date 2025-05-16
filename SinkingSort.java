
import java.util.Random;
import java.util.Scanner;

class SinkingSort 
{
    private static  void swap(int arr[] , int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i , j;
        for(i=0; i<n; i++)
        {
            arr[i] = rnd.nextInt(300);
        }
        for(i=0; i<n; i++)
        {
            System.out.printf("%d ",arr[i]);
        }
        System.out.println();
        // int temp;
        for(i=0; i<n-1; i++)
        {
            for(j=0; j<n-1-i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    // temp = arr[j];
                    // arr[j] = arr[j+1];
                    // arr[j+1] = temp;
                    swap(arr,j,j+1);
                }
                
            }
        }
        for(i=0; i<n; i++ )
        {
            System.out.printf("%d ",arr[i]);
        }
        sc.close();
        
    }
}