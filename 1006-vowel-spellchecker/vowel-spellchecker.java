class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String>exact=new HashSet<>(Arrays.asList(wordlist));
        Map<String,String>casemap=new HashMap<>();
        Map<String,String>vowel=new HashMap<>();
        for(String s :wordlist){
            String l=s.toLowerCase();
            casemap.putIfAbsent(l,s);
            String v=l.replaceAll("[aeiou]","*");
            vowel.putIfAbsent(v,s);
        }
        String arr[]=new String[queries.length];
        for(int i=0;i<queries.length;i++){
            String q=queries[i];
            if(exact.contains(q)){
                arr[i]=q;
            }
            else if(casemap.containsKey(q.toLowerCase())){
                arr[i]=casemap.get(q.toLowerCase());
            }
            else if(vowel.containsKey(q.toLowerCase().replaceAll("[aeiou]","*"))){
                arr[i]=vowel.get(q.toLowerCase().replaceAll("[aeiou]","*"));
            }
            else{
                arr[i]="";
            }
        }
        return arr;

        
    }
}