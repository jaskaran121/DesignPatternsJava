package VisitorPattern;

public class ConcreteVisitorA implements IVisitor{

	@Override
	public void open(Class aClass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void open(CompilationUnit compilationUnit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void open(Method aMethod) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close(Class aClass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close(CompilationUnit compilationUnit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close(Method aMethod) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Field aField) {
		// TODO Auto-generated method stub
		System.out.println("Generating code for Field "+ aField.getClass());
	}

	@Override
	public void visit(Statement aStatement) {
		// TODO Auto-generated method stub
		System.out.println("Generating code for Statement " + aStatement.getClass());
	}

}
