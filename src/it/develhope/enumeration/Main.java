package it.develhope.enumeration;

public class Main {
    public static void main(String[] args) {

        Month month[] = Month.values();

        for (Month i: month){
            System.out.println(month[i.ordinal()]);
            if(month[i.ordinal()].toString().contains("Y")){
                System.out.println("Ends with the letter 'y'!");
            }else System.out.println("Doesn't end with the letter 'y'!");
        }
    }
}