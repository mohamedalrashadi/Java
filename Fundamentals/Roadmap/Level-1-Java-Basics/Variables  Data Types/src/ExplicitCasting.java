public class ExplicitCasting {
    public static void main(String[] args) {
        // Larger to smaller type (manual casting required)
        double d = 9.78;
        int i = (int) d;    // Explicit cast - loses decimal part

        System.out.println("Double: " + d);
        System.out.println("Int: " + i);    // Prints 9 (decimal lost)

        // Be careful with range
        int largeNumber = 130;
        byte b = (byte) largeNumber;  // May lose data
        System.out.println("Byte: " + b);  // Unexpected result!

        // Char to int
        char letter = 'A';
        int asciiValue = letter;      // Implicit
        System.out.println("ASCII of A: " + asciiValue);  // 65
    }
}