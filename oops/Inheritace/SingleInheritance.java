package Inheritace;
class ParentInheritance {

    public void Parent() {
        System.out.println("Parent class ");

    }

}

class ChildInheritace extends ParentInheritance {
    public void Child() {
        System.out.println("child class");
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        ChildInheritace child = new ChildInheritace();
        child.Child();
        child.Parent();
    }

}
