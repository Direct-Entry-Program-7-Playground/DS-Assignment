public class Node {
    private int data;
    private Node nextNode;

    public Node(int data, Node nextNode) {
        this.setData(data);
        this.setNextNode(nextNode);
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
