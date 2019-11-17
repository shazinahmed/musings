package musings.ds.stack;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLStack<Integer> stack = new LLStack<Integer>();
		stack.pop();
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		stack.push(6);
		stack.push(5);
		stack.push(4);
		System.out.println(stack.size());
		stack.pop();
		stack.pop();
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		stack.pop();
		stack.pop();
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		stack.push(3);
		stack.push(2);
		stack.pop();
		stack.push(1);
		System.out.println(stack);

	}

}
