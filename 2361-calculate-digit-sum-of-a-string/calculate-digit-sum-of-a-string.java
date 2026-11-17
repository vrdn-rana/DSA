class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder nextRound = new StringBuilder();
            
            // Process the string in chunks of size k
            for (int i = 0; i < s.length(); i += k) {
                int end = Math.min(i + k, s.length());
                String group = s.substring(i, end);
                
                // Calculate the sum of digits for the current group
                int sum = 0;
                for (char ch : group.toCharArray()) {
                    sum += ch - '0'; // Convert char to int
                }
                
                nextRound.append(sum);
            }
            
            // Move to the next round
            s = nextRound.toString();
        }
        
        return s;
    }
}