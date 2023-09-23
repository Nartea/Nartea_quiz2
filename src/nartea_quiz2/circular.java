/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nartea_quiz2;

import java.util.Scanner;

/**
 *
 * @author Acer
 */

public class circular {
     Node head;

    public circular() {
        this.head = null;
    }

    
    public void insertAnyposition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position.");
            return;
        }

        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            return;
        }

        if (position == 0) {
            newNode.next = head;
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            head = newNode;
            return;
        }

        Node current = head;
        int currentPosition = 0;
        while (currentPosition < position - 1 && current.next != head) {
            current = current.next;
            currentPosition++;
        }

        newNode.next = current.next;
        current.next = newNode;
    }
    public void display() {
        if (head == null) {
            System.out.println("empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + "  ");
            current = current.next;
        } while (current != head);
        System.out.println(); 
    
    }
    
    public static void main(String[] args) {
       circular list = new circular();
        Scanner s=new Scanner(System.in);
        boolean menu=true;
      while(menu){
          System.out.println("menu: ");
            System.out.println("1. insertion ");
            System.out.println("2. display ");
            System.out.println("3. exit ");
            int choiceInput = s.nextInt();
            switch(choiceInput){
                case 1:
        System.out.println("Enter Index: ");
                  int index=s.nextInt();
                  
                  System.out.println("Enter position");
                  int position=s.nextInt();
                  
                   list.insertAnyposition(index, position);
                   break;

        
      
                case 2: 
        System.out.println("Elements of the circular linked list:");
        list.display();
        break;
                case 3: 
                    menu=false;
                    break;
                    
            }
      }
    }

}

