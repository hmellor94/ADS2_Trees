package ads2;

public class ADS2Tree
{
    private TreeNode root;  // the root of this tree

    // Add required constructors
    ADS2Tree(TreeNode root) {
        this.root = root;
    }
    // Add extra setter and getter methods

    /**
     * A public method to add a child to a parent. You can use this method to build
     * a tree from its root.
     * @param parent the parent node of the tree.
     * @param newChild the new child node to be attached.
     */
    public void addChild(TreeNode parent, TreeNode newChild)
    {

    }

    public void addChildByID(String parentID, String newChildID){

    }

    private TreeNode searchByID(String ID){
        return null;
    }

    public void preOrderPrint(TreeNode StartFrom){
        if (StartFrom != null){
            System.out.println(StartFrom.getID());
            preOrderPrint(StartFrom.getLchild());
            preOrderPrint(StartFrom.getRchild());
        }
    }

    TreeNode GetRoot()
    {
        return this.root;
    }
}
