import java.util.Scanner;

public class p27primeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number ");
        int n=sc.nextInt();

        boolean isPrime=true;

        if(n==2){
            System.out.println("n is  a prime number");
        }
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    isPrime=false;
                }
            }
            if(isPrime==true)
            {
                System.out.println("n is a prime number ");
            }
            else
            {
                System.out.println("n is not prime");
            }
           
        }
        }

    }

