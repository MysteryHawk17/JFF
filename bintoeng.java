package jff;

import java.util.Scanner;

public class bintoeng {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary value of the sentence");
        String bin=sc.nextLine();
        sc.close();
        bin=bin.trim();
        String[] binn=bin.split(" ");

        for(int i=0;i<binn.length;i++)
        {
            System.out.print(btoint(binn[i]));
        }
    }
   /* 1000010 1100101 100000 1110100 1101000 1100101 100000
            1100010 1100101 1110100 1110100 1100101 1110010 100000
            1110110 1100101 1110010 1110011 1101001 1101111 1101110
            100000 1101111 1100110 100000 1111001 1101111 1110101
            1110010 1110011 1100101 1101100 1100110*/
    public static String btoint(String s)
    {
        String eng="";
        String[] arr = s.split("");

        int dn = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equalsIgnoreCase("1"))
            {
                dn=dn+(int) Math.pow(2.0,arr.length-(1+i));
            }
        }

        char ch=(char)dn;

        eng=Character.toString(ch);
        return eng;
    }
    }

