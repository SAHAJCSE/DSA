class Solution:
    def longestCommonPrefix(self, strs):
        if not strs:
            return ""

        prefix = ""
        for i in range(len(strs[0])):
            ch = strs[0][i]
            for s in strs:
                if i == len(s) or s[i] != ch:
                    return prefix
            prefix += ch

        return prefix