class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){

            String frequency = getFrequencyString(s);

            if(map.containsKey(frequency)){
                map.get(frequency).add(s);
            }
            else{
                List<String> li = new ArrayList<>();
                li.add(s);
                map.put( frequency , li);
            }
        }
        return new ArrayList<>(map.values());
    }
    private String getFrequencyString(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        return Arrays.toString(count);
    }
}

