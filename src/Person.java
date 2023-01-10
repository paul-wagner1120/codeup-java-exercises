public class Person {

    public static void main(String[] args) {
        Person paul = new Person("Paul");
        paul.getName();
        paul.setName("Paul Wagner");
        paul.sayHello();

    }

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
//        System.out.println(name);
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello %s", name);
    }


}
