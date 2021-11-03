package basic.dev;

class Node {
	Node left,right;
	int nd;
	
	public Node(int x ) {
		nd = x;
		left = right = null;
	}
	public void printNut() {
		System.out.println(nd + " ");
	}
}