package shape;

public class Pac_Demo_main {
    public static void main(String[] args)
    {
        Square square=new Square();
        Triangle triangle=new Triangle();
        Circle circle=new Circle();
        square.getData((float)5.5);
        System.out.println("The area of square is:"+square.area());
        triangle.getData(20.56, 23.90);
        System.out.println("The area of triangle is:"+triangle.area());
        circle.getData(5.5);
        System.out.println("The area of circle is:"+circle.area());
    }
}
