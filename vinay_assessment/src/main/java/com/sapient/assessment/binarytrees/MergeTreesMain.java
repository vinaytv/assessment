package com.sapient.assessment.binarytrees;

public class MergeTreesMain {

	public static void main(String[] args) {

		Node firstRoot = Node.newNode(5);
		firstRoot.left = Node.newNode(3);
		firstRoot.right = Node.newNode(6);
		firstRoot.left.left = Node.newNode(2);

		Node secondRoot = Node.newNode(4);
		secondRoot.left = Node.newNode(2);
		secondRoot.left.right = Node.newNode(1);

		Node merged = Node.mergeTrees(firstRoot, secondRoot);

		
		Node.inOrder(merged);
	}

}
