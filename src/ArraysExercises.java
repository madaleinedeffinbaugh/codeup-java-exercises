public class ArraysExercises {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person personOne = new Person("John");
        Person personTwo = new Person("Jane");
        Person personThree = new Person("Jack");

        Person[] people = {personOne, personTwo, personThree};

        for(Person person : people) {
            System.out.println(person.getName());
        }
    }
}
