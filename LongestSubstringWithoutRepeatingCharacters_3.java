public class LongestSubstringWithoutRepeatingCharacters_3 {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbb";
        String s3 = "pwwkew";
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 1;
        int maxLen = 0;
        int counter = 0;
        if (s.length() == 0) {
            return 0;
        }
        while (j < s.length()){
            // System.out.println("\nword : "+s.substring(i, j));
            // System.out.println("char : "+s.substring(j, j+1));
            // System.out.println("match: "+s.substring(i, j).contains(s.substring(j, j+1)));
            if (s.substring(i, j).contains(s.substring(j, j+1))) {
                i++;
                j = i;
                counter = 0;
            }
            else{
                counter++;
            }
            if (maxLen < counter) {
                maxLen = counter;
            }
            // System.out.println("c : "+counter);
            // System.out.println("m : "+maxLen);
            j++;
        }
        return maxLen+1;
    }
}
