package com.bridelabz;


import java.util.LinkedList;
import java.util.Queue;

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


    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "  ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + "  ");
    }

    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            if (currentNode == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(currentNode.data + "  ");

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
    }


        public static void main (String[]args){
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree binarytree = new BinaryTree();
            Node root = binarytree.buildTree(nodes);

            System.out.println("Display Root");
            System.out.println(root.data);
            System.out.println("==================================");
            System.out.println("Display Preorder");
            preorder(root);
            System.out.println();
            System.out.println("==================================");
            System.out.println("Display Inorder");
            inorder(root);
            System.out.println();
            System.out.println("==================================");
            System.out.println("Display postorder");
            postorder(root);
            System.out.println();
            System.out.println("==================================");
            System.out.println("Display Levelorder");
            levelorder(root);
        }
    }
