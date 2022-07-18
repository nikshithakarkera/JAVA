
    class const_over{
        double l;
        double b;
        double h;
    
    const_over(double l, double b, double h)
    { 
        this.l=l;
        this.b=b;
        this.h=h;
    }
        
    const_over(double l)
    {
        this.l=b=h=l;
    }
  double volume()
  {
    return l*b*h;
   }

   
  void print()
  {
    System.out.println("Method overlading");
  }
void print(double v)
{
    System.out.println("Volume of Box="+v);
}
  }

    public class constuctor_demo {
    public static void main(String[] args) {
        const_over cuboid=new const_over(10,20,30);
        const_over cube=new const_over(10);
        double v1=cuboid.volume();
        double v2=cube.volume();
        cuboid.print();
        cube.print();
        cuboid.print(v1);
        cube.print(v2);
    }
}
