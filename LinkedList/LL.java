class LLN {
    int val;
    LLN next;

    LLN(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LL {
    LLN head;

    void ForTraSll(LLN head) {
        System.out.println("✅ Forward Traversal of Singly Linked List:");
        System.out.println("Why we can use this approach:");
        System.out.println("- Because each node has a reference to the next node via 'next' pointer.");
        System.out.println("- So we can move from head to tail using a loop like: temp = temp.next.");
        System.out.println("- This is efficient and works in O(n) time with O(1) space.");
        System.out.println("\n🔹 Node values in forward order:");

        LLN temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    void BacTraSll() {
        System.out.println("\n\n❌ Backward Traversal in SLL (Why not possible directly):");
        System.out.println("- Singly Linked List does NOT have a 'prev' pointer.");
        System.out.println("- From any node, we can only go FORWARD (temp.next), not backward.");
        System.out.println("- Once we pass a node, we lose access to it unless we save it.");
        System.out.println("- That's why backward traversal is NOT directly possible in SLL.");
        System.out.println("🔁 Workarounds: Use Recursion, Stack, or Reverse the List Temporarily.");
    }

    // Create Sample List: 10 → 20 → 30 → null
    void createSampleList() {
        LLN first = new LLN(10);
        LLN second = new LLN(20);
        LLN third = new LLN(30);

        first.next = second;
        second.next = third;

        head = first;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.createSampleList();

        list.ForTraSll(list.head);   
        list.BacTraSll();            
    }
}
