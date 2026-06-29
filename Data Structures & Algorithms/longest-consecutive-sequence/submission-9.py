class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if nums==[]:
            return 0
        Bcount=1
        nums=sorted(set(nums))
        count=1
        for i in range(1,len(nums)):
            if nums[i]-1==nums[i-1]:
                    count+=1
            else :
                Bcount=max(Bcount,count)
                count=1
        return max(Bcount,count)