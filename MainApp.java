package basic.dev;

import java.util.Scanner;

class MainApp {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
	BimarySearchTree Node = new BimarySearchTree();
	
	Node.insert(42);
	Node.insert(23);
	Node.insert(74);
	Node.insert(11);
	Node.insert(65);
	Node.insert(58);
	Node.insert(94);
	Node.insert(36);
	Node.insert(87);
	Node.insert(99);
	
	System.out.println("RNL: ");
	Node.printRNL(Node.Root);
	System.out.println("\n");
	System.out.println("LNR: ");
	Node.printLNR(Node.Root);
	System.out.println("\n");
	System.out.println("NRL: ");
	Node.printNRL(Node.Root);
	System.out.println("\n");
	System.out.println("RLN: ");
	Node.printRLN(Node.Root);
	System.out.println("\n");
	System.out.println("LRN: ");
	Node.printLRN(Node.Root);
	System.out.println("\n");
	System.out.println("NLR: ");
	Node.printNLR(Node.Root);
	
	System.out.println("\n");
	System.out.printf("Trung Bình Cộng: " + Node.TBC(Node.Root));
	
	System.out.println("\n");
	System.out.printf("Chiều cao cây là: " + Node.chieuCaoCay(Node.Root));
	
	System.out.println("\n");
	System.out.printf("Nút lẻ có 2 con là: " + Node.nutLeHaiCon(Node.Root));
	
	System.out.println("\n");
	System.out.printf("Nút có 2 con: " + Node.demNutHaiCon(Node.Root));
	
	System.out.println("\n");
	Scanner sc = new Scanner(System.in);
	int x, y;
	System.out.println("Nhập vào giá trị x: ");
	x = sc.nextInt();
	System.out.println("Nhập vào giá trị y: ");
	y = sc.nextInt();
	System.out.printf("Số nút chia hết cho x nhưng không chia hết cho y là: " + Node.demXY(Node.Root, x, y));
	}
}