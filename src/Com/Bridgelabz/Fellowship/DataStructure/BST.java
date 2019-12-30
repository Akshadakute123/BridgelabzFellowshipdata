package Com.Bridgelabz.Fellowship.DataStructure;

public class BST
{

	
		class Node { 
			int key; 
			Node left, right;
			
			public Node next; 

			public Node(int item) { 
				key = item; 
				left = right = null; 
			
		} 
			
			}
		static Node root;
		BST(){
			root=null;

	}
		Node insert(int key) {
			return root=insertRec(root, key);
		}
		Node insertRec(Node root,int key)
		{
			if(root==null) {

				return  new Node(key);
			}
			if(key<root.key) {
				root.left= insertRec(root.left, key); 				
			}
			else if(key>root.key) {
				root.right=insertRec(root.right, key);
			}
			return root;
		}
		public void exist(Node root,int key) {
			Node res=recExistBst(root, key);
			if(res.key==key)
			{
				System.out.println("found in tree");
			}
			else {
				System.out.println("Not found in tree");
			}
		}
		public static Node recExistBst(Node root,int key) {
		  if(root==null || root.key==key)
			return root;
		  if(root.key>key) 
			  return recExistBst(root.left, key);
			  else
				  return recExistBst(root.right, key);
		  }
		public void inOrder() {
			recInOrder(root);
		}
		public static void recInOrder(Node root) {
			if(root!=null)
			{
				recInOrder(root.left);
				System.out.println(root.key);
				recInOrder(root.right);
			}
			
			
		}
			

			
			
		}



