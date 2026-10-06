class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length()!=s.length()){
            return false;
        }
        if((s+s).contains(goal)){
            return true;
        }
        return false;

    }
}