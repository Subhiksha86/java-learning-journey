public class ForLoop
{
    public static void main(String[] args)
    {
        // Print numbers from 1 to 5

        for (int i = 1; i <= 5; i++)
        {
            System.out.println(i);
        }

        System.out.println();

        // Print even numbers

        for (int even = 2; even <= 10; even += 2)
        {
            System.out.println(even);
        }

        System.out.println();

        // Countdown

        for (int count = 5; count >= 1; count--)
        {
            System.out.println(count);
        }

        System.out.println();

        // Multiplication table of 6

        for (int table = 1; table <= 10; table++)
        {
            System.out.println("6 x " + table + " = " + (6 * table));
        }

        System.out.println();

        // Find the sum of numbers from 1 to 10

        int sum = 0;

        for (int i = 1; i <= 10; i++)
        {
            sum += i;
        }

        System.out.println("Sum = " + sum);

        System.out.println();

        // Rectangle Pattern

        for (int row = 1; row <= 3; row++)
        {
            for (int column = 1; column <= 4; column++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        // Triangle Pattern

        for (int row = 1; row <= 5; row++)
        {
            for (int column = 1; column <= row; column++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        // Using break

        for (int i = 1; i <= 10; i++)
        {
            if (i == 6)
            {
                break;
            }

            System.out.println(i);
        }

        System.out.println();

        // Using continue

        for (int i = 1; i <= 10; i++)
        {
            if (i == 6)
            {
                continue;
            }

            System.out.println(i);
        }
    }
}