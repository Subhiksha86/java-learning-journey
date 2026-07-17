class AssignmentOperators {

    public static void main(String args[]) {

        int num = 8;

        // int num1 = 5;
        // int result = num % num1;

        num++;      // Post increment
        // num--;

        ++num;      // Pre increment

        num += 3;
        num -= 5;
        num *= 4;
        num /= 2;
        num %= 4;

        // Experimenting with different assignment operations
        num = num + 2;
        num = ++num + num++;
        num = --num;

        System.out.println(num);
    }
}