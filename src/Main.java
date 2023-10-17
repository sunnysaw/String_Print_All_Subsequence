import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input = "abcd";
        findSubsequences(input, "", 0);
    }

    public static void findSubsequences(String input, String current, int index) {
        if (index == input.length()) {
            System.out.println(current);
            return;
        }

        // Include the current character
        findSubsequences(input, current + input.charAt(index), index + 1);

        // Exclude the current character
        findSubsequences(input, current, index + 1);
    }
}
