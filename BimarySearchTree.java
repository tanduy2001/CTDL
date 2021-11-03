package basic.dev;

public class BimarySearchTree {
	public Node Root;
	
	public BimarySearchTree() {
		Root = null;
	}
	
	public void insert(int x) {
		Root = insertBST(Root, x);
	}
	
	public Node insertBST(Node Root, int x) {
		if(Root == null) {
			Node p = new Node(x);
			p.left = p.right = null;
			Root = p;
		}
		else {
			if(x < Root.nd) {
				Root.left =  insertBST(Root.left, x);
			}
			else {
				if(x > Root.nd) {
					Root.right = insertBST(Root.right,x);
				}
				else {
					System.out.println("Nut nay da ton tai");
				}
			}
		}
		return Root;		
	}
	
	public void print(Node Root) {
		if (Root != null) {
			Root.printNut();
		}
	}
	//RNL
	public void printRNL(Node Root) {
		if (Root != null) {
			printRNL(Root.right);
			Root.printNut();
			printRNL(Root.left);
		}
	}
	//LNR
	public void printLNR(Node Root) {
		if (Root != null) {
			printLNR(Root.left);
			Root.printNut();
			printLNR(Root.right);
		}
	}
	//NRL
	public void printNRL(Node Root) {
		if (Root != null) {
			Root.printNut();
			printNRL(Root.right);
			printNRL(Root.left);
		}
	}
	//RLN
	public void printRLN(Node Root) {
		if (Root != null) {
			printRLN(Root.right);
			printRLN(Root.left);
			Root.printNut();
		}
	}
	//LRN
	public void printLRN(Node Root) {
		if (Root != null) {
			printLRN(Root.left);
			printLRN(Root.right);
			Root.printNut();
		}
	}
	//NLR
	public void printNLR(Node Root) {
		if (Root != null) {
			Root.printNut();
			printNLR(Root.left);
			printNLR(Root.right);
		}
	}
	//Trung bình cộng
	public int TBC(Node Root) {
		if(Root != null) {
			if(Root.left != null && Root.right != null)
					return (Root.nd + TBC(Root.left) + TBC(Root.right)) / 10;
			else 
				return Root.nd;
		}
		return 0;
	}
	//Chiều cao cây
	public int chieuCaoCay(Node Root) {
		if(Root == null)
			return 0;
		else
		{
			int chieucaotrai = chieuCaoCay(Root.left);
			int chieucaophai = chieuCaoCay(Root.right);
			if(chieucaotrai > chieucaophai)
				return chieucaotrai + 1;
			return chieucaophai + 1;
		}
		
	}
	//Nút lẻ có 2 con
	public int nutLeHaiCon(Node Root) {
		if (Root != null) {
			if (Root.nd % 2 != 0) {
				if ((Root.left != null) && (Root.right != null)) {
					return 1 + nutLeHaiCon(Root.left) + nutLeHaiCon(Root.right);
				}
				else {
					return nutLeHaiCon(Root.left) + nutLeHaiCon(Root.right);
				}
			}
		}
		return 0;
	}
	//Nút 2 con
	public int demNutHaiCon(Node Root) {
		if (Root != null) {
			if ((Root.left != null) && (Root.right != null)) {
				return 1 + demNutHaiCon(Root.left) + demNutHaiCon(Root.right);
			}
			else {
				return demNutHaiCon(Root.left) + demNutHaiCon(Root.right);
			}
		}
		return 0;
	}
	//Số chia hết cho x nhưng không chia hết cho y
	public int demXY(Node Root, int x, int y) {
		if (Root != null) {
			if ((Root.nd % x == 0) && (Root.nd % y != 0)) {
				return 1 + demXY(Root.left,x,y) + demXY(Root.right,x,y);
			}
			else {
				return demXY(Root.left,x,y) + demXY(Root.right,x,y);
			}
		}
		return 0;
	}
}