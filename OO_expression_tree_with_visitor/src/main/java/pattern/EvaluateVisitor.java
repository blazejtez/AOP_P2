package pattern;

import java.util.Stack;


public class EvaluateVisitor implements VisitorProtocol.Visitor {

    private Stack<Integer> stack = new Stack<>();

    public int getValue() {
        return stack.peek();
    }

    @Override
    public void visit(VisitorProtocol.Node node) {
        BinaryOperatorNode bonode = (BinaryOperatorNode) node;
        if (bonode.getLeft() != null) bonode.getLeft().accept(this);
        if (bonode.getRight() != null) bonode.getRight().accept(this);
        int right = stack.pop();
        int left = stack.pop();
        stack.push(bonode.compute(left, right));

    }

    @Override
    public void visit(VisitorProtocol.Leaf leaf) {
        NumericNode nnode = (NumericNode) leaf;
        stack.push(nnode.getValue());
    }
}