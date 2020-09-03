package com.sapient.assessment.binarytrees;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Node {

	int data;
	public Node left;
	public Node right;

	public Node(int data, Node left, Node right) {

		this.data = data;
		this.left = left;
		this.right = right;
	}

	/**
	 * Method to get new root node
	 * 
	 * @param data
	 * @return
	 */
	public static Node newNode(int data) {
		return new Node(data, null, null);
	}

	/**
	 * Method to insert node data in Inorder
	 * 
	 * @param node
	 */
	public static List<String> inOrder(Node node) {
		List<String> dataList = new ArrayList<String>();
		if (null == node)
			return null;
		inOrder(node.left);
		dataList.add(String.valueOf(node.data));
		inOrder(node.right);

		return dataList;
	}

	/**
	 * Method to merge two trees
	 * 
	 * @return
	 */
	public static Node mergeTrees(Node firstNode, Node secondNode) {

		if (null == firstNode)
			return secondNode;
		if (null == secondNode)
			return firstNode;
		firstNode.data = firstNode.data*secondNode.data;
		firstNode.left = mergeTrees(firstNode.left, secondNode.left);
		firstNode.right = mergeTrees(firstNode.right, secondNode.right);
		return firstNode;
	}
}
