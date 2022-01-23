package jff;

import java.util.Scanner;

public class engtobin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(i%7==0&&i!=0)
            {
                System.out.println("");
            }
            System.out.print(dectobin((int)ch)+" ");
        }
    }
    public static String dectobin(int n)
    {
        String s="";
        while(n!=1)
        {
            s=Integer.toString(n%2)+s;
            n=n/2;
        }
        return ("1".concat(s));
    }

}
