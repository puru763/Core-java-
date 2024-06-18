class parent {
    public void print() {
        System.out.println("This is parent class");
    }
}

class child  extends parent {
    public void print() {
        System.out.println("This is child class");
    }
}

public class DynamicBinding{
    public static void main(String args[]) {
        parent obj1 = new parent();
        parent obj2 = new child();
        obj1.print();
        obj2.print();
    }
}

