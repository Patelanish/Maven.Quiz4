package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {
        ArrayList<String> result = new ArrayList<>(Arrays.asList(values));
        result.remove(getMiddleElement(values));
        String[] finalResult = result.toArray(new String[result.size()]);

        return finalResult;
        }


        public static String getLastElement (String[]values){
            return values[values.length - 1];
        }


    public static String[] removeLastElement(String[] values) {
        String[] result = new String[values.length -1];
        for(int i =0; i < values.length - 1; i++){
            result[i] = values[i];
        }
        return result;
    }
}