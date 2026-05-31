class MyLinkedList {

    static class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head; // sentinel
    private Node tail; // sentinel
    private int size;

    public MyLinkedList() {
        this.head = new Node(-1);
        this.tail = new Node(-1);
        head.next = tail;
        tail.prev = head;
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        addBetween(val, head, head.next);
    }

    public void addAtTail(int val) {
        addBetween(val, tail.prev, tail);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) index = 0;
        if (index > size) return; // invalid, do nothing
        // find node currently at position index (or tail if index == size)
        Node curr = head.next;
        for (int i = 0; i < index; i++) curr = curr.next;
        addBetween(val, curr.prev, curr);
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        Node curr = head.next;
        for (int i = 0; i < index; i++) curr = curr.next;
        Node prevNode = curr.prev;
        Node nextNode = curr.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        // help GC
        curr.next = null;
        curr.prev = null;
        size--;
    }

    // helper to insert new node with val between prevNode and nextNode
    private void addBetween(int val, Node prevNode, Node nextNode) {
        Node n = new Node(val);
        n.prev = prevNode;
        n.next = nextNode;
        prevNode.next = n;
        nextNode.prev = n;
        size++;
    }
}
