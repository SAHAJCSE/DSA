class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Compare every element with every other element       
    HashSet<Integer> ne=new HashSet<>();
    for(int i:nums){
        ne.add(i);
    }
    if(ne.size()==nums.length){
        return false;
    }
    return true;
    }
}