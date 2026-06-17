/* This one is a terrible solution, but it works. 
* I will eventually do a better one when I get better at this, but for now, this is what came out of my head.
* OBS: 15 ms runtime and 46.2 MB memory usage, not the worst, but I know it can be better.
*/

class Solution {
    public boolean isPalindrome(int x) {
        
        int[] palimVet = Integer.toString(x)
                                    .chars()
                                    .map(c -> c - '0')
                                    .toArray();
        
        int i = 0;
        int j = palimVet.length -1;

        if(x < 0){
            return false;
        }
        while(i<j){
            if(palimVet[i] != palimVet[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}