public class calculator2 {


    // static variable
    static int a = 10;
    static int b= 5;
    // four user defined methods
    public static void  addition (){
        System.out.println(" addition is " + a + " and "+ b+ " = " + (a+b));

    }
    public static void subtraction(){
        System.out.println(" subtraction is "  + a + " and "+ b + " = " + (a-b));

    }
    public static void multiplication ()
    {
        System.out.println(" multiplication is " + + a + " and "+ b + " = " + (a * b));
    }
    public static void   division(){
        System.out.println(" Division is " + + a + " and "+ b + " = " + (a  / b));

    }
    // main method
    public static void main (String []args)

    {
        addition();
        subtraction();
        multiplication();
        division();
    }
}


