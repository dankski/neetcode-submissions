class Solution {
    public int calPoints(String[] operations) {
        List<Integer> stack = new ArrayList<Integer>();
        for (int i = 0; i < operations.length; i++) {
            if ("+".equals(operations[i])) {
                Integer a = stack.get(stack.size() - 1);
                Integer b = stack.get(stack.size() - 2);
                stack.add(a + b);
                continue;
            }

            if ("D".equals(operations[i])) {
                Integer a = stack.get(stack.size() - 1);
                stack.add(2*a);
                continue;
            }

            if ("C".equals(operations[i])) {
                stack.remove(stack.size() - 1);
                continue;
            }

            stack.add(Integer.valueOf(operations[i]));   

        }

        int sum = 0;
        for (Integer v : stack) {
            sum += v;
        }

        return sum;
    }
}