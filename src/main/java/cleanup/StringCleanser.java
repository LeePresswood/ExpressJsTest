package cleanup;

/**
 * Made by Lee on 7/16/2016.
 */
public class StringCleanser {
    public static String cleanse(String string){
        return stringIsEmpty(string) ? null : buildString(string);
    }

    private static String buildString(String string) {
        StringBuilder builder = new StringBuilder();

        for(char c : string.toCharArray()){
            if(Character.isLetterOrDigit(c) || isMathPunctuation(c)){
                builder.append(c);
            }
        }

        return builder.toString();
    }

    private static boolean stringIsEmpty(String string) {
        return string == null || string.length() == 0;
    }

    private static boolean isMathPunctuation(char c) {
        switch (c){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '(':
            case ')':
            case '|':
            case '&':
            case '.':
                return true;
            default:
                return false;
        }
    }
}
