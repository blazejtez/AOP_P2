package pattern;

public aspect Visiting extends VisitorProtocol {
    declare parents: TreeNode implements Visitable;
    declare parents: BinaryOperatorNode implements Node;
    declare parents: NumericNode implements Leaf;
}
