class MinStack {

    private final List<Integer> stack;

    public MinStack() {
        this.stack = new ArrayList<>();
    }
    
    public void push(int val) {
        this.stack.add(val);
    }
    
    public void pop() {
        if (!this.stack.isEmpty()) {
            this.stack.remove(stack.size() - 1);
        }
    }
    
    public int top() {
        return this.stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        List<Integer> sorted = this.stack.stream().sorted().toList();
        return sorted.get(0);
    }
}
