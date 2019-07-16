package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {

        String ns[] = new String[(values.length-1)];
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            if (i == values.length / 2) {

            } else {
                ns[count] = values[i];
                count++;
            }
        }return ns;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String ns[] = new String[(values.length-1)];
        for (int i = 0; i < values.length-1; i++) {
                ns[i] = values[i];
            }
        return ns;
    }
}
