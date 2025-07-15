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
        System.out.println("=======================================");
        System.out.println("🔹 Forward Traversal: Singly Linked List");
        System.out.println("---------------------------------------");
        System.out.println(" Why this works:");
        System.out.println(" - Each node has a 'next' pointer.");
        System.out.println(" - We can move node by node: temp = temp.next.");
        System.out.println(" - Time: O(n), Space: O(1)");
        System.out.print(" Values: ");
        LLN temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("\n=======================================\n");
    }

    void BacTraSll() {
        System.out.println("=======================================");
        System.out.println(" Backward Traversal: Singly Linked List");
        System.out.println("---------------------------------------");
        System.out.println(" Not possible directly.");
        System.out.println(" Reason:");
        System.out.println(" - No 'prev' pointer.");
        System.out.println(" - Forward-only via 'next'.");
        System.out.println(" Workarounds:");
        System.out.println(" - Use Recursion");
        System.out.println(" - Use Stack");
        System.out.println(" - Reverse temporarily");
        System.out.println("=======================================\n");
    }

    void ForTraDll(DLLNode head) {
        System.out.println("=======================================");
        System.out.println("🔹 Forward Traversal: Doubly Linked List");
        System.out.println("---------------------------------------");
        System.out.println(" Logic: Move from head to tail using 'next'");
        System.out.print(" Values: ");
        DLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("\n=======================================\n");
    }

    void BacTraDll(DLLNode head) {
        System.out.println("=======================================");
        System.out.println(" Backward Traversal: Doubly Linked List");
        System.out.println("---------------------------------------");
        System.out.println(" Logic:");
        System.out.println(" - Move to tail using 'next'");
        System.out.println(" - Traverse back using 'prev'");
        System.out.print(" Values (reversed): ");
        DLLNode temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println("\n=======================================\n");
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
