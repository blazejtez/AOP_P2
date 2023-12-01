package pattern;

public abstract aspect VisitorProtocol
{
    protected interface Visitable  {}
    protected interface Node extends Visitable  {
    }
    protected interface Leaf extends Visitable  {}


    public interface Visitor {
        public void visit(Node node);
        public void visit(Leaf leaf);
    }

    public void Visitable.accept(Visitor visitor) {}

    public void Node.accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void Leaf.accept(Visitor visitor) {
        visitor.visit(this);
    }


}
