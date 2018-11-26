package com.s2it.evaluation.binarytree;

public class BinaryTree {

	private int value;

	private BinaryTree left;

	private BinaryTree right;
	
	private String side;

	public BinaryTree() {
		super();
	}

	// Root tree constructor
	public BinaryTree(int value) {
		super();
		this.value = value;
	}
	
	// Root tree constructor with side
	public BinaryTree(int value, String side) {
		super();
		this.value = value;
		this.side = side;
	}

	// Leaves tree constructor
	public BinaryTree(int value, BinaryTree left, BinaryTree right) {
		super();
		this.value = value;
		this.left = left;
		this.right = right;
	}

	// Resursive Sum
	public int sum() {
		return this.value + 
			  (this.left == null ? 0 : this.left.sum()) + 
			  (this.right == null ? 0 : this.right.sum());
	}

	public void insert(int value) {

		// Empty Tree
		if (this.value == 0) {

			this.value = value;

		} else {

			BinaryTree newNode = new BinaryTree(value);
			insert(this, newNode);

		}
	}

	public void insert(BinaryTree parente, BinaryTree node) {

		// Go t Right
		if (node.value > parente.value) {
	
			// The tree does not have a right child node
			if (parente.right == null) {

				node.isRight();
				parente.right = node;
	
			} else {
	
				// The tree have a right child node. Go down the tree
				insert(parente.right, node);
			}
	
		} else { // Go to left
	
			// The tree does not have a left child node
			if (parente.left == null) {
	
				node.isLeft();
				parente.left = node;
	
			} else {
	
				// The tree have a left child node. Go down the tree
				insert(parente.left, node);
			}
		}
	}
	
	public void isLeft() {
		this.side = "L";
	}
	public void isRight() {
		this.side = "R";
	}
	
	public int getValue() {
		return this.value;
	}
	
	public BinaryTree getRight() {
		return this.right;
	}
	
	public BinaryTree getLeft() {
		return this.left;
	}
	
	@Override
	public String toString() {
		return "{\"side\": \""+this.side+"\", \"value\":" + this.value + ", \"left\":" + this.left + ", \"right\":"+ this.right + "}";
		//return "{\"side\": "+this.right+"}";
	}
}


