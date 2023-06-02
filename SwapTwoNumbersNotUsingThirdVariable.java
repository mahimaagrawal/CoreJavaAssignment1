public class SwapTwoNumbersNotUsingThirdVariable {
    public static void main(String[] args) {
        int a=5;
        int b=8;
        System.out.println("Before Swapping 2 Numbers");
        System.out.println("a="+a);
        System.out.println("b="+b);
        a=a+b;//13
        b=a-b;//13-8=5
        a=a-b;//13-5=8
        System.out.println("After Swapping 2 Numbers");
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}
