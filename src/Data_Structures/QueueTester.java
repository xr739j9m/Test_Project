package Data_Structures;

class Queue {

    int front, rear, size;

    int capacity;

    int array[];

    public Queue(int cap)

    {

        capacity = cap;

        front = size = 0;

        rear = capacity - 1;

        array = new int[capacity];

    }

    // Method to add an item to the queue.

    void enqueue(int item)

    {

        if (isFull()) {

            System.out.println("Queue overflow");

            return;

        }

        rear = (rear + 1) % capacity;

        array[rear] = item;

        size = size + 1;

    }

    // Queue is empty when size is 0

    boolean isEmpty()

    {

        return (size == 0);

    }

    // Queue is full when size becomes equal to the capacity

    boolean isFull()

    {

        return (size == capacity);

    }

    // Method to remove an item from queue.

    int dequeue()

    {

        if (isEmpty()) {

            System.out.println("Queue Underflow");

            return capacity - 1;

        }

        int item = array[front];

        front = (front + 1) % this.capacity;

        size = size - 1;

        return item;

    }

    // Method to get front of queue

    int front()

    {

        return array[front];

    }

    // Method to get rear of queue

    int rear()

    {

        return array[rear];

    }

}

public class QueueTester {
    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.enqueue(5);

        System.out.println("front:" + q.front());

        q.enqueue(3);

        System.out.println("rear:" + q.rear());

        q.enqueue(7);

        System.out.println("front:" + q.front());

        q.enqueue(9);

        System.out.println("rear:" + q.rear());

        q.enqueue(11);

        System.out.println("front:" + q.front());

        System.out.println("rear:" + q.rear());

        q.enqueue(15);

        q.dequeue();

        q.dequeue();

        System.out.println("front:" + q.front());

        System.out.println("rear:" + q.rear());

        q.dequeue();

        q.dequeue();

        q.dequeue();

        q.dequeue();
        System.out.println("front:" + q.front());

        System.out.println("rear:" + q.rear());

    }
}
