import  java.util.*;
class product
{
    String p_name;
    int p_code;
    String m_name;
    product()
    {
        p_code = 0;
        p_name = "NULL";
        m_name = "NULL";
    }
    product(String p_name,int p_code,String m_name)
    {
        this();
        this.p_name = p_name;
        this.p_code = p_code;
        this.m_name = m_name;
    }
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a product name : ");
        p_name = sc.next();
        System.out.println("Enter a product code : ");
        p_code = sc.nextInt();
        System.out.println("Enter a manufacter name : ");
        m_name = sc.next();
    }
    void display()
    {
        System.out.println("The product name is : "+p_name);
        System.out.println("The product code is : "+p_code);
        System.out.println("The manufacture name is : "+m_name);
    }
}
public class Test_product {
    public  static  void main(String[] args)
    {
        product obj = new product();
        obj.getdata();
        obj.display();

    }
}
