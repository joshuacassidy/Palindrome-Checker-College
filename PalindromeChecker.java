public class PalindromeChecker {

    public boolean check(String input) {
        if (input.length() == 0 || input.length() == 1) {
            return true;
        } else if (input.charAt(0) == input.charAt(input.length()-1)){
            return check(input.substring(1, input.length()-1));
        } else {
            return false;
        }

    }

}
