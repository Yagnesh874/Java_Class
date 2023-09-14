import java.util.Scanner;

class Overload
{
    void square(double a)
    {
        double ans = 0;
        ans = a*a;
        System.out.println("The sqaure is : "+ans);
    }
    void area(double l,double b)
    {
        double ans = 0;
        ans = l*b;
        System.out.println("The area of rectangle is : "+ans);
    }
}

public class Method_Overloading {
    public  static  void main(String[] args)
    {
        Overload obj  = new Overload();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double n = sc.nextDouble();
        obj.square(n);
        System.out.println("Enter a number : ");
        double l = sc.nextDouble();
        System.out.println("Enter a number 2 : ");
        double b = sc.nextDouble();
        obj.area(l,b);
    }
}
