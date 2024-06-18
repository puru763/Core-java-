package Encapsulation;
public  class Encapsulation {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String arg[]) {
            Encapsulation encap = new Encapsulation();
            encap.setName("purvesh");
            encap.setAge(23);

            System.out.println(encap.getName());
            System.out.println(encap.getAge());
    }

}