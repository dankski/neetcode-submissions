class LinkedList {

    static class Node {
        public int value;
        public Node next;
    }

    Node head;
    Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        Node cur = head;
        int curIndex = 0;

        while (cur != null && curIndex < index) {
            cur = cur.next;
            curIndex++;
        }

        if (cur == null) {
            return -1;
        } else {
            return cur.value;
        }
    }

    public void insertHead(int val) {
        Node node = new Node();
        node.value = val;

        if (head == null) {
            head = node;
            tail = head;
            return;
        }

        node.next = head;
        head = node;

    }

    public void insertTail(int val) {
        Node node = new Node();
        node.value = val;

        if (tail == null) {
            tail = node;
            head = node;
            return;
        }

        tail.next = node;
        tail = node;
    }

    public boolean remove(int index) {
        if (index < 0 || head == null) return false;

        Node cur = head;
        Node prev = null;
        int curIndex = 0;

        while (cur != null && curIndex < index) {
            prev = cur;
            cur = cur.next;
            curIndex++;
        }

        if (cur == null) return false; // index out of range

        if (prev == null) {
            head = cur.next;            // removing head
        } else {
            prev.next = cur.next;       // bypass cur
        }

        if (cur == tail) {
            tail = prev;                // update tail when removing last
        }

        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();
        Node cur = head;
        while (cur != null) {
            values.add(cur.value);
            cur = cur.next;
        }
        return values;
    }
}
