package pattern;
//Visitor to print the expression in infix notation

import jdk.incubator.vector.VectorOperators;
import pattern.BinaryOperatorNode;
import pattern.NumericNode;
import pattern.VisitorProtocol;

public class InFixPrintVisitor implements VisitorProtocol.Visitor {

  @Override
  public void visit(VisitorProtocol.Node node) {
    BinaryOperatorNode bonode = (BinaryOperatorNode) node;
    //print out left subtree
    System.out.print("(");
    if (bonode.getLeft() != null) bonode.getLeft().accept(this);
    //print out this node
    System.out.print(" " + bonode.getLabel() + " ");
    //print out right subtree
    if (bonode.getRight() != null) bonode.getRight().accept(this);
    System.out.print(")");
  }

  @Override
  public void visit(VisitorProtocol.Leaf leaf) {
    NumericNode nnode = (NumericNode) leaf;
    System.out.print(nnode.getLabel());
  }
}