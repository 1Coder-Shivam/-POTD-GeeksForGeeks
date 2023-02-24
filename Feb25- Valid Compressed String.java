class Solution {
    static int checkCompressed(String S, String T) {
        // code here
        int i = 0, j = 0;  //initialize two pointer 
        while (i < S.length() && j < T.length()) {  
            if (S.charAt(i) == T.charAt(j)) {  
                i++;j++;
            } else if (Character.isDigit(T.charAt(j))) {  // If the current character in T is a digit, 
            //parse the integer value and skip that many characters in S
                int count = 0;
                while (j < T.length() && Character.isDigit(T.charAt(j))) {
                     // Parse the digit character and add it to the count variable
                    count = count * 10 + T.charAt(j) - '0'; 
                    j++;
                }
                i += count;
            } else {  
                // If the curr char in T i is neither digit nor matches 
                return 0;
            }
        }
        return (i == S.length() && j == T.length()) ? 1 : 0;
    }
}
