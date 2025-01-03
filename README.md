
# Important Links
- [Presentations slides](presentations) <br>
- [Summary](Summary.md)<br>
- [Lecture Recordings](https://www.youtube.com/playlist?list=PL-TlZ7vdboMYCPfx7xZP6Cg7Mz5jwRQf0)<br>
- [Plan](Days.md)<br>
- [Online Problem Solving Sessions](problem-solving-sessions/problem-solving-sessions.md)

# Overview
### Basics
- Introduction to Programming, and environment setup.
- Output
    - Program 1: Introduce Yourself.
    - Program 2: Print a menu.
- Variables and Data Types
    - Program 3: Storing data.
    - Program 4: Calculate area of a rectangle.
    - Program 5: Determine whether a number is even or odd.
    - Comments Exercise: Put credits and notes into your code.
    - Some tips.
    - Program 6: Divide two integers.
    - Discussion: Data types have different sizes.
    - Discussion: Everything is a number
- Input
    - Program 7: Greet the user by his name.
    - Program 8: Ideal weight calculator.
    - Program 9: Account Sign Up form.
- Decision Making
    - Program 10: Comparing numbers, playing with booleans.
    - Program 11: Checking whether password is correct.
    - Program 12: Grading system.
    - Program 13: Checking whether a person is within a certain age range
- Loops
    - Program 14: Print "Hello World" 100 times.
    - Program 15: Check password until it's correct (Might change).
    - Program 16: Print "Hello World" 100 times again.
    - Discussion: Scope and name masking.
- Arrays & Multi Dimensional Arrays
    - Program 17: Calculate average of heights of 10 students
    - Program 18:
- Functions/Methods
    - Program 19: Introduce Yourself. Again!
    - Program 20: Calculate Area of rectangle. Again!
    - Program 21: 
- Exceptions
- Object Oriented Programming
    - Classes & Objects
    - Encapsulation
    - Constructors
    - More on Classes and Objects
    - Tip: Don't use uninitialized objects (references actually)
    - Inheritance & Polymorphism
    - Interfaces & Abstract Classes
    - Anonymous Classes
    - Discussion: Value Types vs Reference Types (Needs serious revision)

- Project: Top Down Shooter Game?

# Outline
### Program 1: Introduce Yourself
- println()
- print()
- Programs get executed sequentially

### Program 2: Print a menu
- Escape Sequences (\n,\t,\r,\b)
- Escaping \ and "

### Program 3: Storing data
- int
- double
- boolean
- char
- String
- **Exercise:** Store your age,height,grade and name and print all of them.
- Variable naming rules.
- final

### Program 4: Calculate area of a rectangle
- Arithmetic operations +,-,*,/

### Program 5: Even or Odd?
- Modulus %

### Some tips
- Assignment operators: += , -= , *= , /= , %=
- Increment and decrement operators: ++ , --
- Modulus only works with integers.

### Exercise 1: Add notes, description and credits to your previous programs
- Single line comments
- Multi-line comments
- Uses of comments: explaination, documentation, credits, notes, etc.

### Program 6: Divide two integers
- Dividing two integers yeilds an integer.
- casting.

### Discussion: Different datatypes have differnet sizes
- int vs long vs short vs byte
- float vs double

### Discussion: Everything is a number
- Binary is a number system.
- How to represent charachters as numbers.
- ASCII and Unicode. (Don't go into detail.)
- How to represent booleans as numbers.
- Extra: How to represent colors as numbers.

### Program 7: Greet the user with his name
- Importing and instantiating a Scanner (without explanation for the moment).
- next()

### Program 8: Ideal weight calculator (Assuming ideal weight = height - 100)
- nextInt()

### Program 9: Account Sign Up Form
- nextChar()
- nextDouble()
- Exercise: Make a program that asks someone about all his details (name, middle name, family name, precise height, age, etc.), then print it them.
- Note: You should close the scanner after you are done with it (but don't mention that in order to not overwhelm anybody)

> Note: Try to use hard-coded variables or values in following exercises instead of or before trying to get user input.

### Program 10: Comparing numbers, playing with booleans
- boolean stores either true or false.
- Storing result of conditional expressions in boolean variables.
- Comparison Operators == , !=  , < , > , >= , <=
- Note: Don't check for equality between two floating point numbers. (Research the matter further)
- if

### Program 11: Checking whether password is correct
- if else
- Additional Exercises: Checking whether a number is even or odd, positive or negative.

### Program 12: Grading system
- if else if else
- Exercise: Give a grade to students like (A,B,C,F) based on their marks.

### Program 13: Checking whether a person is within a certain age range
- Logical operators && || ! (Try forming logical expressions and storing them in booleans)
- Use logical operators in if

### Program 14: Print "Hello World" 100 times
- while
- while(\<any condition\>)
- Try changing the condition within the loop.
- Print "Hello World" 100 times.
- Verify that you did it 100 times. (hint: print i)
- Infinite loops. while(true)
### Program 15: Check password until it's correct (Might change)
- Try it using while first.
- do .. while

The code (in three different ways):
    - [code 1](code/program15.1/Main.java)
    - [code 2](code/program15.2/Main.java)
    - [code 3](code/program15.3/Main.java)

### Program 16: Print "Hello World" 100 times again.
- for
- Probably more details as well.
> Note: Put nested for-loops either here or with 2d arrays with a separate and good example.

### Discussion: Scope and name masking.

### Program 17: Calculate average of heights of 10 students
- Declare an array of integers.
- Accessing array elements.
- Note: Arrays are zero-indexed.
- Fill the array (without loops)
- Print the array (without loops)
- Fill the array using a loop.
- Print the array using a loop.
- Calculate the average of that array and print it.

### Program 18: Something for 2D arrays
- An array of arrays (2D arrays)
- declaration
- indexing
- filling the array
- printing the array
- Higher dimensional arrays overview

### Program 19: Introduce Yourself. Again!
- A function is a routine (static void)
- "Function" and "method" are synonymous (in java)
- Exercise: Make function `introduceYourSelf()` and call it in multiple places. 
- A function can take arguments.
- Exercise: Modify the `introduceYourSelf()` function to to take name, age, etc. as arguments.
- Scope Revisited.

### Program 20: Calculate Area of rectangle. Again!
- A function can return something.
- Exercise: make `areaOfRectangle()` function.

### Program 21: Maybe Some Helper Functions?
- Overloading functions.


### Program 22: Exceptions (Probably, no program is needed here.)
- An exception is basically an error.
- Trigger some exceptions. (DivisionByZero, ArrayOutOfBounds)
- catch the exception
- Handle the exception
- finally? (Research it then decide whether you need it here or at the end in tips and tricks)
- Throw an exception

### Classes & Objects
- An object is anything you want to imagine. An object has information and behaviour.
- A class is a type. define a class (Human for example), and put in his data and behaviour.
- Data is represented by variables, actions are represented by functions/methods.
- Instiate an object, and use it.
- Exercises: Define multiple other classes and use them (Example: Car, Animal, and another thing they should think about.)
### Encapsulation
- public vs private.
- getters and setters.
- this
### Constructors
- A contstructor is a function that runs when an object is made.
- Constructors can take arguments.
- Constructors can be overloaded
### More on Classes and Objects
- final revisited
- static explained
### Don't use uninitialized objects (references actually)
- NullPointerException Quick Look (Don't go into any detail, just the basic case)
- creating an array of objects
### Inheritance & Polymorphism
- Overriding methods
- super
- Show that overriden method works regardless of the reference.
- calling super constructor
- All classes inherit from Object
- Polymorphism (Parent reference can point to child) (Or child can act like a parent)
- Making a function that accepts parent.
### Interfaces & Abstract Classes
- Creating an interface
- Implementing an interface
- Making a function that accepts an interface implementor
- Abstract classes
### Anonymous Classes
- anonymous class
- anonymous interface implementation (Probably also called anonymous class)
### Discussion: Value Types vs Reference Types (Needs serious revision)
- All primitive types are stored by value and all objects are stored by reference.
- Demonstrate the difference between the two by modifying each from a function.
- Arrays are stored by reference.
- You can always reassign arrays.
- Exercise: Make a function that increases the capacity of an array.
- References themselves are passed by value (Needs reconsideration)

### Project: Top Down Shooter Game.

# More Topics
- More on access modifiers
    - More access modifiers (protected and package)
    - You can make private and protected constructors
- More on exceptions
    - Conditions for an object to be thrown
    - Handling multiple exceptions.
    - You should handle child exception before parent exception
    - printing stacktrace
    - NullPointerException
    - Uninitialized String can cause a NullPointerException
    - StackOverFlow
- Tips and Tricks
    - inner classes
    - switch
    - Important Note: You should the scanner once you're done with it. (Try to research the reason in detail.)
    - How to check for equality between floating point numbers.
    - Ternary operator
    - Bitwise operators
    - Postfix and prefix
    - var
    - casting
    - static initializers
    - range-based for loop
    - Enums
    - Recursion
    - Runnable & Lambdas
    - Multi-line strings
- Simple Design Tips and Tricks (To be embedded in the project)
    - Avoid big methods, break big methods into shorter methods.
    - Singletons are a thing, because everything in java has to be in a class.
- Must know APIs
    - File I/O
        - `FileInputStream` , `FileOutputStream` or a better way.
        - Using `FileOutputStream` with `PrintWriter`.
        - Using `FileInputStream` with `Scanner`.
    - Text Parsing
        - Parsing `String` with `Scanner`
    - `Math`
    - `StringBuilder`
    - Collections
- Good To Know APIs
    - DateTime
    - FileSytem
    - Preferences
    - Networking
- Deeper Topics
    - `Object`
    - Generics
    - Program: Writing our own ArrayList
    - Reflection
- Side Topics
    - Overview of other programming languages.
    - Using terminal.
    - Compiling code from command line.
    - Build systems
    - Git.

- Discussion Topics
    - Compilers in general.
    - Obstables for writing once run everywhere (in general sense, not in java sense.)
    - Comparison between Python, Java and C++ compilation models.
    - Memory Management and the point of garbage collection.
    - Binary & 2's complement. 

