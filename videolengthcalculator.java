package jff;

import java.util.Scanner;

public class videolengthcalculator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Start to start the program");
        String s=sc.next();
        if(s.equalsIgnoreCase("START"))
        {
            int hour=0;
            int min=0;
            int sec=0;
            System.out.println("Enter stop to stop the execution. Enter the length to start calculating the length as continuous numbers HHMMSS");
            String s1=sc.next();
          while(!(s1.equalsIgnoreCase("Stop")))
          {
              int s1i=Integer.parseInt(s1);
              hour=s1i/10000+hour;
              min=min+((s1i/100)%100);
              sec=sec+s1i%100;
              s1=sc.next();
          }
          if(s1.equalsIgnoreCase("Stop"))
          {
              min=min+sec/60;

              //System.out.println((hour+(min/60))+"h "+(min%60+sec/60)+"m "+sec%60+"s ");
              System.out.println((hour+(min/60))+"h "+(min%60)+"m "+sec%60+"s ");
          }
        }
        else
        {
            System.out.println("Program Not Started");
            System.out.println("Enter 1 to start the program. Enter any number to end it.");
            String st= sc.next();
            if(st.equalsIgnoreCase("1"))
                main(null);

        }
    }
}
