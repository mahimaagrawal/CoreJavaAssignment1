import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a=");
        int a=sc.nextInt();
        System.out.print("b=");
        int b=sc.nextInt();
        int total=a+b;
        System.out.println("a+b="+total);
    }
}
