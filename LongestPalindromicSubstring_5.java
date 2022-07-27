import java.util.ArrayList;

public class LongestPalindromicSubstring_5 {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
        System.out.println(longestPalindrome("a"));
    }

    public static String longestPalindrome(String s) {
        String lPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String subS = s.substring(i,j);
                if (isPalindrome(subS)) {
                    if (lPalindrome.length() < subS.length()) {
                        lPalindrome = subS;
                    }
                }
            }
            
        }
        return lPalindrome;
    }

    private static boolean isPalindrome(String s) {
        ArrayList<String> dp = new ArrayList<String>();
        int initial = 0;
        int last = s.length()-1;
        if (dp.contains(s)) {
            System.out.println("O(1)");
            return true;
        }
        while (initial < last) {
            if (s.charAt(initial) != s.charAt(last)) {
                return false;
            }
            initial++;
            last--;
        }
        dp.add(s);
        return true;
    }
}
