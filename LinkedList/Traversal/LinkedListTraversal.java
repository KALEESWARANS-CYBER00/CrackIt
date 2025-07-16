// package LinkedList.Traversal;

import java.util.Scanner;

class SinglyNode {
    int val;
    SinglyNode next;
    SinglyNode(int val) {
        this.val = val;
    }
}

class DoublyNode {
    int val;
    DoublyNode next, prev;
    DoublyNode(int val) {
        this.val = val;
    }
}

class CircularSinglyNode {
    int val;
    CircularSinglyNode next;
    CircularSinglyNode(int val) {
        this.val = val;
    }
}

class CircularDoublyNode {
    int val;
    CircularDoublyNode next, prev;
    CircularDoublyNode(int val) {
        this.val = val;
    }
}

public class LinkedListTraversal {
    SinglyNode headS;
    DoublyNode headD;
    CircularSinglyNode headCS;
    CircularDoublyNode headCD;

    public void insertSampleData() {
        System.out.println("Inserting sample data into all types of linked lists...");

        headS = new SinglyNode(1);
        headS.next = new SinglyNode(2);
        headS.next.next = new SinglyNode(3);

        headD = new DoublyNode(10);
        DoublyNode d2 = new DoublyNode(20);
        DoublyNode d3 = new DoublyNode(30);
        headD.next = d2; d2.prev = headD;
        d2.next = d3; d3.prev = d2;

        CircularSinglyNode cs1 = new CircularSinglyNode(100);
        CircularSinglyNode cs2 = new CircularSinglyNode(200);
        CircularSinglyNode cs3 = new CircularSinglyNode(300);
        cs1.next = cs2; cs2.next = cs3; cs3.next = cs1;
        headCS = cs1;

        CircularDoublyNode cd1 = new CircularDoublyNode(1000);
        CircularDoublyNode cd2 = new CircularDoublyNode(2000);
        CircularDoublyNode cd3 = new CircularDoublyNode(3000);
        cd1.next = cd2; cd2.prev = cd1;
        cd2.next = cd3; cd3.prev = cd2;
        cd3.next = cd1; cd1.prev = cd3;
        headCD = cd1;

        System.out.println("Sample data inserted successfully.\n");
    }

    public void traverseSinglyForward() {
        System.out.println("Traversing Singly Linked List (Forward):");
        SinglyNode temp = headS;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null\n");
    }

    public void traverseDoublyForward() {
        System.out.println("Traversing Doubly Linked List (Forward):");
        DoublyNode temp = headD;
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println("null\n");
    }

    public void traverseDoublyBackward() {
        System.out.println("Traversing Doubly Linked List (Backward):");
        DoublyNode temp = headD;
        if (temp == null) return;
        while (temp.next != null) temp = temp.next;
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null\n");
    }

    public void traverseCircularSingly() {
        System.out.println("Traversing Circular Singly Linked List:");
        if (headCS == null) return;
        CircularSinglyNode temp = headCS;
        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while (temp != headCS);
        System.out.println("(Back to head)\n");
    }

    public void traverseCircularDoublyForward() {
        System.out.println("Traversing Circular Doubly Linked List (Forward):");
        if (headCD == null) return;
        CircularDoublyNode temp = headCD;
        CircularDoublyNode start = temp;
        do {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        } while (temp != start);
        System.out.println("(Back to head)\n");
    }

    public void traverseCircularDoublyBackward() {
        System.out.println("Traversing Circular Doubly Linked List (Backward):");
        if (headCD == null) return;
        CircularDoublyNode temp = headCD.prev;
        CircularDoublyNode end = temp;
        do {
            System.out.print(temp.val + " <-> ");
            temp = temp.prev;
        } while (temp != end);
        System.out.println("(Back to tail)\n");
    }

    public static void main(String[] args) {
        LinkedListTraversal list = new LinkedListTraversal();
        Scanner sc = new Scanner(System.in);
        int op;

        System.out.println("===== LINKED LIST TRAVERSAL PROJECT =====\n");
        list.insertSampleData();

        while (true) {
            System.out.println("Choose traversal operation:");
            System.out.println("1. Singly Linked List (Forward)");
            System.out.println("2. Doubly Linked List (Forward)");
            System.out.println("3. Doubly Linked List (Backward)");
            System.out.println("4. Circular Singly Linked List");
            System.out.println("5. Circular Doubly Linked List (Forward)");
            System.out.println("6. Circular Doubly Linked List (Backward)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            op = sc.nextInt();

            switch (op) {
                case 1: list.traverseSinglyForward(); break;
                case 2: list.traverseDoublyForward(); break;
                case 3: list.traverseDoublyBackward(); break;
                case 4: list.traverseCircularSingly(); break;
                case 5: list.traverseCircularDoublyForward(); break;
                case 6: list.traverseCircularDoublyBackward(); break;
                case 0: 
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid Option. Please try again.\n");
            }
        }
    }
}
