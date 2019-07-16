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
        StringBuilder ns = new StringBuilder();
        ns.append(str);
        char c = ns.charAt((str.length() / 2));
        ns.setCharAt((str.length() / 2), Character.toUpperCase(c));

        return ns.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder ns = new StringBuilder();
        ns.append(str);
        char c = ns.charAt((str.length() / 2));
        ns.setCharAt((str.length() / 2), Character.toLowerCase(c));

        return ns.toString();
    }

    public static Boolean isIsogram(String str) {
        str = str.toLowerCase();
        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < str.length() - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        str = str.toLowerCase();
        char arr[] = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            if (arr[i] == arr[i + 1])
                return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        char arr[] = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            if (i == str.length() - 1) {
                sb.append(arr[str.length()]);
            } else if (arr[i] == arr[i + 1]) {
                if (i == str.length()) {
                    break;
                }
                i++;
            } else {
                sb.append(arr[i]);
            }
        }
        return sb.append(arr[str.length() - 1]).toString();
    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.isUpperCase(chars[i])
                    ? Character.toLowerCase(chars[i])
                    : Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
}
