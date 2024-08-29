package classes;

public class Stack {
    private int[] array;
    private int top;
    private int capacity;

    public Stack(int size){
        array = new int[size];
        capacity = size;
        top = -1;
    }

    // Add elements into stack
    public void push(int x){
        if (isFull()){   //checks if the stack is full by using isFull method.
            System.out.println("Overflow\nProgram Terminated.");
            System.exit(1);
        }

        System.out.println("Inserting " + x );
        array[++top] = x; //array[++top] increase the stack index, in the first case from -1 to 0 (the first space inside the stack
                         //and assign x to it.
    }

    // Removes element from stack
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty.");
            System.exit(1);
        }
        return array[top--]; // Decreases the stack's index but doesn't erase the previous top value, it just remains
                             // out of reach in the stack.
    }

    // Returns the stack's size.
    public int size(){
        return top + 1; // +1 is for real world counting, since 0 isn't a material value.
                        // for example if top is 4, and you add +1, it means that you have 5 elements in total.
    }

    public Boolean isEmpty(){
        return top == -1;  //isEmpty compares the stack's top, if its index equals -1 it means it is, in fact, empty.
    }

    public Boolean isFull(){
        return top == capacity - 1; //isFull compares the stack's top to its capacity, if it equals, it returns true.
    }

    public void printStack(){
        for (int i = 0; i < top + 1; i++){ //The original method didn't include the top + 1, but since the top wasn't
            System.out.println(array[i]);  //printed in the original state i added it.
        }
    }
}
