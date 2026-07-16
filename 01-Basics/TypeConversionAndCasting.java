class TypeConversionAndCasting
{
    public static void main(String args[])
    {
        // Implicit Conversion
        byte a = 15;
        int b = a;
        System.out.println(b);

        // Explicit Casting
        int e = 589;
        byte g = (byte)e;
        System.out.println(g);

        float c = 5.89f;
        int d = (int)c;
        System.out.println(d);

        // Increment
        byte num = 10;
        num++;
        System.out.println(num);

        // Byte Arithmetic
        byte x = 5;
        byte y = 100;
        byte result = (byte)(x * y);
        System.out.println(result);

        double cgpa = 8.54;
        int rank = (int)cgpa;
        System.out.println(rank);

        byte p = 54;
        byte q = 8;
        System.out.println((byte)(p * q));
    }
}