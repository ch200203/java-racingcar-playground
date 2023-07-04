import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String userInput) {
        if(isNullOrEmpty(userInput)) {
            return 0;
        }

        if(isSize1(userInput)) {
            return Integer.parseInt(userInput);
        }

        return sum(splitUserInput(userInput));
    }

    private static boolean isNullOrEmpty(String userInput) {
        return null == userInput || userInput.isEmpty();
    }

    private static boolean isSize1(String userInput) {
        return userInput.length() == 1;
    }

    private static int sum(String[] userInputs) {
        return 0;
    }

    private static String[] splitUserInput(String userInput) {
//        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(userInput);
//        if(matcher.find()) {
//            String delimiter = matcher.group(1);
//        }
//        return userInput.split( " ");
        return null;
    }


}

