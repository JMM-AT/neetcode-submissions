class Solution:
    def maxArea(self, heights: List[int]) -> int:
        outputs=[]
        
        for i in range(len(heights)):
            prodM=0
            for j in range(i+1,len(heights)):
                prod=min(heights[i],heights[j])*(j-i)
                if prod>prodM:
                    prodM=prod
            outputs.append(prodM)
        return max(outputs)
