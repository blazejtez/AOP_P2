package pattern;

//Visitor to print the expression in prefix notation

public class PreFixPrintVisitor implements VisitorProtocol.Visitor {

    @Override
    public void visit(VisitorProtocol.Node node) {
        BinaryOperatorNode bonode = (BinaryOperatorNode) node;
        //print out this node
        System.out.print(bonode.getLabel());
        //print out left subtree
        if (bonode.getLeft() != null) bonode.getLeft().accept(this);
        //print out right subtree
        if (bonode.getRight() != null) bonode.getRight().accept(this);
    }


    @Override
    public void visit(VisitorProtocol.Leaf leaf) {
        NumericNode nnode = (NumericNode) leaf;
        System.out.print(nnode.getLabel());
    }
}