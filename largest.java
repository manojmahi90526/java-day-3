import java.util.*;
class largestamong3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a>b)&&(a>c))
        {
        System.out.println("a is biggger");
        }
        else if((b>a)&&(b>c))
        {
        System.out.println("b is bigger");
        }
        else
        {
         System.out.println("c is bigger");
        }

    }
}