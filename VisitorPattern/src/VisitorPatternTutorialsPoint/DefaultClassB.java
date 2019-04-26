package VisitorPatternTutorialsPoint;

public class DefaultClassB implements IDefaultClass{

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
