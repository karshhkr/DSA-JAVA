class Solution {
    public int countVowelSubstrings(String word) {
          int count = 0;
        
        for(int i = 0; i < word.length(); i++){
            
            HashSet<Character> set = new HashSet<>();
            
            for(int j = i; j < word.length(); j++){
                
                char c = word.charAt(j);
                
                if(!isVowel(c)) 
                    break;
                
                set.add(c);
                
                if(set.size() == 5)
                    count++;
            }
        }
        
        return count;
    }
    
    public boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}