class Solution:
    def frequencySort(self, s: str) -> str:
        # create a dictionary to store the frequency of each character
        freq = {}
        
        for char in s:
            if char not in freq:
                freq[char] = 1
            else:
                freq[char] += 1
                
        # sort the dictionary by value
        sorted_freq = sorted(freq.items(), key=lambda x: x[1], reverse=True)
        
        # create a string to store the result
        result = ''
        for char, count in sorted_freq:
            result += char * count
        return result


if __name__ == '__main__':
    s = Solution()
    print(s.frequencySort('tree'))
