package ads2;

import com.sun.source.tree.Tree;

import java.util.Vector;

public class TreeNode
{
    private String data;     // data about this node
    private char ID;
    // Add in variables to hold one or more child nodes
    private TreeNode Lchild;
    private TreeNode Rchild;
    private TreeNode parent;
    private TreeNode nextSibling;
    // Add constructors
    TreeNode(char ID){
        this.Lchild = null;
        this.Rchild = null;
        this.parent = null;
        this.ID = ID;
    }
    // Add extra setter and getter methods


    public TreeNode getLchild() {
        return Lchild;
    }

    public TreeNode getRchild() {
        return Rchild;
    }

    public String getData()
    {
        return data;
    }

    public TreeNode getParent(){
        return this.parent;
    }

    public TreeNode getNextSibling(){
        return this.nextSibling;
    }

    public void setLchild(TreeNode lchild) {
        Lchild = lchild;
    }

    public void setRchild(TreeNode rchild) {
        Rchild = rchild;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public char getID() {
        return ID;
    }
}
