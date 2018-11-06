package com.amani;

public class Main {

    public static void varPractice() {

        //byte variable
        byte bVal = 56;

        //short variable
        short sVal = 900;

        //int variable
        int iVal = 8465;

        //long variable
        long lResult = 50_000 + 10*(bVal + sVal + iVal);

        //float
        double fVal = 4.8;

        //print
        System.out.println(lResult);
    }

    public static void varPractice2()
    {
        float pounds = 148f;
        float kilos = pounds * 0.453f;
        System.out.println("weight in kilos: " + kilos);

    }

    public static void varChar()
    {
        char register = '\u00AE'; //single quote, not double
        System.out.println(register);
    }
    public static void main (String[] args)
    {
        varChar();
    }
}
