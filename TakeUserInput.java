import java.util.Scanner;
public class TakeUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type any valid number from 0-9");
        int number=sc.nextInt();
        System.out.println("So this is what you entered\t" +number);
    }
}
