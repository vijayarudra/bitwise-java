package com.rudra.example.usage;

public class CoutSetBits {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(13));
        System.out.println(naiveSolutionCountSetBits(13));
        System.out.println(naiveSolution2CountSetBits(13));
        System.out.println(brainKernighanAlgo(13));
    }

    private static int naiveSolutionCountSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 != 0) {
                count++;
            }
            n = n / 2;
        }
        return count;
    }
    private static int naiveSolution2CountSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count = count + (n&1);
            n = n >> 1;
        }
        return count;
    }

    private static int brainKernighanAlgo(int n) {
        int count = 0;
        while (n>0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
