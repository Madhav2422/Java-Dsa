public class p41funoverloading {

    public static int sum(int a ,int b)
    {
        return a+b;
    }
    public static int sum(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }
    public static void main(String[] args) {
        System.out.println("Sum of  " + sum(2,3));
        System.out.println("Sum of  " + sum(2,3,5,6));

    }
}
