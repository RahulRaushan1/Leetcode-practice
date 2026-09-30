class Solution {

    static class Node {
        Node[] child = new Node[26];
        int index = -1;
    }

    Node root = new Node();
    String[] container;

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        container = wordsContainer;

        for (int i = 0; i < wordsContainer.length; i++) {
            insert(wordsContainer[i], i);
        }

        int[] ans = new int[wordsQuery.length];

        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }

    void insert(String word, int index) {
        Node curr = root;

        update(curr, index);

        for (int i = word.length() - 1; i >= 0; i--) {

            int ch = word.charAt(i) - 'a';

            if (curr.child[ch] == null) {
                curr.child[ch] = new Node();
            }

            curr = curr.child[ch];

            update(curr, index);
        }
    }

    void update(Node node, int index) {
        if (node.index == -1 ||
            container[index].length() < container[node.index].length()) {

            node.index = index;
        }
    }

    int search(String word) {

        Node curr = root;

        int ans = root.index;

        for (int i = word.length() - 1; i >= 0; i--) {

            int ch = word.charAt(i) - 'a';

            if (curr.child[ch] == null) {
                break;
            }

            curr = curr.child[ch];
            ans = curr.index;
        }

        return ans;
    }
}