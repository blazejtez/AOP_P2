package pattern;

//Visitor to print the expression in postfix notation

public class PostFixPrintVisitor implements VisitorProtocol.Visitor  {


//  public void visit(BinaryOperatorNode node)  {
//    //print out left subtree
//    if (node.getLeft() != null) node.getLeft().accept(this);
//    //print out right subtree
//    if (node.getRight() != null) node.getRight().accept(this);
//    //print out this node
//    System.out.print(node.getLabel());
//
//  }


  public void visit(NumericNode node)  {
    System.out.print(node.getLabel());
  }

  @Override
  public void visit(VisitorProtocol.Node node) {
    BinaryOperatorNode bonode = (BinaryOperatorNode) node;
    //print out left subtree
    if (bonode.getLeft() != null) bonode.getLeft().accept(this);
    //print out right subtree
    if (bonode.getRight() != null) bonode.getRight().accept(this);
    //print out this node
    System.out.print(bonode.getLabel());
  }

  @Override
  public void visit(VisitorProtocol.Leaf leaf) {
    NumericNode nnode = (NumericNode) leaf;
    System.out.print(nnode.getLabel());
  }
}