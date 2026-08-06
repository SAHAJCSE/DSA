class Solution {
    public int reverse(int x) {
      long  rev = 0;
        long  temp;
        if (x < 0) {
            temp = -x;
        } else {
            temp = x;
        }
        while (temp != 0) {
            long lastDigit = temp % 10;
            
                    
            rev = rev * 10 + lastDigit;
            temp /= 10;
        }

        if (x < 0) {
            rev = -rev;
        }
     if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;}
        
        return (int)rev;  
    }
}