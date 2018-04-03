public class PalindromeChecker {

    public boolean check(String input) {
        if (input.length() == 0 || input.length() == 1 || !(input.charAt(0) == input.charAt(input.length()-1))) {
            return input.length() == 0 || input.length() == 1;
        } else {
            return check(input.substring(1, input.length()-1));
        }

    }

}
