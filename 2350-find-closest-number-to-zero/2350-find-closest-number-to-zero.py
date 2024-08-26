class Solution(object):
    def findClosestNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        close = 10**6
        for i in nums:
            if abs(i) == abs(close):
                close = max(i, close)
            if abs(i) < abs(close):
                close = i
            

        return close
        