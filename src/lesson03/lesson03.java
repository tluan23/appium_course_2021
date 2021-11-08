package lesson03;

import java.util.Scanner;

public class lesson03 {
    public static void main(String[] args) {
    //cal_Minute();
        check_Password();
    }
    public static void cal_Minute()
    {
        String myText = "2hrs and 5 minutes";
        String [] output = myText.split("and");
        char hours = output[0].trim().charAt(0);
        char minutes = output[1].trim().charAt(0);
        int h = Character.getNumericValue(hours);
        int m = Character.getNumericValue(minutes);
        int totalMinutes = (h*60)+m;
        System.out.println(totalMinutes);
    }
    public static void check_Password()
    {
        String myPassword ="password123";
        Scanner scanner = new Scanner(System.in);

        int check = 0;
        while (check != 3)
        {
            System.out.println("Input password please");
            String password = scanner.nextLine();
            if(!password.equals(myPassword))
            {
                check = check+1;
            }
            else
            {
                System.out.println("Congratulation");
                break;
            }
        }
        if (check==3)
        {
            System.out.println("Wrong password too many times");
        }
    }
}
