# 🥞 Stack Implementation (LIFO)

A robust implementation of the **Stack** data structure using a **Singly Linked List** approach in Java. It follows the **LIFO (Last In, First Out)** principle.

## 🚀 Features
* **Dynamic Size:** Unlike array-based stacks, this implementation has no fixed capacity limit. It grows as needed.
* **O(1) Operations:** All core operations (push, pop, peek) are extremely fast and constant time.
* **Clean API:** Simple interface to manage data flow.

## 🛠️ Data Structure Analysis

### What is a Stack?
Think of a stack of plates. You can only add a new plate to the top (`push`) and remove the top plate (`pop`). You cannot pull a plate from the middle without removing the ones above it first.

### Time Complexity (Big O)

| Operation | Complexity | Explanation |
| :--- | :--- | :--- |
| **Push (Insert)** | **$O(1)$** | Adds a node to the `top` (head) instantly. No looping required. |
| **Pop (Remove)** | **$O(1)$** | Removes the `top` node instantly. |
| **Peek (Read)** | **$O(1)$** | Returns the value of the `top` node without removing it. |
| **Search** | $O(n)$ | In the worst case, you have to pop everything to find an item at the bottom. |

## 💡 When to Use (and When Not to)

### ✅ Use Cases (Pros)
* **Function Call Management:** Compilers use stacks to track function calls (Recursion).
* **Undo Mechanisms:** "Ctrl+Z" operations in text editors (the last action is the first to be undone).
* **Syntax Parsing:** Checking for balanced parentheses `(( ))` in code editors.
* **Backtracking Algorithms:** Solving mazes or puzzles where you need to retrace your steps.

### ❌ Limitations (Cons)
* **No Random Access:** You cannot access the 3rd element directly (`stack[2]` is impossible). You must pop the top 2 elements first.
* **Memory Usage:** Since this implementation uses a Linked List, every data point needs extra memory for a reference (`next` pointer), unlike a simple array.

## 💻 Usage Example
```java
MyStack stack = new MyStack();
stack.push(10);
stack.push(20);
System.out.println(stack.pop()); // Output: 20 (Last In, First Out)