class SumOfDigitsOfStringAfterConvert1945 {
    public int getLucky(String s, int k) {
        String number = "";
        for(int i = 0; i< s.length(); i++){
            number += String.valueOf(s.charAt(i)-'a'+1);
        }
        while(k-- > 0){
            int temp = 0;
            for(int i = 0; i<number.length(); i++){
                temp+= number.charAt(i) -'0';
            }
            number = String.valueOf(temp);
        }
        return Integer.valueOf(number);
    }
}
