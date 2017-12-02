import java.util.*;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Number");
        int a = s.nextInt();
        int n = a;
        int rNum = 0;
        int r;
        while(n > 0) 
        {
            r = n % 10;
            rNum = rNum*10 + r;
            n = n / 10;
        }
        if(a==rNum) System.out.println("Palindrome\nPlease Exit");
        else System.out.println("Not Palindrome\nPlease Exit");
        System.out.println("\n\n\n\n\n\nBy Sam");
    }
}
