package com.bridelabz;

public class BinaryTreeClass {
    static class Node {
        int data;
        Node left;
        Node right;

        //create Node Class
        Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }


        public static void main(String[] args) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree binarytree = new BinaryTree();
            Node root = binarytree.buildTree(nodes);

            System.out.println("Display Root");
            System.out.println(root.data);
            System.out.println("==================================");

        }
    }
}
