import java.util.Collection;
class CheckIfAllCharactersHaveEqualNumberOfOccurrences1941 {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> counter = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            if(counter.containsKey(s.charAt(i))){
                counter.put(s.charAt(i), counter.get(s.charAt(i))+1);
            } else {
                counter.put(s.charAt(i), 1);
            }
        }
        int firstValue = counter.get(s.charAt(0));
        Collection<Integer> values = counter.values();
        for (Integer value : values){
            if (!value.equals(firstValue)) {
                return false;
            }
        }
        return true;
    }
}
