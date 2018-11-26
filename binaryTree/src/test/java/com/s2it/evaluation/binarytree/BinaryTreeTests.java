package com.s2it.evaluation.binarytree;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTests {

	BinaryTree tree;

	@Before
	public void init() {
		this.tree = new BinaryTree();
	}

	@Test
	public void testInsert() {
		this.tree.insert(1);
	}

	@Test
	public void testSumZero() {
		assertThat(this.tree.sum()).isEqualTo(0);
	}

	@Test
	public void testSum01() {
		this.tree.insert(1);
		assertThat(this.tree.sum()).isEqualTo(1);
	}
}
