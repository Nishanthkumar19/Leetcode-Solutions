class Solution {
    public int lengthOfLastWord(String s) {
       String []arr=s.trim().split("\\s+");
       int count=arr.length-1;
       return arr[count].length();
    }
}