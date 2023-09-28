public class BinaryTree {
    public static void main(String[] args) {
        // System.out.println("Full binary tree: Binary tree with 0 or two childs but not one.");
        // System.out.println("Perfect Binary Tree: contains only 2 two childrens for all nodes except leaf nodes");
        // System.out.println("Complete Binary Tree: contains 2 children except last level ");
        // System.out.println("Balanced Binary Tree: all leaf nodes are located at the same distance from root node");
        try {
            if (!System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("-----Binary Tree using LinkedList---");

        BinaryTreeLL binaryTree = new BinaryTreeLL();





        
    }
}

class BinaryNode {
    String data;
    BinaryNode left;
    BinaryNode right;
    public int height;
}

class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL(){
        this.root = null;
    }


}
