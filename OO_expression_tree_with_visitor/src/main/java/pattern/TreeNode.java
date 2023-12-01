//abstract superclass of both tree elements (simple, binary)

package pattern;
public abstract class TreeNode {

    protected TreeNode left; //the left subtree
    protected TreeNode right;//the right subtree
    public abstract String getLabel();
  //public abstract String getLabel() ;
  //public abstract void accept(VisitorProtocol.Visitor v);// enable visitation - makes pattern work

}