public class WhileLoop
{
    public static void main(String[] args)
    {
        //  numbers from 1 to 5

        int number = 1;

        while (number <= 5)
        {
            System.out.println(number);
            number++;
        }

        System.out.println();

        //  even numbers

        int even = 2;

        while (even <= 10)
        {
            System.out.println(even);
            even += 2;
        }

        System.out.println();

        //Countdown

        int count = 5;

        while (count >= 1)
        {
            System.out.println(count);
            count--;
        }

        System.out.println();

        // Multiplication table of 7

        int table = 1;

        while (table <= 10)
        {
            System.out.println("7 x " + table + " = " + (7 * table));
            table++;
        }

        System.out.println();

        //  Nested while loop (Rectangle Pattern)

        int row = 1;

        while (row <= 3)
        {
            int column = 1;

            while (column <= 4)
            {
                System.out.print("* ");
                column++;
            }

            System.out.println();
            row++;
        }

        System.out.println();

        // Nested while loop (Triangle Pattern)

        row = 1;

        while (row <= 5)
        {
            int column = 1;

            while (column <= row)
            {
                System.out.print("* ");
                column++;
            }

            System.out.println();
            row++;
        }
    }
}