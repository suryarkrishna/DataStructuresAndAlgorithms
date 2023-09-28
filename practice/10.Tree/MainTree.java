import java.util.ArrayList;

import org.w3c.dom.Node;

public class MainTree {
    public static void main(String[] args) {
        // an attemp to recreate the learning of creating a basic tree
        // 4. Create root node and add child nodes and print them
        TreeNode practice = new TreeNode("Practice");
        TreeNode tree = new TreeNode("Tree");
        TreeNode mainTree = new TreeNode("MainTree.java");
        TreeNode treeDemo = new TreeNode("TreeDemo.java");
        practice.addChild(tree);
        tree.addChild(mainTree);
        tree.addChild(treeDemo);
        
        TreeNode recursion = new TreeNode("Recursion");
        TreeNode gcd = new TreeNode("GCD.java");
        TreeNode sum = new TreeNode("SumOfDigits.java");
        TreeNode fib = new TreeNode("Fibonacci.java");
        practice.addChild(recursion);
        recursion.addChild(gcd);
        recursion.addChild(fib);
        recursion.addChild(sum);

        System.out.println(practice.print(0));

    }
}

class TreeNode {
    // 1. Create a new Class for TreeNode - Node has data and connections to other
    // nodes
    String data;
    ArrayList<TreeNode> children; // why we are using arraylist , I am not sure either. May be since we will be
                                  // only add childs at the end.
    // constructor to initialise data and node

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    // 2. Method to add child nodes
    public void addChild(TreeNode node) {
        this.children.add(node);
    }

    // 3. Method to print tree ( bit complicated )
    public String print(int level) { // Don't ask me why we are using level to print the tree. It's like using root
                                     // level and going down the tree using recursion and increasing the level.
        // print the root node;
        String tree;
        tree = repeatString(level, "  ") + data + "\n"; // this makes the indentation repeat as per level and make it
                                                        // look like file structure
        for (TreeNode node : this.children) {
            tree += node.print(level + 1);
        }
        return tree;
    }

    private static String repeatString(int level, String data) {
        // TODO
        String res = "";
        for (int i = 0; i < level; i++) {
            res += "  ";
        }
        return res;
    }

}
