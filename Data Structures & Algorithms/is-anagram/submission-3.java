class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_arr, t_arr;
        s_arr = s.toCharArray();
        t_arr = t.toCharArray();
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);
        return Arrays.equals(s_arr, t_arr);
    }
}
