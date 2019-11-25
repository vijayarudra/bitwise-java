package com.rudra.example.usage;

/**
 * This class explains with example of how to find the if the Kth bit of the given integer
 * in binary form is set or not.
 * Example :
 * Input: n = 5, k = 1
 * n in binary: 000 ... 0101
 * as k = 1 the first bit of n is 1 so the output is 'true'.
 *
 * This problem can be solved in 2 different ways, each one will be explained an implemented
 * in separate methods in this class. Both methods uses bitwise operators explained in BitwiseOperators class.
 */
public class KthBitSet {

    public static void main(String[] args) {
        System.out.println(isKthBitSetLeftShift(5, 3) ? "yes" : "no");
        System.out.println(isKthBitSetLeftShift(13, 2) ? "yes" : "no");

        System.out.println(isKthBitSetRightShift(13, 3) ? "yes" : "no");
        System.out.println(isKthBitSetRightShift(5, 2) ? "yes" : "no");
    }

    /**
     * This method uses left shift (<<) operator.
     * Idea of this method is first we need shift the binary 1 to the kth bit position
     * and when we apply '&' to n and the shifted 1 we will get '0' if it is not set.
     * Example: n=5, k=3
     * 1 in binary       : 000 ... 0001
     * 5 in binary       : 000 ... 0101
     * 1 << (k-1)        : 000 ... 0100
     * (5 & (1<<(k-1)))) : 000 ... 0100  (As this is 4 not 0, we can say the kth bit is set)
     *
     * @param n input for which we need to check the kth bit
     * @param k kth bit
     * @return boolean
     */
    private static boolean isKthBitSetLeftShift(int n, int k) {
        return ((n & (1 << (k - 1))) != 0);
    }
    /**
     * This method uses right shift (>>) operator.
     * Idea of this method is first we need shift kth bit of n to 1st position
     * and when we apply '&' to 1 and the shifted n we will get '0' if it is not set '1' if it is set.
     * Example: n=13, k=3
     *
     * 13 in binary      : 000 ... 1101
     * n >> (k-1)        : 000 ... 0011
     * 1 in binary       : 000 ... 0001
     * (n >> (k-1) & 1)  : 000 ... 0001  (out put is 1 so the kth bit is set)
     *
     * @param n input for which we need to check the kth bit
     * @param k kth bit
     * @return boolean
     */
    private static boolean isKthBitSetRightShift(int n, int k) {
        return ( ((n >> (k-1)) & 1) == 1);
    }
}
