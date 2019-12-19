package com.rudra.example.usage;

public class PowerSetBitwise {
    public static void main(String[] args) {
       powerSet("abcdef");
    }

    private static void powerSet(String str) {
        int plentgh = str.length();
        double pset = Math.pow(2, plentgh);
        for(int counter = 0; counter<pset; counter++) {
            for(int j=0; j<plentgh; j++) {
                if((counter & (1<<j)) !=0) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println("\n");
        }
    }
}
