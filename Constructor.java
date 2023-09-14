
class Add
{
    int a,b;
    int c;
    Add()
    {
        a = 0;
        b = 0;
        c = 0;
    }
    Add(int a,int b)
    {
        this();
        this.a = a;
        this.b = b;
    }
    void display()
    {
        c = a+b;
        System.out.println("The sum is : "+c);
    }
}
public class Constructor {
    public  static  void main(String[] args)
    {
        Add obj = new Add(10,20);
        obj.display();
    }
}
