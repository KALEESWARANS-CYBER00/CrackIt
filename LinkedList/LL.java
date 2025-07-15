package LinkedList;

class LLN {
    int val;
    LLN next;

    LLN(int val) {
        this.val = val;
        this.next = null;
    }
}

class DLLNode {
    int val;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        this.val = val;
    }
}

public class LL {
    LLN headS;
    DLLNode headD;

    void insertAtEndSLL(int value) {
        LLN newNode = new LLN(value);
        if (headS == null) {
            headS = newNode;
            return;
        }
        LLN temp = headS;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insertAtEndDLL(int value) {
        DLLNode newNode = new DLLNode(value);
        if (headD == null) {
            headD = newNode;
            return;
        }
        DLLNode temp = headD;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void ForTraSll(LLN head) {
        System.out.println("Forward Traversal of Singly Linked List:");
        System.out.println("Why we can use this approach:");
        System.out.println("- Because each node has a reference to the next node via 'next' pointer.");
        System.out.println("- So we can move from head to tail using a loop like: temp = temp.next.");
        System.out.println("- This is efficient and works in O(n) time with O(1) space.");
        System.out.println("🔹 Node values in forward order:");
        LLN temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void BacTraSll() {
        System.out.println("Backward Traversal in SLL (Why not possible directly):");
        System.out.println("- Singly Linked List does NOT have a 'prev' pointer.");
        System.out.println("- From any node, we can only go FORWARD (temp.next), not backward.");
        System.out.println("- Once we pass a node, we lose access to it unless we save it.");
        System.out.println("Workarounds: Use Recursion, Stack, or Reverse the List Temporarily.");
    }

    void ForTraDll(DLLNode head) {
        System.out.println("Forward Traversal of Doubly Linked List:");
        System.out.println("Logic: Start from head, move via next pointer until null.");
        System.out.println("Why it works: Each node has a 'next' pointer like in SLL.");
        System.out.println("🔹 Node values in forward order:");
        DLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void BacTraDll(DLLNode head) {
        System.out.println("Backward Traversal of Doubly Linked List:");
        System.out.println("Logic: Move to tail using next → then move back using prev.");
        System.out.println("Why it works: DLL nodes have a 'prev' pointer that links to previous node.");
        System.out.print("🔁 Node values in reverse order: ");
        DLLNode temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void createSampleList() {
        insertAtEndSLL(10);
        insertAtEndSLL(20);
        insertAtEndSLL(30);

        insertAtEndDLL(100);
        insertAtEndDLL(200);
        insertAtEndDLL(300);
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.createSampleList();
        list.ForTraSll(list.headS);
        list.BacTraSll();
        list.ForTraDll(list.headD);
        list.BacTraDll(list.headD);
    }
}
