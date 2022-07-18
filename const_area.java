class Area{
   float l,b,h;

double rect(double h,double b)
{
  return h*b;
}
double rect(float b)
{
  return 2*b;
}
double rect (float h,float b)
{
  return 0.5*h*b;
}
}
    public class const_area {
    public static void main(String[] args) {
      Area a=new Area();
        double rect=a.rect(10,20);
        double square=a.rect(10);
        double triangle=a.rect(10,20);
        System.out.println("Area of rectangle is:"+rect);
        System.out.println("Area of square is:"+square);
        System.out.println("Area of triangle is:"+triangle);
    }
}