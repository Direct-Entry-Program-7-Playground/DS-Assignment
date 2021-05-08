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

    }

    public void add(int index, int number) {

    }

    public void remove(int index) {

    }

    public int get(int index) {
        return 0;
    }

    public void print() {
        if (empty()) {
            System.out.println("Linked list is empty");
        } else {
            int nodeCount = getNodeCount();
            Node nextNode = getFirstNode();
            for (int i = 0; i < nodeCount; i++) {
                if (i == 0) {
                    System.out.println("[" + nextNode.getData() + ",");
                } else if (i == (nodeCount - 1)) {
                    System.out.println(nextNode.getData() + "]");
                } else {
                    System.out.println(nextNode.getData() + ",");
                }
                nextNode = nextNode.getNextNode();
            }
        }
    }

    public void clear() {
        setFirstNode(null);
        setNodeCount(0);
    }

    public int size() {
        return getNodeCount();
    }

    public boolean contains(int number) {
        return false;
    }

    public boolean empty() {
        return firstNode == null;
    }


}
