class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> maxheap =new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Integer,Integer> entry : freq.entrySet())maxheap.add(entry);
        int ans[] =new int[k];
        for(int i=0;i<k;i++){
            Map.Entry<Integer,Integer> entry =maxheap.poll();
            ans[i]=entry.getKey();
        }
        return ans;
    }
}