package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(reverseInt(5));
    }

    public static long reverseInt(int i){
        StringBuilder binaryStr = new StringBuilder(Integer.toBinaryString(i));

        for (int j = 0; j < Integer.numberOfLeadingZeros(i); j++) {
            binaryStr.insert(0,'0');
        }
        return Long.parseLong(binaryStr.reverse().toString(), 2);

    }

    public static long f(int n) {
        return Long.parseLong(
                String.format("%1$-32s",
                        Integer.toBinaryString(Integer.reverse(n))).replace(
                        ' ', '0'), 2);
    }
}
