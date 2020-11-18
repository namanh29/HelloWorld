package Hello;

public class in {
    private String name;
    private int age;

    public in() {
    }

    public in(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void Print (){
        System.out.println(this.name + " " + this.age);
    }


}