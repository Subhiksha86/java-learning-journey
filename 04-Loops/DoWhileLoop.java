public class DoWhileLoop
{
    public static void main(String[] args)
    {
        int i = 1;

        // Print numbers from 1 to 5

        do
        {
            System.out.println(i);
            i++;
        }
        while(i <= 5);

        System.out.println();

        // Countdown

        int count = 5;

        do
        {
            System.out.println(count);
            count--;
        }
        while(count >= 1);

        System.out.println();

        // Multiplication table of 5

        int table = 1;

        do
        {
            System.out.println("5 x " + table + " = " + (5 * table));
            table++;
        }
        while(table <= 10);

        System.out.println();

        // Executes at least once

        int value = 10;

        do
        {
            System.out.println("This block executes once.");
        }
        while(value < 5);
    }
}