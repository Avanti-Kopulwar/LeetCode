class MinimumMovesToConvertString2027 {
    public int minimumMoves(String s) {
        int count = 0, i = 0;
        while(i < s.length()){
            if(s.charAt(i) == 'X'){
                count++;
                i+=3;
            } else {
                i++;
            }
        }
        return count;
    }
}
