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

        // --booleans:  boolean
        //    only possible values:  true, false
        boolean lightSwitch = true;  //lights are on
        //  will increase usage in the not-too-distant future

        // --chars:   char
        //    bits:    16
        //     only big enough to hold a SINGLE character
        //   under the hood:  this is an UNSIGNED 16-bit integer
        //           integer values from 0 - 65535
        //         first 255 is what was ASCII
        //         internationalization required many more characters
        //            extended to what is now UNICODE
        char single = 'g';
        System.out.println(single);
        single = 75;
        System.out.println(single);
        // NEED TO KNOW INFORMATION:
        //     'A' => 65
        //     'a' => 97
        //     '0' => 48
        //    rest can be figured out by simply adding 1 for the
        //       next character, ex. 'B' => 66, 'c' => 98

        // the above are all direct access to the data
        //   through the variable names
        // reference -- a reference variable stores the memory address
        //        of an object
        //   object -- preview of coming attractions
        //          -- holds more than a simple value
        // first example of an object:  String
        //     String holds a group of characters (usually more than one)
        String name = "Suzy";
        String buddy = "whoot - \\\\\\\\\\\\\\\\";
        System.out.println(buddy);


    }
}