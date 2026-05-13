class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        String result= "";
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for (int i = 0; i< Math.min(first.length, last.length); i++){
            if(first[i] != last[i])
                break;
            result = result.concat(String.valueOf(first[i]));
        }
        return result;
    }
}
