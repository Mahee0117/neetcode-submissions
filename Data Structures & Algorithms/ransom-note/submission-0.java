class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        ArrayList<Character> s = new ArrayList<>();
        
        for(char c : magazine.toCharArray()){
            s.add(c);
        }

        for(int i = 0 ; i < ransomNote.length() ; i++){
            char pres = ransomNote.charAt(i);

            if(!s.contains(pres)){
                return false;
            }

            s.remove((Character)pres);
        }

        return true;
    }
}