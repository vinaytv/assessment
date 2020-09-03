package com.sapient.assessment;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sapient.assessment.binarytrees.Node;

class MergeTreesMainTest {

	@Autowired
	Node node;

	@Test
	public static void mergeTreesTest() {
		assertThat(Node.mergeTrees(null, null)).is(null);

	}

	@Test
	public static void testMergeTrees1() {
		assertThat(Node.mergeTrees(null, null)).is(null);
		Node firstRoot = Node.newNode(5);
		firstRoot.left = Node.newNode(3);
		firstRoot.right = Node.newNode(6);
		firstRoot.left.left = Node.newNode(2);

		Node secondRoot = Node.newNode(4);
		secondRoot.left = Node.newNode(2);
		secondRoot.left.right = Node.newNode(1);

		Node merged = Node.mergeTrees(firstRoot, secondRoot);

		String[] elements = { "2", "6", "1", "20", "6" };

		assertThat(Node.inOrder(merged)).isEqualTo(Arrays.asList(elements));

	}

	@Test
	public static void testMergeTrees2() {
		Node firstRoot = Node.newNode(5);
		firstRoot.left = Node.newNode(8);
		firstRoot.right = Node.newNode(8);
		firstRoot.left.right = Node.newNode(2);

		Node secondRoot = Node.newNode(6);
		secondRoot.left = Node.newNode(2);
		secondRoot.left.left = Node.newNode(1);

		Node merged = Node.mergeTrees(firstRoot, secondRoot);

		String[] elements = { "1", "16", "2", "30", "8" };

		assertThat(Node.inOrder(merged)).isEqualTo(Arrays.asList(elements));

	}

	@Test
	public static void testMergeTrees3() {
		Node firstRoot = Node.newNode(5);
		firstRoot.left = Node.newNode(10);
		firstRoot.right = Node.newNode(11);
		firstRoot.left.left = Node.newNode(1);

		Node secondRoot = Node.newNode(6);
		secondRoot.right = Node.newNode(2);
		secondRoot.right.right= Node.newNode(1);

		Node merged = Node.mergeTrees(firstRoot, secondRoot);

		String[] elements = { "1", "10", "30", "22", "1" };

		assertThat(Node.inOrder(merged)).isEqualTo(Arrays.asList(elements));

	}

	@Test
	public static void testMergeTrees4() {
		assertThat(Node.mergeTrees(null, null)).is(null);
		Node firstRoot = Node.newNode(15);
		firstRoot.left = Node.newNode(30);
		firstRoot.right = Node.newNode(6);
		firstRoot.left.left = Node.newNode(2);

		Node secondRoot = Node.newNode(6);
		secondRoot.left = Node.newNode(2);
		secondRoot.left.right = Node.newNode(1);

		Node merged = Node.mergeTrees(firstRoot, secondRoot);

		String[] elements = { "1", "30", "90", "22", "1" };

		assertThat(Node.inOrder(merged)).isEqualTo(Arrays.asList(elements));

	}


}
