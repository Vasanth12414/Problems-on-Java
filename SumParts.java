import java.util.Scanner;;
public class SumParts 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if(n <= 1)
        {
            System.out.println("Take More Than 1");
        }

        if(n == 2)
        {
            System.out.println("2");
        }
        if(n == 3)
        {
            System.out.println("3");
        }
        while(n>0)
        {
            if(n == 4)
            {
                System.out.println("2 2");
                break;
            }
            else if(n >= 3)
            {
                System.out.println("3");
                n = n-3;
            }
            else 
            {
                System.out.println(n +" ");
                break;
            }

        }



        sc.close();
    }
}