package cleanup;

/**
 * Made by Lee on 7/16/2016.
 */
public class TermCombiner {
    public static String combine(String string) {
        return stringIsEmpty(string) ? null : buildString(string);
    }

    private static String buildString(String string){
        return string;
    }

    private static boolean stringIsEmpty(String string) {
        return string == null || string.length() == 0;
    }

}
