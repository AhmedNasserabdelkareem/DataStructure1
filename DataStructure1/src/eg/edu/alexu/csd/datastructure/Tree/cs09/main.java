package eg.edu.alexu.csd.datastructure.Tree.cs09;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bnode n = new Bnode(-1,null,null);
		BinaryTree x = new BinaryTree(n);
		//for(int i=0;i<10;i++){
		//	x.addnode(new Bnode(i, null, null), n);
	//	}
		x.addnode(new Bnode(0, null, null), n);
		x.addnode(new Bnode(4, null, null), n);
		x.addnode(new Bnode(3, null, null), n);
		x.addnode(new Bnode(0, null, null), n);
		


		x.searchnode(5, n);
		

	}

}
