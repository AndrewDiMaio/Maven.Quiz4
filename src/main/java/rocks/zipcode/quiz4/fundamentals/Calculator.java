package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value*value;
    }

    public static Double[] squareRoots(Double... value) {
        Double ns[] = new Double[value.length];
        for (int i = 0; i < value.length; i++) {
            ns[i] = Math.sqrt(value[i]);

        }
        return ns;
    }

    public static Double[] squares(Double... values) {
        Double ns[] = new Double[values.length];
        for (int i = 0; i < values.length; i++) {
            ns[i] = values[i]*values[i];

        }
        return ns;
    }

    public static Double add(Double value1, Double value2) {
        return value1+value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1-value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor/dividend;
    }
}
