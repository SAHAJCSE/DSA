class Solution:
    def maximumLengthSubstring(self, s: str) -> int:
        count = [0] * 128
        left = 0
        ans = 0

        for right in range(len(s)):
            count[ord(s[right])] += 1

            while count[ord(s[right])] > 2:
                count[ord(s[left])] -= 1
                left += 1

            ans = max(ans, right - left + 1)

        return ans