import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person ("Paul");
        people[1] = new Person ("Kimber");
        people[2] = new Person ("Samara");

//        for (int i = 0; i < people.length; i++) { //standard for loop
//            System.out.println(people[i].getName());
//        }
        for (Person person : people) { // enhanced for loop
            System.out.println(person.getName());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~");
        Person zander = new Person("Zander");
        people = addPerson(people, zander);
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] array, Person newPerson){
        Person[] people = Arrays.copyOf(array, array.length + 1);
        people[array.length] = newPerson;
        return people;
    }

}


