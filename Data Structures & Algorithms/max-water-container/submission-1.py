class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l,r=0,len(heights)-1
        prodM=0
        while l<r:
            prod=min(heights[l],heights[r])*(r-l)
            if prod>prodM:
                prodM=prod
            if heights[l]>heights[r]:
                r-=1
            else: l+=1
        return prodM
            