class Stack {
    static class Node {
        private Node nextNode = null;
        private int value = 0;
        Node(int v) {
            this.value = v;
        }
        public boolean isTail() {
            return this.nextNode == null;
        }
    }

    private int length = 0;
    private Node head = null;

    public void push(int v) {
        Node new_head = new Node(v);
        new_head.nextNode = this.head;
        this.head = new_head;
        this.length++;
    }

    public void pop() {
        if (length == 0) {
            System.out.println("popping empty stack");
            return;
        }
        this.head = this.head.nextNode;
        this.length--;
    }

    public int getSize() {
        return this.length;
    }

    public int top() {
        if (this.length == 0) {
            System.out.println("top of empty stack");
            return -676767676;
        }
        return this.head.value;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1); s.push(2); s.push(3);
        s.pop();
        System.out.println(s.top() + " " + s.getSize());
    }
}
