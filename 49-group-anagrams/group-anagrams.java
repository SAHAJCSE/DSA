import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>(); 
        Map<String, List<String>> map = new HashMap<>();

        for (String x : strs) {
            char[] chars = x.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(x);
        }

        return new ArrayList<>(map.values());
    }
}