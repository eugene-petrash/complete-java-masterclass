package com.petrash.datatypes;

/**
 * Created by petrash on 2/10/18.
 */
public class PrimitiveDataTypes {

    public static void main(String[]  args) {

        /*
        "Whole" numbers
         */

        // has a width of 64 (8 bytes)
        long minLongValue = -9_223_372_036_854_775_808L;
        long maxLongValue = 9_223_372_036_854_775_807L;
        long newLongValue = maxLongValue / 2;

        // has a width of 32 (4 bytes)
        int minIntValue = -2_147_483_648;
        int maxIntValue = 2_147_483_647;
        int newIntValue = minIntValue *3;

        // has a width of 16 (2 bytes)
        short minShortValue = -32768;
        short maxShortValue = 32767;
        short newShortValue = (short) (minShortValue + 145);

        // has a width of 8 (1 byte)
        byte minByteValue = -128;
        byte maxByteValue = 127;
        byte newByteValue = (byte) (maxByteValue - 67);

        /*
        Numbers with decimal points
         */

        // has a width of 64 (8 bytes)
        double doubleValue =1.7976931348623157E308d;

        // has a width of 32 (4 bytes)
        float floatValue =3.4028235E38f;

    }
}
