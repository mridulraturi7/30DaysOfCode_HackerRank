package dayTwentyThree;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day23 {

    static void levelOrder(Node root){
        //Write your code here'
        Queue<Node> q = new LinkedList<>();
        if(root != null)
        {
          q.add(root);
        }
  
        while(!q.isEmpty())
        {
            Node n = q.remove();
            System.out.print(n.data + " ");
  
            if(n.left != null)
            {
                q.add(n.left);
            }
  
            if(n.right != null)
            {
                q.add(n.right);
            }
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        sc.close();
        levelOrder(root);
    }	
    
}