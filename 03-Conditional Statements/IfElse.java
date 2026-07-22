class IfElse
{
    public static void main(String[] args)

    {
        int y = 4 ;

        if (y >=5)
            System.out.println("Hello");

        else 
            System.out.println("Hii");

        if (true)
            System.out.println("Byee");

        int x  =  56;
        
        if (x >=50  && x <= 100)
           System.out.println("The number x is " + x + " and it is greater than or equal to 50.");
        else 
            System.out.println("The number x is " + x + " and it is smaller than 50.");
        int z = 45;
        System.out.printf("The value of z is %d%n", z);


        float a = 4f;
        float b = 96f;
        float c = 12f;

        if ( a <= b && a <= c)
        {
            System.out.println(a+ " is the smallest number");
            System.out.println("Thank you for your cooperation ");
        }

        else if ( b <= a  && b <= c)
            System.out.println( b+ " is the smallest number");

        else 
            System.out.println(c +  " is the smallest number");

        int n = 11;
        int result = 0;

        // Using if-else

        if (n%2==0)
            result = 10;
        else 
            result = 20;

         // using Ternary operator 

        result = n%2 == 0 ? 10 : 20 ;  

        System.out.println(result);

        

        

    

        

    



        




    }

}
        