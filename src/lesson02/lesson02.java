package lesson02;
import java.util.Scanner;
public class lesson02 {
    public static void main(String[] args) {
        //printing_out_star();
        find_indices();
    }
    public static void printing_out_star()
    {
        System.out.println("Please input a number to printing out star");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = n;i>0;i--) {
            for (int j = i; j>0;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void find_indices()
    {
        int [] arr = {1,2,3,4,5,6};
        int inputNum = 13;
        boolean result = false;
        for (int i=0; i<arr.length;i++)
        {
            for (int j = i+1; j<arr.length;j++)
            {
                if ((arr[i]+arr[j])==inputNum)
                {
                    System.out.println(i+","+j);
                    //System.out.println();
                    result = true;
                }
            }
        }
        if (result == false)
        {
            System.out.println("we don't have any pair");
        }
    }
}
