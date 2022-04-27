package src;

public class Number {
    public static void main(String[] args) {
        byte byteInteger = 10;
        short shortInteger = 20;
        int intInteger = 30;
        long longInteger = 40;
        System.out.println(byteInteger);
        System.out.println(shortInteger);
        System.out.println(intInteger);
        System.out.println(longInteger);

        // long 타입은 long 타입으로.
        int sum = byteInteger + shortInteger;
        int sum2 = byteInteger + intInteger;
        long sum3 = byteInteger + longInteger;
        int sum4 = shortInteger + intInteger;
        long sum5 = shortInteger + longInteger;
        long sum6 = intInteger + longInteger;


        float floatNumber = 1.2f;
        double doubleNumber = 4.3;
        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        float floatSum = 0.001f + 0.001f + 0.0001f;
        System.out.println(floatSum);
    }
}
