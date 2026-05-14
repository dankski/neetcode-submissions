class Solution {
    public boolean isValid(String s) {
        char[] cs = s.toCharArray();

        if (cs.length == 1 || cs.length == 0) {
            return false;
        }

        List<Character> stack = new ArrayList<>();
        for (int i = 0; i < cs.length; i++) {
            
            if (cs[i] == '(' || cs[i] == '{' || cs[i] == '[') {
                stack.add(cs[i]);
            }

            if (cs[i] == ')' || cs[i] == '}' || cs[i] == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                Character top = stack.get(stack.size() - 1);
                if ((top == '(' && cs[i] == ')') 
                    || (top == '{' && cs[i] == '}') 
                    || (top == '[' && cs[i] == ']')) {
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
                
            }

        }

        return stack.isEmpty();
    }
}
