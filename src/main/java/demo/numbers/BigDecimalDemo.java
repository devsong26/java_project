package demo.numbers;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;

public class BigDecimalDemo {

    private BigDecimal paramVal, paramValAndScale, paramValAndScaleAndMc, paramValAndMc;

    public static void main(String[] args){
        BigDecimalDemo demo = new BigDecimalDemo();

        System.out.println("# constructors() ");
        demo.constructors();

        System.out.println("# methods() ");
        demo.methods();
    }

    /**
     * BigDecimal(BigInteger val)
     * Translates a BigInteger into a BigDecimal.
     *
     * BigDecimal(BigInteger unscaledVal, int scale)
     * Translates a BigInteger unscaled value and an int scale into a BigDecimal.
     *
     * BigDecimal(BigInteger unscaledVal, int scale, MathContext mc)
     * Translates a BigInteger unscaled value and an int scale into a BigDecimal, with rounding according to the context settings.
     *
     * BigDecimal(BigInteger val, MathContext mc)
     * Translates a BigInteger into a BigDecimal rounding according to the context settings.
     */
    private void constructors(){
        // BigDecimal(BigInteger val)
        this.paramVal = new BigDecimal(100);

        // BigDecimal(BigInteger unscaledVal, int scale)
        this.paramValAndScale = new BigDecimal(new BigInteger("-123456789"), 3);

        // BigDecimal(BigInteger unscaledVal, int scale, MathContext mc)
        this.paramValAndScaleAndMc = new BigDecimal(
                new BigInteger("9876123"), 3,
                new MathContext(7, RoundingMode.HALF_UP));

        // BigDecimal(BigInteger val, MathContext mc)
        this.paramValAndMc = new BigDecimal(
                new BigInteger("12"),
                new MathContext(1, RoundingMode.HALF_UP));

        System.out.println(this.paramVal);
        System.out.println(this.paramValAndScale);
        System.out.println(this.paramValAndScaleAndMc);
        System.out.println(this.paramValAndMc);
    }

    /**
     * abs()
     * Returns a BigDecimal whose value is the absolute value of this BigDecimal, and whose scale is this.scale().
     *
     * add(BigDecimal augend)
     * Returns a BigDecimal whose value is (this + augend), and whose scale is max(this.scale(), augend.scale()).
     *
     * compareTo(BigDecimal val)
     * Compares this BigDecimal with the specified BigDecimal.
     *
     * divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
     * Returns a BigDecimal whose value is (this / divisor), and whose scale is as specified.
     *
     * divideAndRemainder(BigDecimal divisor)
     * Returns a two-element BigDecimal array containing the result of divideToIntegralValue followed by the result of remainder on the two operands.
     *
     * max(BigDecimal val)
     * Returns the maximum of this BigDecimal and val.
     *
     * min(BigDecimal val)
     * Returns the minimum of this BigDecimal and val.
     *
     * pow(int n)
     * Returns a BigDecimal whose value is (thisn), The power is computed exactly, to unlimited precision.
     *
     * setScale(int newScale, RoundingMode roundingMode)
     * Returns a BigDecimal whose scale is the specified value, and whose unscaled value is determined by multiplying or dividing this BigDecimal's unscaled value by the appropriate power of ten to maintain its overall value.
     */
    private void methods(){
        // abs()
        System.out.println(this.paramValAndScale.abs());

        // add(BigDecimal augend)
        System.out.println(this.paramVal.add(this.paramValAndScale));

        // compareTo(BigDecimal val)
        System.out.println(this.paramVal.compareTo(this.paramValAndScale));

        // divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
        System.out.println(this.paramVal.divide(new BigDecimal("13"), 3, RoundingMode.HALF_UP));

        // divideAndRemainder(BigDecimal divisor)
        System.out.println(Arrays.toString(this.paramValAndScaleAndMc.divideAndRemainder(this.paramVal)));

        // max(BigDecimal val)
        System.out.println(this.paramValAndScaleAndMc.max(this.paramVal));

        // min(BigDecimal val)
        System.out.println(this.paramValAndScaleAndMc.min(this.paramVal));

        // pow(int n)
        System.out.println(this.paramVal.pow(2));

        // setScale(int newScale, RoundingMode roundingMode)
        System.out.println(this.paramValAndScaleAndMc.setScale(5, RoundingMode.HALF_DOWN));
    }

}
