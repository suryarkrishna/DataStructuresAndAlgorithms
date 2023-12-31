import java.util.ArrayList;

public class TreeDemo {
    public static void main(String[] args) {

        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        drinks.addChild(hot);
        drinks.addChild(cold);

        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        hot.addChild(tea);
        hot.addChild(coffee);
        
        TreeNode wine = new TreeNode("Wine");        
        TreeNode beer = new TreeNode("Beer");
        cold.addChild(wine);    
        cold.addChild(beer);

        System.out.println(drinks.print(0));

    }
}

class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();

    }

    public void addChild(TreeNode node) {
        this.children.add(node);
    }

    public String print(int level) {
        String ret;
        ret = "  ".repeat(level) + data + "\n";
        for (TreeNode node : this.children) {
            ret += node.print(level + 1);
        }
        return ret;

    }

}
