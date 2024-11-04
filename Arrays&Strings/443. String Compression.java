class Solution {
    public int compress(char[] chars) {
        int l = 0, r = 0, in = 0;
        
        while (l < chars.length) {
            r = l;
            // Find the end of the current character group
            while (r < chars.length && chars[l] == chars[r]) {
                r++;
            }
            chars[in++] = chars[l]; // Store the character

            // If the group length is greater than 1, store the length as characters
            if (r - l > 1) {
                String num = String.valueOf(r - l); // Length of the group
                for (char c : num.toCharArray()) {
                    chars[in++] = c;
                }
            }
            
            // Move the left pointer to the start of the next group
            l = r;
        }
        
        return in; // Return the new length of the compressed array
    }
}
