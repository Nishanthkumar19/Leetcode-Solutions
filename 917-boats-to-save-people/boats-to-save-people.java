class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int st=0;
        int boats=0;
        int end=people.length-1;
        while(st<=end){
            if(people[st]+people[end]<=limit){
                st++;
            }
            end--;
            boats++;
        }
        return boats;
    }
}