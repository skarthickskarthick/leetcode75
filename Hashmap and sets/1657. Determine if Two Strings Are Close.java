
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<arr.length;i++)
         {
            if(!map.containsKey(arr[i]))
            map.put(arr[i],1);
            else
            map.put(arr[i],map.get(arr[i])+1);
         }
         Set<Integer> occurrences = new HashSet<>(map.values());
         return map.size()==occurrences.size();
        
        
    }
}
aclass Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
        return false;
        int ch1[]=new int[26];
        int ch2[]=new int[26];
        for(int i=0;i<word1.length();i++)
        ch1[word1.charAt(i)-'a']++;
        for(int i=0;i<word2.length();i++)
        ch2[word2.charAt(i)-'a']++;

        for(int i=0;i<ch1.length;i++)
        {
            if(ch1[i]!=0&&ch2[i]==0||ch1[i]==0&&ch2[i]!=0)
            return false;
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<ch1.length;i++)
        {
            if(ch1[i]!=ch2[i])
            return false;
        }
        return true;
    }
}

