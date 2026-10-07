class calculator
{
    int a;

    public int add (int n1 ,int n2)
    {
        //System.out.println("subhiii");
        int r = n1 + n2 ;
        return r;

    }
}

public class ClassAndObject 
{
    public static void main(String[] args)
    {
        int num1 = 2;
        int num2 = 5;

        calculator calc = new calculator();

        int result = calc.add(num1 ,num2);

        //float result = (float)(num1+num2);

        System.out.println(result);

        
         
    }
    
}
