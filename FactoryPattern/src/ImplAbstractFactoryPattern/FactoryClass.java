package ImplAbstractFactoryPattern;

import java.util.List;
import java.util.stream.Collectors;

import IAbstractFactoryPattern.ISort;

public class FactoryClass {

	public <E> ISort<E> getInstanceInsertionSort()
	{
		return new InsertionSort<E>();
	}
}

class InsertionSort<E> implements ISort<E>
{

	@Override
	public List<E> Sorted(List<E> aList) {
		List<E> sortedList = aList.stream().sorted().collect(Collectors.toList());
		return sortedList;
	}
	
}
