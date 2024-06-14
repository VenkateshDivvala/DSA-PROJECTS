class Solution:
  #List contains collection of goods and days is the minimum number of days to ship from one port to another
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        start=max(weights)
        end=sum(weights)
        while start<=end:
            mid=start+(end-start)//2
            if self.noOfDays(weights,mid)>days:
                start=mid+1
            else:
                end=mid-1
        return start
    def noOfDays(self,nums: List[int],cap: int):
        load=0
        days=1
        for i in range(0,len(nums)):
            load+=nums[i]
            if load>cap:
                days+=1
                load=nums[i]
        return days
