class Solution {
    public HashMap<Character, Integer> getCharMap(String str){
        str = str.toLowerCase();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch)+1);
            }
            else{
                charMap.put(ch, 1);
            }
        }
        return charMap;
    }

    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;
        return getCharMap(s).equals(getCharMap(t));
    }
}
