/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nartea_quiz2;

import java.util.Scanner;

/**
 *
 * @author Acer
 */

class Node{
int data;
Node next;

     Node(int m) {
        
         data = m;
         next = null;
     }
}

public class single {
     public Node head;
    
    public Node insert(int data){
        
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    
        return head;
    }
    
    public void display(){
        Node node = head;
        
        while (node != null) {            
            System.out.println(node.data + ",");
            node = node.next;
        }
        System.out.println("");
    }
    public boolean search(int target){
        Node current = head;
        
            while (current != null) {            
                if (current.data == target) {
                    return true;
                }
                current = current.next;
        }
        
        return false;
    }
    
    public int searchPosition(int target){
    Node current = head;
    int pos = 0;
    
        while (current != null) {            
            if (current.data == target) {
                return pos;
                
            }
            current = current.next;
            pos++;
        }
        return -1;
    }
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     single list = new single();
    
      list.insert(10);  
    list.insert(20);
    list.insert(30);
    list.insert(40);
    list.display();
        
        System.out.println("search number: ");
    int targerVal = s.nextInt();
        
        int pos = list.searchPosition(targerVal);
        
        if (pos != -1) {
            System.out.println(targerVal + " Here in " + pos);
        } else {
            System.out.println(" The "+ targerVal + " is not here ");
        }
    }
    } 
    

