class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s) == 0:
            return ''
        if len(s) == 1:
            return s

        combined_array = self.combinationArray(s)

        j = 0
        while j < len(combined_array):
            if self.isPalindrome(combined_array[j]) == False:
                combined_array.remove(combined_array[j])
            j += 1

        palindrom = max(combined_array, key=len)

        return palindrom

    def combinationArray(self, s: str) -> list:
        new_list = []

        for i in range(len(s)):
            for j in range(i+1, len(s) + 1):
                if len(set(s[i:j])) == len(s[i:j]):
                    new_list.append(s[i:j])
                else:
                    break

        return new_list

    def isPalindrome(self, s: str) -> bool:
        if len(s) == 0:
            return False
        if len(s) == 1:
            return True
        if len(s) == 2:
            return False

        for i in range(len(s)):
            if s[i] != s[len(s)-i-1]:
                return False
        return False


if __name__ == '__main__':
    input = 'babad'
    s = Solution()
    print(s.longestPalindrome(input))
