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
	public void testInsert5() {
		this.tree.insert(10);
		this.tree.insert(5);
		this.tree.insert(20);
		this.tree.insert(30);
		this.tree.insert(3);
		this.tree.insert(4);
		
		System.out.println(this.tree);
		
		assertThat(this.tree.getLeft()).isNotNull();
		assertThat(this.tree.getLeft().getValue()).isEqualTo(5);
		assertThat(this.tree.getRight()).isNotNull();
		assertThat(this.tree.getRight().getValue()).isEqualTo(20);
		
		assertThat(this.tree.getRight().getRight()).isNotNull();
		assertThat(this.tree.getRight().getRight().getValue()).isEqualTo(30);
		
		assertThat(this.tree.getLeft().getLeft()).isNotNull();
		assertThat(this.tree.getLeft().getLeft().getValue()).isEqualTo(3);
		
		assertThat(this.tree.getLeft().getLeft().getRight()).isNotNull();
		assertThat(this.tree.getLeft().getLeft().getRight().getValue()).isEqualTo(4);
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
	
	@Test
	public void testSum06() {
		
		this.tree.insert(8);
		this.tree.insert(15);
		this.tree.insert(20);
		this.tree.insert(6);
		this.tree.insert(3);
		this.tree.insert(9);
		this.tree.insert(10);
		this.tree.insert(22);
		this.tree.insert(7);
		
		assertThat(this.tree.sum()).isEqualTo(100);
	}
	
	@Test
	public void testSum07() {
		
		this.tree.insert(8);
		this.tree.insert(15);
		this.tree.insert(20);
		this.tree.insert(6);
		this.tree.insert(3);
		this.tree.insert(9);
		this.tree.insert(10);
		this.tree.insert(22);
		this.tree.insert(7);
		
		assertThat(this.tree.sum()).isEqualTo(100);
		
		assertThat(this.tree.getRight().sum()).isEqualTo(76);
		
		assertThat(this.tree.getRight().getRight().sum()).isEqualTo(42);
		
		assertThat(this.tree.getLeft().sum()).isEqualTo(16);
		
		assertThat(this.tree.getLeft().getLeft().sum()).isEqualTo(3);
		
	}
	
	@Test
	public void testPrint() {
		
		this.tree.insert(8);
		this.tree.insert(15);
		this.tree.insert(20);
		this.tree.insert(6);
		this.tree.insert(3);
		
		assertThat(this.tree.toString()).isEqualTo("{\"side\": \"null\", \"value\":8, \"left\":{\"side\": \"L\", \"value\":6, \"left\":{\"side\": \"L\", \"value\":3, \"left\":null, \"right\":null}, \"right\":null}, \"right\":{\"side\": \"R\", \"value\":15, \"left\":null, \"right\":{\"side\": \"R\", \"value\":20, \"left\":null, \"right\":null}}}");
	}
}

