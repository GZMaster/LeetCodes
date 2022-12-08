class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        if len(s) == 1:
            return 1
        new_list = []

        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                if len(set(s[i:j])) == len(s[i:j]):
                    new_list.append(s[i:j])
                else:
                    break
                
                
        return len(max(new_list, key=len))


if __name__ == "__main__":
    s = Solution()
    print(s.lengthOfLongestSubstring("abcabcbb"))
