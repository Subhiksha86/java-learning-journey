public class SwitchStatement 
{
    public static void main(String[] args)
    {
        char grade =  'C' ;

        switch(grade)
        {
            case 'A' :
                System.out.println("Excellent");
                break;

            case 'B' :
                System.out.println("Good");
                break;

            case 'C' :
                System.out.println("Could do better");
                break;

            case 'D' :
                System.out.println("Work Hard");
                break;

            default:
                System.out.println("Invalid Grade");
            
        }


        int a = 12;
        int b = 15;
        char operator = '-' ;

        switch (operator)
        {
            case '+' :
                System.out.println(a + b);
                break;

            case '-' :
                System.out.println(a - b);
                break;

            case '*' :
                System.out.println(a * b);
                break;

            case '/' :
                System.out.println(a / b);
                break;

            case '%' :
                System.out.println(a % b);
                break;

            default:
                System.out.println("Enter Valid Operator");

        }

    
    }
    
}
