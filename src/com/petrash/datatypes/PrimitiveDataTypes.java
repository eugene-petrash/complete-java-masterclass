package com.petrash.datatypes;

/**
 * Created by petrash on 2/10/18.
 */
public class PrimitiveDataTypes {

    public static void main(String[]  args) {

        // has a width of 64
        long minLongValue = -9_223_372_036_854_775_808L;
        long maxLongValue = 9_223_372_036_854_775_807L;
        long newLongValue = maxLongValue / 2;

        // has a width of 32
        int minIntValue = -2_147_483_648;
        int maxIntValue = 2_147_483_647;
        int newIntValue = minIntValue *3;

        // has a width of 16
        short minShortValue = -32768;
        short maxShortValue = 32767;
        short newShortValue = (short) (minShortValue + 145);

        // has a width of 8
        byte minByteValue = -128;
        byte maxByteValue = 127;
        byte newByteValue = (byte) (maxByteValue - 67);

    }
}
