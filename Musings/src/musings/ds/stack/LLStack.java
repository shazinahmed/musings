package musings.ds.stack;

public class LLStack<T> {
	
	private LinkedList<T> list = new LinkedList<T>();
	
	public void push(T pData)
	{
		list.addToTop(pData);
	}
	
	public T pop()
	{
		return list.removeFromTop();
	}
	
	public int size()
	{
		return list.size();
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public String toString()
	{
		return list.toString();
	}
	
	private class LinkedList<K> {
		
		private class Node<E>{
			private E data;
			private Node<E> next;
			
			public Node(E pData)
			{
				data = pData;
			}
			
			@Override
			public String toString()
			{
				return data.toString();
			}
		}
		
		private Node<K> top = null;
		private int size = 0;
		
		private void addToTop(K pData)
		{
			Node<K> newFirst = new Node<K>(pData);
			Node<K> oldFirst = top;
			top = newFirst;
			top.next = oldFirst;
			size++;
		}

		private K removeFromTop()
		{
			if (top != null)
			{
				Node<K> popped = top;
				top = top.next;
				size--;
				return popped.data;
			}
			return null;
		}
		
		private int size()
		{
			return size;
		}
		
		private boolean isEmpty()
		{
			return top == null;
		}
		
		@Override
		public String toString()
		{
			Node<K> current = top;
			StringBuilder builder = new StringBuilder();
			while (current != null)
			{
				builder.append(current.data).append(" ");
				current = current.next;
			}
			return builder.toString();
		}

	}
}
