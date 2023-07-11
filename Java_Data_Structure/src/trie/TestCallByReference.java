package trie;

class TrieNode {
    int value;

    public TrieNode(int value) {
        this.value = value;
    }
}

 class Trie {
    public TrieNode root;

    public Trie() {
        root = new TrieNode(0);
    }

    public void insert(int value) {
        TrieNode current = root;
        current.value++; // modifies the TrieNode object pointed to by root

        // create a new TrieNode and add it to the Trie
        TrieNode newNode = new TrieNode(value);
        current = newNode; // modifies a local copy of the reference to root
        System.out.println(current.value);
    }
}

public class TestCallByReference {
    public static void main(String[] args) {
        Trie trie = new Trie();
        System.out.println(trie.root.value); // prints 0

        trie.insert(5);
        System.out.println(trie.root.value); // prints 1
    }
}
