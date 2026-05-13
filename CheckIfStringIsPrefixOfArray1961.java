class CheckIfStringIsPrefixOfArray1961 {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder mixword = new StringBuilder();
        for (String word : words) {
            mixword.append(word);
            int len = mixword.length();
            if (len > s.length()) return false;
            if (s.substring(0, len).equals(mixword.toString()) && len == s.length()) {
                return true;
            }
        }
        return false;
    }
}
