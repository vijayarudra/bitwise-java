package com.rudra.example.usage;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(naivePowerOfTwo(4));
        System.out.println(naivePowerOfTwo(6));
        System.out.println(brainKernighanAlgo(4));
        System.out.println(brainKernighanAlgo(6));
    }

    private static boolean naivePowerOfTwo(int n) {
        if (n==0) {
            return false;
        }
        while (n!=1) {
            if((n%2) !=0) {
                return false;
            }
            n = n/2;
        }
        return true;
    }

    private  static boolean brainKernighanAlgo(int n) {
//        if(n==0){
//            return false;
//        }
//        return ((n & (n-1)) == 0);
        return ((n!=0) && ((n & (n-1)) == 0));
    }
}
