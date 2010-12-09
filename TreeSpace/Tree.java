import java.util.ArrayList;
import java.util.Queue;


public class Tree{
	
	TreeNode root;
	String[] lookupTable;
	String[] hashes = null;
	
	Tree parent;
	Tree[] children;
	
	int min = 0;
	int max = 0;
	
	public Tree(String treeString){
		if(root == null) root = new TreeNode(treeString);
		lookupTable = new String[root.treeSize + 1];
		hashes = new String[this.root.treeSize - 1];
		root.insert(treeString);
		
		
	}
	
	public void printOrder(){
		root.printOrder();
	}
	
	public String getLeaves(){
		return root.leaves.toString();
	}
	
	public TreeNode getLeftNode(){
		return root.getLeftNode();
	}
	
	public TreeNode getRightNode(){
		return root.getRightNode();
	}
	
/*	public void setNodeValue(){
		root.setNodeValue();
	}
	*/
	
	/**This MUST be called to be able to populate the lookup table*/
/*	public void daysLabeler(){
		root.daysLabeler();
	}*/
	
	public void printDaysValues(){
		root.printDaysValues();
	}
	
	public void populateLookupTable(){
		/*String left = "";
		String right = "";
		int i = 0;
		int j = 0;*/
		
		root.getHashValues(hashes);
		
		/*for(i = 0; i < hashes.length; i++){
			for(j = 1; j < lookupTable.length; j++){
				left = hashes[i].charAt(0) + "";
				right = hashes[i].charAt(2) + "";
				if(Integer.parseInt(left) == j){
					if(lookupTable[j] == null){
						this.lookupTable[j] = hashes[i];
						break;
					}
				
				
					else if(lookupTable[j] != null) {
						if(lookupTable[Integer.parseInt(right)] == null) {
							this.lookupTable[Integer.parseInt(right)] = hashes[i];
						}
						
						else { 

							lookupTable[Integer.parseInt(lookupTable[j].charAt(2) + "")] = 
								lookupTable[j];
							
							lookupTable[j] = hashes[i];
						}
					}
				}
				else if(Integer.parseInt(left) == j){
					this.lookupTable[Integer.parseInt(right)] = hashes[i];
					break;
				}
			}
		}	*/
	}
	
	public Tree getParent() {
		return parent;
	}
	
	
	public void reOrder() {
		root.reOrder();
	}
	
	public void addValue() {
		root.addValue();
	}
	
	public void printValue() {
		root.printValue();
	}
	
	public TreeNode parentOf(double value) {
		return root.parentOf(value);
	}
	
	public TreeNode grandParentOf(double value) {
		return root.grandParentOf(value);
	}
}

	
/**	public void setLookupTable(){
		for(int i = 1; i < lookupTable.length; i++){
			while((getLeftNode().leftNode != null) && (getLeftNode().leftNode.treeSize != 1)){
				getLeftNode().getLeftNode();
			}
			if(getLeftNode().leftNode.treeSize ==  1){
				if(getLeftNode().rightNode.treeSize == 1){
					if(lookupTable[i] == null){
						lookupTable[i] =
							getLeftNode().leftNode.nodeValue + ", " + 
							getLeftNode().rightNode.nodeValue + ":" +  ;
					}
				}
			}
		}
	}
	*/

/**	public void setLookupTable(){
		for(int i = 1; i < root.getHashes().length; i++){
			if(root.getHashes()[root.getHashes().length - 1] != "1"){
				if(lookupTable[i] == null){
				lookupTable[i] = root.getHashes()[i];	
				}
				else if(lookupTable[i] != null){
					if(root.getHashes()[i].length() == 8)
					lookupTable[Integer.parseInt(root.getHashes()[i].charAt(4) + "")] = root.getHashes()[i].charAt(4) + "";
				}
				
			}
		}
	}*/
	



