package now.com.tree;

public class Node {
	
	Node left, right = null;
	
	int value;
	
	public Node(Node left, Node right){
		this.left = left;
		this.right = right;
	}
	
	public Node(int input){
		this.value = input;
	}

}
