class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        
        ch_long=0
        for i in range(0,len(s)):
            ch=""
            for j in range(i,len(s)):
                if s[j] not in ch:
                    ch+=s[j]
                else:
                    break
            if (len(ch))>ch_long:
                ch_long=len(ch)
        return ch_long
        
        