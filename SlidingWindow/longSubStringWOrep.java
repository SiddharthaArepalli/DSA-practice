public class longSubStringWOrep {
    public static int longestUniqueSubsttr(String s) {
        int n = s.length();
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256]; // initialize a boolean array to keep track of visited characters
            for (int j = i; j < n; j++) {
                if (visited[s.charAt(j)]) // if the character is already visited, break the inner loop
                    break;
                visited[s.charAt(j)] = true; // mark the character as visited
                maxLength = Math.max(maxLength, j - i + 1); // update the maximum length
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "sidhartha";
        System.out.println("The input string is " + s);
        System.out.println("The length of the longest non-repeating character substring is " + longestUniqueSubsttr(s));
    }
}