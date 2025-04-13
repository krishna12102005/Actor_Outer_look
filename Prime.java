import java.util.Scanner;
class A
{
    String Show_Prime()
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        boolean Prime = true;
        if(n==0 || n==1)
        {
            Prime = false;
        }
        else
        {
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    Prime = false;
                }
            }
        }
        if(Prime)
        {
            return ("The given number is Prime");
        }
        else 
        {
            return ("The given number is not a Prime");
        }
    }
   
}
public class Prime
{
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.Show_Prime());
    }
}