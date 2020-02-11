package ads2;

public class Main
{
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode('A');

        TreeNode Node = new TreeNode('B');
        root.setLchild(Node);
        TreeNode Node1 = new TreeNode('C');
        root.setRchild(Node1);
        TreeNode Node2 = new TreeNode('D');
        Node.setLchild(Node2);
        TreeNode Node3 = new TreeNode('E');
        Node.setRchild(Node3);
        TreeNode Node4 = new TreeNode('F');
        Node3.setLchild(Node4);


        ADS2Tree tree = new ADS2Tree(root);
        tree.preOrderPrint(root);
    }




}
