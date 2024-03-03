class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i =0;
             StringBuilder result = new StringBuilder();
        while(word1.length()>i || word2.length()>i){
           if(word1.length()>i){
               result.append(word1.charAt(i));
              
           }
           if(word2.length()>i){
                result.append(word2.charAt(i));
             
           }
            i++;
        }
        return result.toString();
    }
}
