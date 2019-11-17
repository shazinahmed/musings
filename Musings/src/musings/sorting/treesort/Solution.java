package musings.sorting.treesort;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTree tree = new Solution().new MyTree();
		int[] intArray = new int[] {3,4,1,9,23,1,4};
		for (int i=0; i<intArray.length; i++)
		{
			tree.insertValue(intArray[i]);
		}
		tree.inorderPrint();
	}
	
	class MyTree
	{
		Node root;
		
		public void insertValue(int key)
		{
			
			root = insert(root, key);
		}
		
		private Node insert(Node root, int key)
		{
			if (root == null)
			{
				root = new Node(key);
				return root;
			}
			if (root.key >= key)
			{
				root.left = insert(root.left, key);
			}
			if (root.key < key)
			{
				root.right = insert(root.right, key);
			}
			return root;
		}
		
		public void inorderPrint()
		{
			inorderPrintRec(root);;
		}
		
		private void inorderPrintRec(Node node)
		{
			if (node != null) {
				inorderPrintRec(node.left);
				System.out.println(node.key);
				inorderPrintRec(node.right);
			}
		}
		
		class Node
		{
			int key;
			Node left;
			Node right;
			
			public Node(int pKey)
			{
				key = pKey;
				left = right = null;
			}
		}
	}
}
