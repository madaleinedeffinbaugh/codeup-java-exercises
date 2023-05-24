import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person personOne = new Person("John");
        Person personTwo = new Person("Jane");
        Person personThree = new Person("Jack");

        Person[] people = {personOne, personTwo, personThree};

        System.out.println("first array");
        for(Person person : people) {
            System.out.println(person.getName());
        }

        Person personFour = new Person("noname");

        Person[] people2 = addPerson(people, personFour);
        System.out.println("\nsecond array");
        for(Person person : people2) {
            System.out.println(person.getName());
        }

    }

    private static Person[] addPerson(Person[] personArr, Person person) {
        Person[] newArr = Arrays.copyOf(personArr,personArr.length+1);
        newArr[newArr.length -1] = person;
        return newArr;
    }
}
