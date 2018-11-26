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
	public void testInsert2() {
		this.tree.insert(10);
		this.tree.insert(5);
		this.tree.insert(20);
		
		assertThat(this.tree.getLeft()).isNotNull();
		assertThat(this.tree.getLeft().getValue()).isEqualTo(5);
		assertThat(this.tree.getRight()).isNotNull();
		assertThat(this.tree.getRight().getValue()).isEqualTo(20);
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
	
	@Test
	public void testSum02() {
		
		this.tree.insert(1);
		this.tree.insert(2);
		this.tree.insert(3);
		
		assertThat(this.tree.sum()).isEqualTo(6);
	}
	
	@Test
	public void testSum03() {
		
		this.tree.insert(1);
		this.tree.insert(3);
		this.tree.insert(2);
		
		assertThat(this.tree.sum()).isEqualTo(6);
	}
	
	@Test
	public void testSum04() {
		
		this.tree.insert(1);
		this.tree.insert(5);
		this.tree.insert(2);
		this.tree.insert(8);
		this.tree.insert(20);
		this.tree.insert(3);
		
		assertThat(this.tree.sum()).isEqualTo(39);
	}
	
	@Test
	public void testSum05() {
		
		this.tree.insert(10);
		this.tree.insert(5);
		this.tree.insert(20);
		this.tree.insert(8);
		this.tree.insert(20);
		this.tree.insert(3);
		
		assertThat(this.tree.sum()).isEqualTo(66);
	}
	
}

