public class ChangeMeExer1 {

    public static void main(String[] args) {
        //creating instance
        Person myPerson = new Person("NotMaddie");

        //testing methods
        System.out.println(myPerson.getName());
        myPerson.setName("Maddie");
        System.out.println(myPerson.getName());
        myPerson.sayHello();

        //running test code
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }
}
