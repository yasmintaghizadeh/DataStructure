package stack;

public class Stack {
    int [] s;
    int top;

    public Stack (int size){
        s = new int[size];
        top=-1;
    }
    public boolean empty(){
        return top==-1;
    }
    public boolean full(){
        return top==s.length-1;
    }
    public void push(int i){
       if(!full()){
           s[++top]=i;
       }else {
           System.out.println("stack over flow");
       }
    }
    public int pop(){
        if (!empty()){
            return s[top--];
        }else
            System.out.println("stack under flow");
        return -1;
    }
}
