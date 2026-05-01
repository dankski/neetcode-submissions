class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        String sortedS = new String(sChars);

        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);
        String sortedT = new String(tChars);

        return sortedS.equals(sortedT);
    }
}
