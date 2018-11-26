package com.s2it.evaluation.binarytree;

public class BinaryTree {

	private int value;

	private BinaryTree left;

	private BinaryTree right;

	public BinaryTree() {
		super();
	}

	// Root tree constructor
	public BinaryTree(int value) {
		super();
		this.value = value;
	}

	// Leaves tree constructor
	public BinaryTree(int value, BinaryTree left, BinaryTree right) {
		super();
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public int sum() {
		return 0;
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
	
				parente.right = node;
	
			} else {
	
				// The tree have a right child node. Go down the tree
				insert(parente.right, node);
			}
	
		} else { // Go to left
	
			// The tree does not have a left child node
			if (parente.left == null) {
	
				parente.left = node;
	
			} else {
	
				// The tree have a left child node. Go down the tree
				insert(parente.left, node);
			}
		}
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
}


