public class HellWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        // 1. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Dis a string";
        System.out.println(myString);

        // 2. Change your code to assign a character value to myString. What do you notice?
            //-it created an error

        // 3. Change your code to assign the value 3.14159 to myString. What happens?
            //-it created an error

        // 4. Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        float myNumber = 3.14f;
        System.out.println(myNumber);
        //-it creates an error saying that it cant be used before assignment

        // 5. Change your code to assign the value 3.14 to myNumber. What do you notice?
            //-type error

        // 6. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
            //-it works...

        // 7. Change your code to assign the value 123 to myNumber.

        // 8. Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
            //because 3.14 is a float and long requires an int

        // 9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
            // -it errors, add f at the end or change it to a double

        // 10. Copy and paste the following code blocks one at a time and execute them
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        // What is the difference between the above code blocks? Explain why the code outputs what it does.
            //the top one prints the value and then increments it, the bottom one increments the value then prints it. this is because that is how ++ works with where it is placed

        // 11. Try to create a variable named class. What happens?
//        String class = "test";
        //-not a statement error

        // 12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        // Copy and paste the code above and then run it. Does the result match with your expectation?

        // How is the above example different from the code block below?
//        int three = (int) "three";





    }
}