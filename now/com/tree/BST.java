package now.com.tree;

public class BST {
	
	public Node addToTree(Node root, int input){
		
		if(root == null)
			return new Node(input);
		
		if(root.value > input){
			if(root.left == null){
				root.left = new Node(input);
			}else{
				return addToTree(root.left, input);
			}
		} else{
			if(root.right == null){
				root.right = new Node(input);
			}else
				return addToTree(root.right, input);
		} 	
		return root;
	}
	
	public void print(){
		
	}
	
	public static void main(String args[]){
		
		BST bst = new BST();

		Node tree = bst.addToTree(null, 9);
		tree = bst.addToTree(tree, 8);
		tree = bst.addToTree(tree, 10);
		tree = bst.addToTree(tree, 3);
		tree = bst.addToTree(tree, 13);
		System.out.println(tree);
	}
}
