package eg.edu.alexu.csd.datastructure.Tree.cs09;

public class Bnode {
	public Bnode left=null;
	public Bnode right=null;
	public Object value =null;
	public Bnode(Object x , Bnode r,Bnode l){
		this.value=x;
		this.right=r;
		this.left=l;
		
	}
	
	public boolean isleaf(){
		
		return this.left==null&&this.right ==null;
	}
	
	public void print (){
		System.out.println(this.value);
		if(this.left!=null){
			this.left.print();
		}
		
		if(this.right !=null){
			this.right.print();
			
		}
	}

}
