public class HellWorld {
    public static void main(String[] args) {
        // EXERCISE 1
        System.out.print("Hello");
        System.out.print(" world!\n");

        // EXERCISE 2
        //Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
            int myFavoriteNumber = 7;
            System.out.println(myFavoriteNumber);

        // 1. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
            String myString = "Dis a string";
            System.out.println(myString);

        // 2. Change your code to assign a character value to myString. What do you notice?
            // myString = 'c';
            // -it created an error because value is a char and the variable wants a string

        // 3. Change your code to assign the value 3.14159 to myString. What happens?
            // myString = 3.14159;
            //-it created an error because the number is a double and the variable wants a string

        // 4. Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
            // long myNumber;
            // System.out.println(myNumber);
            // -it creates an error saying that it cant be used before assignment

        // 5. Change your code to assign the value 3.14 to myNumber. What do you notice?
            // myNumber = 3.14;
            //-double -> long type error

        // 6. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
            // myNumber = 123L;
            //-it works...im guessing L works for long the same way f works for floats?

        // 7. Change your code to assign the value 123 to myNumber.
            // myNumber = 123;
            // -says its redundant since 123 is already the value

        // 8. Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
            // because 3.14 is a float and long requires an int

        // 9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
            // float myNumber = 3.14;
            // -it errors, add f at the end or change it to a double

        // 10. Copy and paste the following code blocks one at a time and execute them
            // int x = 5;
            // System.out.println(x++);
            // System.out.println(x);

            // int x = 5;
            // System.out.println(++x);
            // System.out.println(x);

        // What is the difference between the above code blocks? Explain why the code outputs what it does.
            // -the top one prints the value and then increments it, the bottom one increments the value then prints it. this is because that is how ++ works with where it is placed

        // 11. Try to create a variable named class. What happens?
            //String class = "test";
            // -"not a statement" error

        // 12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
            // -I think it will error out because you are trying to type cast an object of string value to an integer
            // String theNumberThree = "three";
            // Object o = theNumberThree;
            // int three = (int) o;

        // Copy and paste the code above and then run it. Does the result match with your expectation?
            // -yup

        // How is the above example different from the code block below?
            // int three = (int) "three";
            // -its really not that different, it just takes out the redundancy of assigning it to a String and then to an Object - all to come to the same end result of a type error 🤷🏻‍️

        // What are the two different types of errors we are observing?
            // first error is failure to convert to class Integer and the other failure to convert to type int

        // 13. Rewrite the following expressions using the relevant shorthand assignment operators:
            // int x = 4;
            // x = x + 5;
            // mine:
            //x += 5;

            // int x = 3;
            // int y = 4;
            // y = y * x;
            //mine:
            // y *= x;


            // int x = 10;
            // int y = 2;
            // x = x / y;
            // y = y - x;
            //mine:
            // x /= y;
            // y -= x;


            // 14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
            int max = 2147483647;
            System.out.println(max);
            max++;
            max = max + 20;
            System.out.println(max);
            // if you assign it a value greater than its max it will give you an error
            // if you increment past, instead of throwing an error, it wraps around to the start since an int cant hold a value greater than its max







    }
}