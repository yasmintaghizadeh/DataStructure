package stack;

public class Main {
    public static void main(String[] args) {
//        int[] a=new int[5];
//        a[0]=1;
//        a[1]=3;
//        a[2]=5;
//        a[3]=10;
//        a[4]=20;
//        System.out.println(BinarySearch.binarySearch(a, 20));

//        Stack stack=new Stack(5);
//        stack.push(4);
//        stack.push(2);
//        stack.push(8);
//        stack.push(10);
//        stack.push(6);
//        stack.push(6);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        DoublyStack stack=new DoublyStack(10);
        stack.topPush(4);
        stack.topPush(3);
        stack.topPush(2);
        stack.topPush(1);
        stack.endPush(5);
        stack.endPush(6);
        stack.endPush(7);
        stack.endPush(8);

        System.out.println(stack.endPop());
        System.out.println(stack.endPop());
        System.out.println(stack.endPop());
        System.out.println(stack.endPop());

        System.out.println(stack.topPop());
        System.out.println(stack.topPop());
        System.out.println(stack.topPop());
        System.out.println(stack.topPop());




    }
}