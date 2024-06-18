package Inheritace;

class ParentInheritance {
    void Parent() {
        System.out.println("Parent Class");
    }

}

class ChildInheritance extends ParentInheritance {

    void Child() {
        System.out.println("Child Class");
    }

}

class GrandsonInheritace extends ChildInheritance {

    void Grandson() {
        System.out.println("Grandson Class");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        GrandsonInheritace child = new GrandsonInheritace();
        child.Parent();
        child.Child();
        child.Grandson();

    }
}
