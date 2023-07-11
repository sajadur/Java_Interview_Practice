package trie;


class Node{
    int value;
    Node(int value){
        this.value = value;
    }
}
public class ReferenceCheck {
    public static void main(String ... args){
        Node root = new Node(0);
        callFunc(root);
        System.out.println(root.value);
    }
    public static void callFunc(Node node){
        Node currentNode = node;
        currentNode.value++;
        System.out.println(currentNode.value);
        Node newNode = new Node(5);
        currentNode = newNode;
        currentNode.value++;
        node=currentNode;
        System.out.println(currentNode.value);
    }
}
