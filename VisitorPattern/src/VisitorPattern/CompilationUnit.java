package VisitorPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CompilationUnit implements ICompiler{
	
	List<Class> classesList = new ArrayList<>(Arrays.asList(new Class()));
	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.open(this);
		
		Iterator iterator = this.classesList.iterator();
		while(iterator.hasNext())
		{
			Class aClass = (Class) iterator.next();
			aClass.accept(visitor);
		}
		visitor.close(this);
	}

}
