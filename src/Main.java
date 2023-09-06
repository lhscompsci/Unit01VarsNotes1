public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // data types -- critical
        // identifier rules
        // -- always start with a letter
        // -- NO spaces
        // -- CAN use numbers
        // -- _ is the only symbol allowed
        // -- CANNOT use Java keywords

        //general conventions
        // -- classes begin with a Capital
        // -- camelCase is common for variableNames
        // -- use names that mean something

        // Data Types
        // -primitives: store a single, simple value
        // 8 types: 4 integers, 2 real (decimal) numbers, 1 boolean (t/f), 1 char
        // --integers:  byte, short, int, long
        //      bits:     8     16    32    64
        //    byte:  -128 to 127
        //   short:  -32768 to 32767
        //     int:  -2147483648 to 2147483647    <----
        //    long:  -4quintillion to 4quintillion
        int value = 32000;
        short middle = (short) 74935;
        System.out.println(middle);
        short example = 32000;
        middle = (short) (example + example);
        System.out.println(middle);

        // --real (decimal) numbers:  float, double
        //      bits:                  32      64
        //     float:  7-8 digits of accuracy
        //    double:  15-16 digits of accuracy   <----
        double distance=0;
        distance = 6454128385844162.666112384;
        float closer = 154512695459.8F;
        System.out.println(distance);
        System.out.println(closer);

    }
}