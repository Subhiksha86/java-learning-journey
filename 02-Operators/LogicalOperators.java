public class LogicalOperators 
{
    public static void main(String[] args)

    {
        int a = 6;
        int b = 5;
        double x = 55 ;
        double y = 89 ;

        boolean result = a > b && x > y ;

        System.out.println(result);

        System.out.println(!result);

        char subhi = 'O';
        char thoufi = 'A';
        boolean grade = subhi <= thoufi ;

        System.out.println(grade);

        double a1 = 80.56;
        float a2 =  42.54f;

        boolean pass = a1 > 50 || a2 >  50 ;

        System.out.println(pass);




    }
    
}
