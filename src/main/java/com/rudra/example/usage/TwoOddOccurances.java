package com.rudra.example.usage;

public class TwoOddOccurances {
    public static void main(String[] args) {
        int[] a = {4, 3, 4, 4, 4, 5, 5, 3, 3, 4};
        for (int j : naiveFindTwoOddOccNum(a)) {
            System.out.println(j);
        }
        for (int j : findTwoOddOccurance(a)) {
            System.out.println(j);
        }
    }

    private static int[] naiveFindTwoOddOccNum(int[] a) {
        int[] result = new int[2];
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                if (result[0] == 0 ) {
                    result[0] = a[i];
                } else if (result[1] == 0) {
                    result[1] = a[i];
                }
            }
        }
        return result;
    }

    private static int[] findTwoOddOccurance(int [] a) {
        int[] result = new int[2];
        int xor = 0;
        for(int i=0; i<a.length; i++) {
            xor = xor ^ a[i];
        }
        int sn = ~(xor & (xor-1));
        for(int i=0; i<a.length; i++) {
            if( (a[i] & sn) != 0) {
                result[0] = result[0] ^ a[i];
            } else {
                result[1] = result[1] ^ a[i];
            }
        }

        return result;
    }
}
