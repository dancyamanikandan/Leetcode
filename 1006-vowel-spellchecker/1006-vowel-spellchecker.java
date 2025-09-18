class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>();
        Map<String, String> casemap = new HashMap<>();
        Map<String, String> vowel = new HashMap<>();

        for (String word : wordlist) {
            exact.add(word);

            String lower = word.toLowerCase();
            casemap.putIfAbsent(lower, word);

            String s = getvowel(lower);
            vowel.putIfAbsent(s, word);
        }

        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];

            if (exact.contains(q)) {
                result[i] = q;
                continue;
            }

            String qLower = q.toLowerCase();
            if (casemap.containsKey(qLower)) {
                result[i] = casemap.get(qLower);
                continue;
            }

            String a= getvowel(qLower);
            if (vowel.containsKey(a)) {
                result[i] = vowel.get(a);
                continue;
            }

            result[i] = "";
        }

        return result;
    }

    private String getvowel(String word) {
        char[] cs = word.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (isVowel(cs[i])) {
                cs[i] = '*';
            }
        }
        return new String(cs);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}