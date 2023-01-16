from typing import List

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        result = ""

        if len(strs) == 0:
            return result
        
        for i in range(len(strs[0])):
            for j in range(1, len(strs)):
                if i >= len(strs[j]) or strs[0][i] != strs[j][i]:
                    return result
            result += strs[0][i]

        return result


if __name__ == "__main__":
    strs = ["flower", "flow", "flight"]
    print(Solution().longestCommonPrefix(strs))
