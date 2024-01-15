package stack;

public class DoublyStack {
    int[] s;
    int firstTop;
    int secondTop;

    public DoublyStack(int size) {
        s = new int[size];
        firstTop = -1;
        secondTop = s.length;
    }

    public boolean isEmptyTop() {
        return firstTop != -1;
    }

    public boolean isEmptyEnd() {
        return secondTop == s.length;
    }

    public boolean isNotFull() {
        return firstTop + 1 != secondTop;
    }

    public void topPush(int item) {
        if (isNotFull()) {
            s[++firstTop] = item;
        } else
            System.out.println("stack over flow");
    }

    public void endPush(int item) {
        if (isNotFull()) {
            s[--secondTop] = item;
        } else
            System.out.println("stack over flow");
    }

    public int topPop() {
        if (isEmptyTop()) {
            return s[firstTop--];
        } else
            System.out.println("stack under flow");
        return -1;
    }

    public int endPop() {
        if (isEmptyEnd()) {
            return s[secondTop++];
        } else
            System.out.println("stack under flow");
        return -1;
    }
}
