class Solution:
    def isPalindrome(self, x: int) -> bool:
        input = str(x)

        if (input == input[::-1]):
            return True

        if (input != input[::-1]):
            return False


if __name__ == "__main__":
    x = -1221
    print(Solution().isPalindrome(x))
