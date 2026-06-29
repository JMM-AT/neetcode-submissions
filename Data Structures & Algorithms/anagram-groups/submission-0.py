class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        s_orted=defaultdict(list)
        for i in strs:
            key="".join(sorted(i))
            s_orted[key].append(i)
        return list(s_orted.values())