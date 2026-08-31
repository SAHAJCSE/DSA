class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> res1=new ArrayList<>();
        HashSet<Integer> res=new HashSet<>();
         for(int num :nums){
            res.add(num);
        }
        for(int i=1;i<=nums.length;i++){
            if(!res.contains(i)){
                res1.add(i);
            }
        }
        return res1;
        
        
        
    }   
}