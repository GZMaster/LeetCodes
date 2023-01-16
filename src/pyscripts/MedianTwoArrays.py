class Solution:
    def findMedianSortedArrays(self, nums1, nums2) -> float:
        nums1.extend(nums2)
        nums = sorted(nums1)
        
        if len(nums) == 0:
            return 0
        if len(nums) == 1:
            return nums[0]
        
        if (len(nums) % 2 == 0):
            i = (len(nums) // 2)
            return (nums[i] + nums[i - 1])/2
             
        else:
            return nums[len(nums)//2]

if __name__ == '__main__':

    nums1 = [1, 3]
    nums2 = [2, 5]
    print(Solution().findMedianSortedArrays(nums1, nums2))