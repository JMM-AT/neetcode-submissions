class Solution:
    def isValid(self, s: str) -> bool:
    
        L1={")":"(","]":"[","}":"{"}
        L=[]
        for i in s:
            if i in L1.values():
                L.append(i)
            elif L!=[]and L1[i]==L[-1]:
                L.pop()
            else : return False
        return L==[]