package deneme;

public class KDTree {
	
	public class Node{
		String data;
		int height;
		int weight;
		Node right;
		Node left;
		public Node(String data, int height, int weight){
			this.data = data;
			this.height = height;
			this.weight = weight;
		}
	}
	
	private Node root;
	
	public void show(){
		show(this.root);
	}
	
	private void show(Node n){
		if (n != null){
			show(n.left);
			System.out.println(n.data + " (" + n.height + ", " + n.weight + ")");
			show(n.right);
		}		
	}
	
	public Node search(String data){
		Node iter = this.root;
		return search(data, iter);
	}
	
	private Node search(String data, Node iter){
		if (iter.data == data){
			return iter;
		}
		if (iter.left != null){
			search(data, iter.left);
		}
		if (iter.right != null){
			search(data, iter.right);
		}
		return null;
	}
	
	public void insert(String data, int height, int weight){
		Node n = new Node(data, height, weight);
		if (this.root == null){ // there is no element k-d tree
			this.root = n;
		} else {
			Node iter = this.root;
			int addedValue;
			int iterValue;
			for (int i = 0; i < Integer.MAX_VALUE; i++){
				if (i % 2 == 0){
					addedValue = n.height;
					iterValue = iter.height;
				} else {
					addedValue = n.weight;
					iterValue = iter.weight;
				}
				if (addedValue < iterValue){
					if (iter.left == null){
						iter.left = n;
						break;
					} else {
						iter = iter.left;
					}
				} else {
					if (iter.right == null){
						iter.right = n;
						break;
					} else {
						iter = iter.right;
					}
				}
			} // end of for loop
		} // end of else
	} // end of function
	
	public static void main(String [] args){
		KDTree t = new KDTree();
		t.insert("Burhan", 15, 20);
		t.insert("Kaan", 20, 20);
		t.insert("Tolga", 5, 20);
		t.insert("Gökçe", 10, 25);
		t.search("XYZ");
		
		t.show();
	}

}
