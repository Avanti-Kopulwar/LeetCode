class MinimumTimeToTypeWordUsingSpecialTypewriter1974 {
    public int minTimeToType(String word) {
        int result = 0;
        if(Math.abs(word.charAt(0) - 'a') <= 13){
            result += Math.abs(word.charAt(0) - 'a') + 1;
        } else {
            result += 26 - Math.abs(word.charAt(0) - 'a') + 1;
        }
        if(word.length() > 1){
            char previous = word.charAt(0);
            for(int i = 1; i<word.length(); i++){
                char current = word.charAt(i);
                int diff = Math.abs(current - previous);
                result += Math.min(diff, 26 - diff) + 1;
                previous = current;
            }
        }
        return result;
    }
}
