package lesson03;

import java.util.Scanner;

public class lesson03 {
    public static void main(String[] args) {
        //cal_Minute();
        //check_Password();
        String a = "123abc7789";
        String b = "https://google.com";
        //findNumberFromString(a);
        getInfo(b);
    }
    public static void cal_Minute()
    {
        String myText = "2hrs and 5 minutes";
        String [] output = myText.split("and");
        int hours = Integer.parseInt(output[0].replace("hrs","").trim());
        int minutes = Integer.parseInt(output[1].replace("minutes","").trim());
        int totalMinutes = (hours*60)+minutes;
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
    public static void findNumberFromString(String str)
    {
        StringBuilder num = new StringBuilder();
        char [] myChar = str.toCharArray();
        for (char aChar : myChar) {
            if (Character.isDigit(aChar)) {
                num.append(aChar);
            }
        }
        System.out.println(num);
    }

    public static void getInfo (String str)
    {
        String [] output = str.split("://|\\.");
        System.out.println(output[0]);
        System.out.println(output[1]);
        System.out.println(output[2]);
    }
}
