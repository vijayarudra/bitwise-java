package com.rudra.example;

/**
 * Bitwise Operators in java
 *
 */
public class BitwiseOperators
{
    public static void main( String[] args )
    {
        BitwiseOperators.bitwiseAndOperator(3, 6);
        BitwiseOperators.bitwiseAndOperator(2, 4);

        BitwiseOperators.bitwiseOrOperator(3, 6);
        BitwiseOperators.bitwiseOrOperator(2, 4);

        BitwiseOperators.bitwiseXOROperator(3, 6);
        BitwiseOperators.bitwiseXOROperator(2, 4);

        BitwiseOperators.bitwiseNotOperator(1);
        BitwiseOperators.bitwiseNotOperator(2);

        BitwiseOperators.bitwiseLeftShiftOperator(3, 2);
        BitwiseOperators.bitwiseLeftShiftOperator(5, 3);

        BitwiseOperators.bitwiseRightShiftOperator(33, 1);
        BitwiseOperators.bitwiseRightShiftOperator(32, 2);

        BitwiseOperators.bitwiseUnSignedRightShiftOperator(-2, 1);
        BitwiseOperators.bitwiseUnSignedRightShiftOperator(-5, 2);

    }
    /**
     *  Bitwise & Operator : Considering the inputs are converted in binary format
     *  If 2 input bits are '1' then the output is '1'. In all the other cases result is '0'
     *  Example x: 3 and y: 6
     *  x in binary: 000 .... 0011
     *  y in binary: 000 .... 0110
     *  x & y      : 000 .... 0010/
     *  result : 2
     */
    private static void bitwiseAndOperator( int x, int y) {
        System.out.println(String.format("%s & %s : %s", x, y, x & y));
    }
    /**
     *  Bitwise | Operator : Considering the inputs are converted in binary format
     *  If any of the input bits has value '1' then the output is '1'. In all the other cases result is '0'
     *  Example x: 3 and y: 6
     *  x in binary: 000 .... 0011
     *  y in binary: 000 .... 0110
     *  x & y      : 000 .... 0111
     *  result : 7
     */
    private static void bitwiseOrOperator( int x, int y) {
        System.out.println(String.format("%s | %s : %s", x, y, x | y));
    }
    /**
     *  Bitwise ^ Operator : Considering the inputs are converted in binary format
     *  If 2 input bits has different value then the output is '1'. In all the other cases result is '0'
     *  Example x: 3 and y: 6
     *  x in binary: 000 .... 0011
     *  y in binary: 000 .... 0110
     *  x & y      : 000 .... 0101
     *  result : 5
     */
    private static void bitwiseXOROperator(int x, int y) {
        System.out.println(String.format("%s ^ %s : %s", x, y, x ^ y));
    }
    /**
     *  Bitwise ~ Operator : Considering the inputs are converted in binary format
     *  Input bits will be converted 0's to 1's and 1's to 0's
     *  Example x: 1
     *  x in binary: 000 .... 0001
     *  ~x         : 111 .... 1110 (-ve number can be represented as 2Power32 -1)
     *  result : 2power32 -1 -1 which is 2power32 -2 which is '-2'
     */
    private static void bitwiseNotOperator(int x) {
        System.out.println(String.format("~%s : %s", x, ~x));
    }
    /**
     *  Bitwise << Operator : Considering the inputs are converted in binary format
     *  Shifts the bits of input x to n positions to the left and fills the leading bit with 0's
     *  Example x: 3, n=2
     *  x in binary: 000 .... 0011
     *  x<<2 (3<<2): 000 .... 1100
     *  result : 12
     */
    private static void bitwiseLeftShiftOperator(int x, int n) {
        System.out.println(String.format("%s << %s : %s", x, n, x << n));
    }
    /**
     *  Bitwise >> Operator : Considering the inputs are converted in binary format
     *  Shifts the bits of input x to n positions to the right and fills the leading bit with 0's and 1's for -ve numbers
     *  Example x: 33, n=1
     *  x in binary : 000 .... 100001
     *  x>>1 (33>>1): 000 ....010000
     *  result : 16
     */
    private static void bitwiseRightShiftOperator(int x, int n) {
        System.out.println(String.format("%s >> %s : %s", x, n, x >> n));
    }
    /**
     *  Bitwise >>> Operator : Considering the inputs are converted in binary format
     *  Shifts the bits of input x to n positions to the right and fills the leading bit with 0's for -ve numbers
     *  For +ve numbers the >> and >>> both give same result.
     *  Example x: -2, n=1
     *  x in binary   : 1111 .... 0010  (-2)
     *  x>>>2 (-2>>>1): 0111 .... 1111  (2powe31 -1)
     *  result : 2147483647
     */
    private static void bitwiseUnSignedRightShiftOperator(int x, int n) {
        System.out.println(String.format("%s >>> %s : %s", x, n, x >>> n));
    }
}
