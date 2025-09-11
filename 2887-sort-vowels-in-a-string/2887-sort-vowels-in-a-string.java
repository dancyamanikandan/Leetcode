class Solution {
    public String sortVowels(String s) {
        String vowels="aeiouAEIOU";
         char[] chars = s.toCharArray();

        // Step 1: Collect indices of vowels
        List<Integer> vowelIndices = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (vowels.indexOf(chars[i]) != -1) {
                vowelIndices.add(i);
            }
        }

        // Step 2: Extract vowels from those indices
        List<Character> vowelChars = new ArrayList<>();
        for (int index : vowelIndices) {
            vowelChars.add(chars[index]);
        }

        // Step 3: Sort vowels by ASCII
        Collections.sort(vowelChars);

        // Step 4: Replace vowels at stored indices with sorted vowels
        for (int i = 0; i < vowelIndices.size(); i++) {
            chars[vowelIndices.get(i)] = vowelChars.get(i);
        }

        return new String(chars);
        
    }
}