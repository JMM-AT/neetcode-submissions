class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counted={}
        for i in range(len(nums)):
            if nums[i] in counted.keys():
                counted[nums[i]]+=1
            else:
                counted[nums[i]]=1
        counted=dict(sorted(counted.items(),key=lambda x:x[1]))
        l=list(counted.keys())
        return l[-k:]


