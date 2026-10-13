class Solution {
    public int compress(char[] chars) {
        StringBuilder res=new StringBuilder();
        if(chars.length==1){
            res.append(chars[0]);
        }else{
            int count=1;
            for(int i=0;i<chars.length;i++){
                if(i+1<chars.length && chars[i]==chars[i+1]){
                    count++;
                }else{
                    res.append(chars[i]);
                     if (count > 1) {
                    res.append(count);
                }
                count = 1;
                }
            }
        }
        char[] arr = res.toString().toCharArray();
        for (int i = 0; i < res.length(); i++) {
    chars[i] = res.charAt(i);
}

return res.length();
        
    }
}