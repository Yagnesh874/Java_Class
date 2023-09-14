interface demo
{
    final static float pi= 3.14f;
    void get(float pi,float r);
}
class rectangle1 implements demo
{
     public void get(float pi,float r)
     {
         System.out.println("The area of circle is : "+pi*r*r);
     }
}
class circle implements demo
{
    public void get(float pi,float r)
    {
        System.out.println("The area of circle is : "+r*r);
    }
}
public class DemoInterface {
    public static void main(String[] args) {
        rectangle1 s1 = new rectangle1();
        circle s2 = new circle();
        s1.get(3.14f,2);
        s2.get(3.14f,1);
    }
}
