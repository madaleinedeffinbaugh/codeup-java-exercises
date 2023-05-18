public class ChangeMeExer1 {

    public static void main(String[] args) {
        //creating instance
        Person myPerson = new Person("NotMaddie");

        //testing methods
        System.out.println(myPerson.getName());
        myPerson.setName("Maddie");
        System.out.println(myPerson.getName());
        myPerson.sayHello();
    }
}
