import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxDistinct(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map.size();
    }
}