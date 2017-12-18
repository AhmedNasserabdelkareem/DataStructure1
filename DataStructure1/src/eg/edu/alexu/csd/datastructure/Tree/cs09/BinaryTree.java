package eg.edu.alexu.csd.datastructure.Tree.cs09;

import eg.edu.alexu.csd.datastructure.stack.cs09.Node;

public class BinaryTree {
	

	public Bnode root=null;
	public int size=0;
	 BinaryTree(Bnode rooted){
			this.root=rooted;
	}
	public  Boolean isEmpty(){
		if(root==null){
			return true;
		}else{
			return false;
		}
	}

	public void addnode (Bnode node , Bnode root){
		if(node==null)
			return;
	
		if((int)node.value>(int)root.value){
			if(root.right==null){
				root.right=node;
			}else{
				addnode(node,root.right);
			}
		}

		if((int)node.value<(int)root.value){
			if(root.left==null){
				root.left=node;
			}else{
				addnode(node,root.left);
			}
		}
	}
	
	public void searchnode(Object v, Bnode rootis){
		
		if(rootis==null)
			return ;
		
		if((int)v==(int)rootis.value){
			System.out.println("Found");
			return;
		}

		if((int)v>(int)rootis.value){
			searchnode(v, rootis.right);

		}

		if((int)v<(int)rootis.value){
			searchnode(v, rootis.left);

		}
		
		
	}
}