 class Solution {
    
        public String encode(List<String> strs) {
            StringBuffer s = new StringBuffer();
            for(String str : strs){
                s.append(str.length());
                s.append(":");
                s.append(str);
            }
            return s.toString();
        }
    
        public List<String> decode(String str) {
            List<String> list = new ArrayList<>();
            int i = 0;

            while (i<str.length()) {
                int j = i;
                // j is delimiter index
                while (str.charAt(j)!=':') {
                    j++;
                }
                
                int len = Integer.parseInt(str.substring(i,j));
                int beginIdx = j+1;
                int endIdx = j+1+len;
                String word = str.substring(beginIdx, endIdx);
                list.add(word);
                
                i=endIdx;
            }
            
            return list;
            
        }
 }