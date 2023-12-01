package pattern;

//Tree node that contains two children

public abstract class BinaryOperatorNode extends TreeNode {
    protected TreeNode left, right;

  public BinaryOperatorNode() {
    this.left = null;
    this.right = null;
  }

  public BinaryOperatorNode(TreeNode left, TreeNode right) {
    this.left = left;
    this.right = right;
  }

  public TreeNode getLeft() {
    return left;
  }

  public TreeNode getRight() {

    return right;
  }

  public abstract String getLabel();

// Apply this operator (+,-,*,/ etc.) to the given operands
public abstract int compute(int a, int b);

//  /*************************/
//  //accept a visitor
//  public void accept(Visitor v) {
//    /***************************/
//    //double dispatch - call appropriate visitor function
//    v.visit(this);
//  }


}