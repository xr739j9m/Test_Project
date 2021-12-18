Implementing a stack :

```java
// Stack implementation in Java

class Stack {
  //stack attributes 
  private int arr[]; //array
  private int top; //counter  
  private int capacity; //size

```
Creating a stack :

```java
  // Creating a stack
  Stack(int size) {
    arr = new int[size];
    capacity = size;
    top = -1;
  }
```
Add elements into stack :
```java
  // Add elements into stack
  public void push(int x) {
    if (isFull()) {
      System.out.println("OverFlow\nProgram Terminated\n");
      System.exit(1);
    }

    System.out.println("Inserting " + x);
    arr[++top] = x;
  }
```
Remove element from stack :
```java
  // Remove element from stack
  public int pop() {
    if (isEmpty()) {
      System.out.println("STACK EMPTY");
      System.exit(1);
    }
    return arr[top--];
  }
```
Utitlity function to return the size of the stack :
```java

  // Utility function to return the size of the stack
  public int size() {
    return top + 1;
  }
```
Checks if the stack is empty :
```java
  // Check if the stack is empty
  public Boolean isEmpty() {
    return top == -1;
  }
```
Checks if thee stack is full :
```java
  // Check if the stack is full
  public Boolean isFull() {
    return top == capacity - 1;
  }

  public void printStack() {
    for (int i = 0; i <= top; i++) {
      System.out.println(arr[i]);
    }
  }
```
Main program: 

```java
  public static void main(String[] args) {
    Stack stack = new Stack(5);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    stack.pop();
    System.out.println("\nAfter popping out");

    stack.printStack();

  }
}

```