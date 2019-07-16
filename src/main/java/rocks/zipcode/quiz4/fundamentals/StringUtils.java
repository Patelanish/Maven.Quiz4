package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return str.substring(0, str.length()/2) + Character.toUpperCase(str.charAt(str.length()/2)) + str.substring(str.length()/2 +1);
    }

    public static String lowerCaseMiddleCharacter(String str)
    {
        return str.substring(0, str.length()/2) + Character.toLowerCase(str.charAt(str.length()/2)) + str.substring(str.length()/2 +1);
    }

    public static Boolean isIsogram(String str) {
        str = str.toLowerCase();
        int bluh = str.length();
        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for(int i = 0; i < bluh - 1; i++){
            if (arr[i] == arr[i +1])
                return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
            return false;
        }


    public static String removeConsecutiveDuplicateCharacters(String str) {
        String given = str;
        String result = "";
        int i;
        for (i= 1; i < given.length(); i++){
            if (given.charAt(i)!= given.charAt(i-1)) {
                result = result + given.charAt(i-1);
            }

        }
        if (given.charAt(i-2)!= given.charAt(i-1)|| result.equals("")){
            result += given.charAt(i-1);
        }


        return result;
    }

    public static String invertCasing(String str) {
        String [] splitString = str.split("");
        String result = "";
        for (String s :splitString){
            if (Character.isUpperCase(s.charAt(0))){
                result += s.toLowerCase();
            } else {
                result +=s.toUpperCase();
            }
        }
        return result;
    }
}