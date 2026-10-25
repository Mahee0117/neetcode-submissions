class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i : nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }

        List<Integer> list = new ArrayList<>(freq.keySet());

        list.sort((a,b) -> freq.get(b) - freq.get(a));

        int arr[] = new int[k];

        for(int i = 0 ; i < k ; i++){
            arr[i] = list.get(i);
        }

        return arr;
    }
}
