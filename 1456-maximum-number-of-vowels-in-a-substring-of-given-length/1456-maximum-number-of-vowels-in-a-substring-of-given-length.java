class Solution {
    public int maxVowels(String s, int k) {
        int maxi = 0;
        int c = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                c++;
            }
        }
        maxi = c;
  
        for (int i = k; i < s.length(); i++) {
           
            if (isVowel(s.charAt(i))) {
                c++;
            }
            if (isVowel(s.charAt(i - k))) {
                c--;
            }
            
            maxi = Math.max(maxi, c);
        }
        
        return maxi;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}