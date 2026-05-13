class ExcelSheetColumnNumber171 {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        char[] cArray = columnTitle.toCharArray();
        for(char c : cArray){
            result = (result * 26) + (c - 'A' + 1);
        }
        return result;
    }
}
