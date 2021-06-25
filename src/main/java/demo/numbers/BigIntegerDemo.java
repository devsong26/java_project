package demo.numbers;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo {

    private BigInteger consByteArr, consBitLengthAndCertaintyAndRnd, consVal;

    public static void main(String[] args){
        BigIntegerDemo demo = new BigIntegerDemo();

        System.out.println("# fields() ");
        demo.fields();
        System.out.println("# ========== #\n\n");

        System.out.println("# constructors() ");
        demo.constructors();
        System.out.println("# ========== #\n\n");

        System.out.println("# methods() ");
        demo.methods();
        System.out.println("# ========== #\n\n");
    }

    /**
     * static BigInteger ONE
     * The BigInteger constant one.
     *
     * static BigInteger TEN
     * The BigInteger constant ten.
     *
     * static BigInteger ZERO
     * The BigInteger constant zero.
     */
    private void fields(){
        // static BigInteger ONE
        System.out.println("BigInteger ONE = " + BigInteger.ONE);

        // static BigInteger TEN
        System.out.println("BigInteger TEN = " + BigInteger.TEN);

        // static BigInteger ZERO
        System.out.println("BigInteger ZERO = " + BigInteger.ZERO);
    }

    /**
     * BigInteger(byte[] val)
     * Translates a byte array containing the two's-complement binary representation of a BigInteger into a BigInteger.
     *
     * BigInteger(int bitLength, int certainty, Random rnd)
     * Constructs a randomly generated positive BigInteger that is probably prime, with the specified bitLength.
     *
     * BigInteger(String val)
     * Translates the decimal String representation of a BigInteger into a BigInteger.
     *
     */
    private void constructors(){
        // BigInteger(byte[] val)
        this.consByteArr = new BigInteger(new byte[]{0x38, 0x12});

        // BigInteger(int bitLength, int certainty, Random rnd)
        this.consBitLengthAndCertaintyAndRnd = new BigInteger(10, 10, new Random());

        // BigInteger(String val)
        this.consVal = new BigInteger("-12345");

        System.out.println("# consByteArr = " + this.consByteArr);
        System.out.println("# consBitLengthAndCertaintyAndRnd = " + this.consBitLengthAndCertaintyAndRnd);
        System.out.println("# consVal = " + this.consVal);
    }

    /**
     * abs()
     * Returns a BigInteger whose value is the absolute value of this BigInteger.
     *
     * add(BigInteger val)
     * Returns a BigInteger whose value is (this + val).
     *
     * compareTo(BigInteger val)
     * Compares this BigInteger with the specified BigInteger.
     *
     * divide(BigInteger val)
     * Returns a BigInteger whose value is (this / val).
     *
     * divideAndRemainder(BigInteger val)
     * Returns an array of two BigIntegers containing (this / val) followed by (this % val).
     *
     * gcd(BigInteger val)
     * Returns a BigInteger whose value is the greatest common divisor of abs(this) and abs(val).
     *
     * max(BigInteger val)
     * Returns the maximum of this BigInteger and val.
     *
     * min(BigInteger val)
     * Returns the minimum of this BigInteger and val.
     *
     * mod(BigInteger m)
     * Returns a BigInteger whose value is (this mod m).
     *
     * multiply(BigInteger val)
     * Returns a BigInteger whose value is (this * val).
     *
     * pow(int exponent)
     * Returns a BigInteger whose value is (thisexponent).
     *
     * subtract(BigInteger val)
     * Returns a BigInteger whose value is (this - val).
     */
    private void methods(){
        // abs()
        System.out.println("# abs() = " + this.consVal.abs());

        // add(BigInteger val)
        System.out.println("# add(BigInteger val) = "
                + this.consBitLengthAndCertaintyAndRnd.add(this.consVal));

        // compareTo(BigInteger val)
        System.out.println("# compareTo(BigInteger val) = "
                + this.consBitLengthAndCertaintyAndRnd.compareTo(this.consVal));

        // divide(BigInteger val)
        System.out.println("# divide(BigInteger val) = "
                + this.consByteArr.divide(this.consVal));

        // divideAndRemainder(BigInteger val)
        System.out.println("# divideAndRemainder(BigInteger val) = "
                + this.consByteArr.divideAndRemainder(this.consBitLengthAndCertaintyAndRnd));

        // gcd(BigInteger val)
        System.out.println("# gcd(BigInteger val) = "
                + this.consByteArr.gcd(this.consBitLengthAndCertaintyAndRnd));

        // max(BigInteger val)
        System.out.println("# max(BigInteger val) = "
                + this.consByteArr.max(this.consBitLengthAndCertaintyAndRnd));

        // min(BigInteger val)
        System.out.println("# min(BigInteger val) = "
                + this.consBitLengthAndCertaintyAndRnd.min(this.consVal));

        // mod(BigInteger m)
        System.out.println("# mod(BigInteger m) = "
                + this.consByteArr.mod(this.consBitLengthAndCertaintyAndRnd));

        // multiply(BigInteger val)
        System.out.println("# multiply(BigInteger val) = "
                + this.consVal.multiply(this.consBitLengthAndCertaintyAndRnd));

        // pow(int exponent)
        System.out.println("# pow(int exponent) = "
                + this.consVal.pow(2));

        // subtract(BigInteger val)
        System.out.println("# subtract(BigInteger val) = "
                + this.consVal.subtract(this.consBitLengthAndCertaintyAndRnd));
    }

}
