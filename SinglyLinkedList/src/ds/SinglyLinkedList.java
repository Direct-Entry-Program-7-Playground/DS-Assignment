package ds;

public class SinglyLinkedList {
    private Node firstNode = null;
    private int nodeCount = 0;

    private Node getFirstNode() {
        return firstNode;
    }

    private void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    private int getNodeCount() {
        return nodeCount;
    }

    private void setNodeCount(int nodeCount) {
        this.nodeCount = nodeCount;
    }

    public void add(int number) {
        add(getNodeCount(), number);
    }

    public void add(int index, int number) {
        int nodeCount = getNodeCount();
        if ((index >= 0) && (index <= nodeCount)) {
            Node oldNode;
            Node newNode;

            if (index == 0) {
                oldNode = nodeCount == 0 ? null : getFirstNode();
                newNode = new Node(number, oldNode);
                setFirstNode(newNode);
            } else if (index == nodeCount) {
                newNode = new Node(number, null);
                getNode(index - 1).setNextNode(newNode);
            } else {
                newNode = new Node(number, getNode(index));
                getNode(index - 1).setNextNode(newNode);
            }
            setNodeCount(++nodeCount);
        } else {
            System.out.println("Given index is out of bound of Sinlgy Linked List or negative index given");
        }

    }

    public void remove(int index) {
        if (empty()) {
            System.out.println("Sinlgy Linked List is empty, nothing to remove");
        } else {
            int nodeCount = getNodeCount();
            if ((index >= 0) && (index < nodeCount)) {
                if (index == 0) {
                    setFirstNode(getFirstNode().getNextNode());
                } else {
                    getNode(index - 1).setNextNode(getNode(index).getNextNode());
                }
                setNodeCount(--nodeCount);
            } else {
                System.out.println("Given index is out of bound of Sinlgy Linked List or negative index given");
            }
        }
    }

    private Node getNode(int index) {
        if (empty()) {
            return null;
        }
        int nodeCount = getNodeCount();
        if (index < 0) {
            throw new RuntimeException("Given index is negative");
        }
        if (index >= nodeCount) {
            throw new RuntimeException("Given index is out of bound of Sinlgy Linked List");
        }
        Node node = getFirstNode();
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                break;
            }
            node = node.getNextNode();
        }
        return node;
    }

    public int get(int index) {
        return getNode(index).getData();
    }

    public void print() {
        System.out.print("[");
        if (!empty()) {
            int nodeCount = getNodeCount();
            Node nextNode = getFirstNode();
            for (int i = 0; i < nodeCount; i++) {
                if (i != (nodeCount - 1)) {
                    System.out.print(nextNode.getData() + ",");
                } else {
                    System.out.print(nextNode.getData());
                }
                nextNode = nextNode.getNextNode();
            }
        }
        System.out.println("]");

    }

    public void clear() {
        setFirstNode(null);
        setNodeCount(0);
    }

    public int size() {
        return getNodeCount();
    }

    public boolean contains(int number) {
        if (!empty()) {
            int nodeCount = getNodeCount();
            for (int i = 0; i < nodeCount; i++) {
                if (get(i) == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean empty() {
        return firstNode == null;
    }


}
