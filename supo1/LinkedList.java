class LinkedList {
    static class Node {
        private Node nextNode = null;
        private int value = 0;
        Node(int v) {
            this.value = v;
        }
        public boolean isTail() {
            return this.nextNode == null;
        }
        public Node pop_back() {
            // System.out.println(this.value);
            if (this.nextNode.isTail()) {
                this.nextNode = null;
                return this;
            }
            return this.nextNode.pop_back();
        }
        public int lookup(int n) {
            if (n == 0) {
                return this.value;
            }
            return this.nextNode.lookup(n-1);
        }
    }

    private int length = 0;
    private Node head = null;
    private Node tail = null;

    public void append(int v) {
        if (this.head == null) {
            this.head = new Node(v);
            this.tail = this.head;
            this.length = 1;
            return;
        }
        this.tail.nextNode = new Node(v);
        this.tail = this.tail.nextNode;
        this.length++;
    }

    public void pop_back() {
        if (this.length == 0) {
            System.out.println("popping empty list :(");
            return;
        }
        if (this.length == 1) {
            this.head = null;
            this.tail = null;
            this.length--;
            return;
        }
        this.tail = this.head.pop_back();
        this.length--;
    }

    public int getLength() {
        return this.length;
    }

    public int lookup(int n) {
        if (n >= this.length) {
            System.out.println("out of range");
            return -67;
        }
        return this.head.lookup(n);
    }

    public boolean cycleExists() {
        if (head == null) {
            return false;
        }
        Node tortoise = head;
        Node hare = head;

        while (true) {
            if (hare.nextNode == null || hare.nextNode.nextNode == null) {
                return false;
            }
            tortoise = tortoise.nextNode;
            hare = hare.nextNode.nextNode;
            if (tortoise == hare) {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        for (int i = 1; i <= 4; i++) l.append(i * 10);
        l.pop_back();
        System.out.println(l.getLength() + " " + l.lookup(0) + " " + l.lookup(2) + " " + l.tail.value);
        System.out.println(l.cycleExists());
        l.tail.nextNode = l.head; // make a cycle
        System.out.println(l.cycleExists());
    }
}
