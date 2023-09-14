interface Polygon
{
    void getArea(int length,int breadth);
}
class rectangle implements Polygon
{
    public void getArea(int length,int breadth)
    {
        System.out.println("Thea area of rectangle is : "+length * breadth);
    }

}

class interfaceMain {
    public static void main(String[] args) {
        rectangle s1 = new rectangle();
        s1.getArea(5,6);
    }
}
