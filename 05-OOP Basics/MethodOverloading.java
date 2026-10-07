class calculator2
{
    public int add (int n1, int n2)
    {
        return  n1 + n2 ;
    }

    public int add (int n1 , int n2, int n3)
    {
        return n1 + n2 + n3;
    }
    public double add (double n1 ,int n2 ) 
    {
        return n1 + n2;
    }

}

public class Hello 
{
    public static void main(String[] args) 
    {
        calculator2 obj = new calculator2();
        double result = obj.add(8.95,5);

        System.out.println(result);

        
    }
    
}
