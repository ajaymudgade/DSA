import java.util.*;

public class TimeComplexityDemo {
    //    Method 1 for finding Sum
    public int findSum(int n)
    {
        return n * (n + 1)/2;   // formula: for sum of numbers
    }

    //    Method 2 for finding sum
    public int findSum1(int n1)
    {
        int sum = 0;
        for (int i = 1; i<=n1; i++)
        {
            sum += i;
            System.out.println(i + " = " +sum);
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number: " );
        int num = sc.nextInt();
        double now = System.currentTimeMillis();
        TimeComplexityDemo demo = new TimeComplexityDemo();
//        System.out.println("Method 1 : Sum of First "+num+" = " +demo.findSum(num));
        System.out.println("Method 2 : Sum of First "+num+" = " +demo.findSum1(num));

        System.out.println("(Time Taken) Time Complexity : " +(System.currentTimeMillis() - now) +" MilliSeconds");
    }

}
