public class Person {

    private String name;

    public Person(String name) { // this is the constructor
        this.name = name;
    }

    public String getName(){ // getter
        return name;
//TODO: return the person's name
    }

    public void setName(String name){ // setter
        this.name = name;
//TODO: change the name field to the passed value
    }

    public void sayHello(){
        System.out.printf("Hello %s %n",name);
//TODO: print a message to the console using the person's name
    }



    public static void main(String[] args) {

        Person paul = new Person("Paul");
        System.out.println(paul.getName());
        paul.setName("Paul Wagner");
        paul.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // returns true
//        System.out.println(person1 == person2); // returns false b/c the comparison operator is not correct

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // returns true b/c the value of p2 was set to p1

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }

}
