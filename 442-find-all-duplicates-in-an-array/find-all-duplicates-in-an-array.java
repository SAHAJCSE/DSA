class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

for (int num : nums) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}

for (int num : nums) {
    if (map.get(num) == 2) {
        ans.add(num);
        map.put(num, 0); // prevent adding again
    }
}
return ans;
    }
}