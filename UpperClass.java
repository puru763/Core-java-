public class UpperClass {

    class InnerClass {
        public void display() {
            System.out.println("Inner class");
        }
    }

    public static void main(String[] args) {
        System.out.println("Upper class");

        // UpperClass upperClassInstance = new UpperClass();

        // UpperClass.InnerClass innerClassInstance = upperClassInstance.new
        // InnerClass();

        UpperClass.InnerClass innerClassInstance = new UpperClass().new InnerClass();

        innerClassInstance.display();
    }
}
