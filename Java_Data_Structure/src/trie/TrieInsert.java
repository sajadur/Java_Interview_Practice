package trie;

public class TrieInsert {

    private static final Integer ALPHABET_SIZE = 26;

    public static void main(String... args){

    }

    public static void insert(TrieNode root, String word){
        TrieNode currentNode = root;

        for(char ch: word.toCharArray()){

            int indx = ch-'a';
            if(currentNode.nodes[indx] == null ){
                currentNode = new TrieNode();
            }

            currentNode = currentNode.nodes[indx];
            currentNode.wordCount++;
        }
    }

    static class TrieNode{
        public TrieNode[] nodes;
        public boolean isEndOfWord;
        public Integer wordCount;
        public TrieNode(){
            nodes = new TrieNode[ALPHABET_SIZE];
            for(int i=0; i<ALPHABET_SIZE; i++){
                nodes[i] = null;
            }
            isEndOfWord = false;
            wordCount = 0;
        }
    }
}
