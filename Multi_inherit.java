import java.nio.channels.ScatteringByteChannel;
import  java.util.*;
class Student
{
    int reg_no;
    void getNo(int no)
    {
        reg_no = no;
    }
    void putNo()
    {
        System.out.println("Register number : "+reg_no);
    }
}
class marks extends  Student
{
    float marks;
    void getMarks(float m)
    {
        marks = m;
    }
    void putmarks()
    {
        System.out.println("Marks = "+marks);
    }
}
public class Multi_inherit {
    Scanner sc = new Scanner(System.in);

}

