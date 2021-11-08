package lesson01;

import java.util.Scanner;

public class HelloWorld {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input array length, please");
        int n = scanner.nextInt();
        double number[]= new double[n];
        System.out.println("Input array element, please");
        for(int i=0; i<n; i++)
        {
            System.out.printf("a[%d] = ", i);
            number[i] = scanner.nextInt();
        }
        System.out.println("Array element");
        show(number);
        count_even_odd(number);
        max_value(number);
        avg_value(number);
        sort_min_max(number);
        show(number);
        factorial(6);
    }

    public static void count_even_odd(double[] arr)
    {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]%2==0 )
            {
                even = even + 1;
            }
            else
            {
                odd = odd + 1;
            }
        }
        System.out.println("even element = "+ even);
        System.out.println("odd element = "+ odd);
    }
    public static void show (double[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void max_value(double [] arr)
    {
        double max = 0;
        for (int i=0; i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("max value in array = " +max);
    }

    public static void avg_value (double [] arr)
    {
        double avg = 0;
        double sum = 0;
        for (int i=0; i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        avg = sum/arr.length;
        System.out.format("The average is: %.3f", avg);
        System.out.println();
    }

    public static void sort_min_max (double [] arr)
    {
        double temp = 0;
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void factorial (int a)
    {
        int result = 1;
        for (int i =1; i<=a; i++)
        {
             result = result*i;
        }
        System.out.println("Factorial Result = "+result);
    }
}
