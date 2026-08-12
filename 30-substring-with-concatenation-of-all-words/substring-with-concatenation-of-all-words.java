class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer>ans=new ArrayList<>();
        int wordlen=words[0].length();
        int totallen=words.length * wordlen;
        HashMap<String,Integer>req=new HashMap<>();
        for(String word:words){
            req.put(word,req.getOrDefault(word,0)+1);
        }
        for(int start =0;start<wordlen;start++){
            int left=start;
            int count=0;
            HashMap<String ,Integer>curr=new HashMap<>();
            for(int right=start;right+wordlen<=s.length();right+=wordlen){
                String word=s.substring(right,right+wordlen);
                if(!req.containsKey(word)){
                    curr.clear();
                    count=0;
                    left=right+wordlen;
                    continue;
                }
                curr.put(word,curr.getOrDefault(word,0)+1);
                count++;

                while(curr.get(word)>req.get(word)){
                    String remove=s.substring(left,left+wordlen);
                    curr.put(remove,curr.get(remove)-1);
                    left+=wordlen;
                    count--;
                }
                if(count==words.length){
                    ans.add(left);
                }
            }
        }
        return ans;
    }
}