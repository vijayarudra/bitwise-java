package com.rudra.example.usage;

public class OneOddOccurance {

    public static void main(String[] args) {
        int[] a = {4, 3, 4, 4, 4, 5, 5, 3, 3};
        int[] monp1 = {1, 3, 4, 5};
//        System.out.println(naiveFindOneOddOccNum(a));
//        System.out.println(XorFindOneOddOccNum(a));
        System.out.println(findMissingNumber(monp1, 4));
    }

    private static int naiveFindOneOddOccNum(int[] a) {
        for(int i=0; i<a.length; i++) {
            int count = 0;
            for(int j = 0; j<a.length; j++) {
                if(a[i] == a[j]) {
                    count ++;
                }
            }
            if(count % 2 !=0)
                return a[i];
        }
        return 0;
    }

    private static int XorFindOneOddOccNum(int[] a) {
        int res = 0;
        for(int i=0; i<a.length; i++) {
            res = res ^ a[i];
        }
        return res;
    }

    /**
     * Given an array of n numbers that has values ranging from 1 to n+1.
     * Every number appears exactly once. Hence 1 number is missing.
     * Find the missing number.
     *
     * @param a int array
     * @return missing number
     */
    private static int findMissingNumber( int[] a, int n) {
        int result = 0;
        for(int i=1; i<(n+1)+1; i++) {
            result = result ^  i;
        }
        for(int i=0; i<a.length; i++) {
            result = result ^ a[i];
        }
        return result;
    }

}
