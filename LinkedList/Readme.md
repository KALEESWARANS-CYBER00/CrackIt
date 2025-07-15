## Forward Traversal: Singly Linked List

**Why this works:**
- Each node has a `next` pointer  
- We can move node by node: `temp = temp.next`  
- Time: O(n)  
- Space: O(1)

**Values:**  
10 20 30

---

## Backward Traversal: Singly Linked List

**Not possible directly.**

**Reason:**
- No `prev` pointer  
- Forward-only via `next`  

**Workarounds:**
- Use Recursion  
- Use Stack  
- Reverse temporarily

---

## Forward Traversal: Doubly Linked List

**Logic:**  
Move from head to tail using `next`

**Values:**  
100 200 300

---

## Backward Traversal: Doubly Linked List

**Logic:**
- Move to tail using `next`  
- Traverse back using `prev`

**Values (reversed):**  
300 200 100
