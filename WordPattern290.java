class WordPattern290 {
    public boolean wordPattern(String pattern, String s) {
    char[] cPattern = pattern.toCharArray();
    String[] sArray = s.split(" ");
    if(cPattern.length != sArray.length) {return false;}

    Map<Character, String> charMappingMap = new HashMap<>();
    for (int i = 0; i < sArray.length; i++) {
      char original = cPattern[i];
      String replacement = sArray[i];
      if (!charMappingMap.containsKey(original)) {
        if (!charMappingMap.containsValue(replacement)){
          charMappingMap.put(original, replacement);
        } else {
          return false;
        }
      } else {
        String mappedCharacter = charMappingMap.get(original);
        if (!mappedCharacter.equals(replacement)){
            return false;
        }
      }
    }
    return true;
    }

}
