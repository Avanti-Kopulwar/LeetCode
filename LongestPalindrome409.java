class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        int[] charFrequency = new int[128];
        int result = 0;

        for(int i=0; i<s.length(); i++){
            charFrequency[s.charAt(i)]++;
        }
        for(int frequency : charFrequency){
            result += (frequency / 2) * 2;
        }
        if(result < s.length()) result ++;

        return result;
    }
}
