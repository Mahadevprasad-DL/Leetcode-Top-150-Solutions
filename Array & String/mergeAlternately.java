class Solution {
    public static void main(String[] args){
        String word1="abc";
        String word2="pqr";
        Solution sl = new Solution();
        System.out.println(sl.mergeAlternately(word1,word2));
    }
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i=0;
        while(i<word1.length() || i<word2.length())
        {
            if(i<word1.length())
            {
                result.append(word1.charAt(i));
            }

            if(i<word2.length())
            {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
        
    }
}