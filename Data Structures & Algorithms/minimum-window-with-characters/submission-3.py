class Solution:
   def minWindow( self ,s:str, t:str) ->str:
    if len(t)>len(s):
        return ""
    windowT,counT={},{}
    for c in t:
        counT[c]=1+counT.get(c,0)
    have,need=0,len(counT)
    l=0
    res,resLen=[-1,-1],float("infinity")
    for r in range(len(s)):
        c=s[r]
        windowT[c]=1+windowT.get(c,0)
        if c in counT and windowT[c]==counT[c]:
            have+=1
        while have==need:
            if (r-l+1)<resLen:
                res=[l,r]
                resLen=r-l+1
            windowT[s[l]]-=1
            if s[l]in counT and windowT[s[l]]<counT[s[l]]:
                have-=1
            l+=1
    l,r=res
    return s[l:r+1] if resLen!=float("infinity") else ""