package musings.ds.stack;

public class LinkedListForStack<T> {
	
	private static class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T pData)
		{
			data = pData;
		}
		
		@Override
		public String toString()
		{
			return data.toString();
		}
	}
	
	private Node<T> first = null;
	
	public void addFirst(T pData)
	{
		Node<T> newFirst = new Node<T>(pData);
		Node<T> oldFirst = first;
		first = newFirst;
		first.next = oldFirst;
	}

	public T removeFirst()
	{
		Node<T> popped = first;
		first = first.next;
		return popped.data;
	}
	
	@Override
	public String toString()
	{
		Node<T> current = first;
		StringBuilder builder = new StringBuilder();
		while (current != null)
		{
			builder.append(current.data).append(" ");
			current = current.next;
		}
		return builder.toString();
	}
}
