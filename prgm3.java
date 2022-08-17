import java.util.Scanner;

public class prgm3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        StringBuffer sbr1=new StringBuffer(str);
        StringBuffer sbr2=new StringBuffer("");
        System.out.println("The Capacity is: "+sbr1.capacity());
        for(int i=sbr1.length()-1,j=0;i>=0;i--,j++)
            sbr2.insert(j,sbr1.charAt(i));
        String st2=sbr2.toString().toUpperCase();
        System.out.println("Reverse is :"+sbr2);
        System.out.println("Uppercase Converted:"+st2);
        System.out.println("Enter 2nd String: ");
        sbr2=new StringBuffer(st2);
        str=sc.next();
        sbr2.append(str);
        System.out.println("Appended string is: "+sbr2);
    }
}