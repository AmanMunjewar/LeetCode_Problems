
def threeSum(nums):
    """
    :type nums: List[int]
    :rtype: List[List[int]]
    """
    dic = {}
    for count,num in enumerate(nums):
        dic[num] = count
        
    for i in range(len(nums)):
        for i in range(i+1,len(nums)):
            pass

if __name__=="__main__":
    nums=[-1,0,1,2,-1,-4]
    threeSum(nums)