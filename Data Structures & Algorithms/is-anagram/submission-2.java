class Solution {

    public boolean isAnagram(String s, String t){
        if (s.length()!=t.length()) return false;
        int[] sArr = new int[26];
        int[] tArr = new int[26];
        for(char ch: s.toCharArray()){
            sArr[ch-'a']++;
        }
        for (char ch: t.toCharArray()){
            tArr[ch-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(sArr[i]!=tArr[i]) return false;
        }
        return true;

    }


}
