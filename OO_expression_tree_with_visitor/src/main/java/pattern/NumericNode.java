//Define numeric node with no children

package pattern;

public class NumericNode extends TreeNode {
  private int value;

  public NumericNode(int val) {
    value = val;
  }

  public int getValue(){
    return value;
  }

  public String getLabel(){
     return (Integer.valueOf(value)).toString();
  }

//  public void accept(Visitor v) {
//    //double dispatch - call appropriate visitor function
//    v.visit(this);
//  }
}