# QAP2 - Java Semester 3

This project includes solutions to three object-oriented programming problems as part of the **QAP2 assignment** for **Semester 3 - Java**. Each problem focuses on class design, object composition, and method overloading using Java. The project also includes test drivers, documentation, and proof of output for each problem.

## Project Structure

- **Common/**: Contains the `MyPoint` class, which is used in both Problem 1 and Problem 2.
- **Problem1/**: Contains the implementation of the `MyLine` class, which uses two `MyPoint` objects, along with test drivers.
- **Problem2/**: Contains the implementation of the `MyRectangle` class, which uses two `MyPoint` objects, along with test drivers.
- **Problem3/**: Contains the implementation of a `CreditCard` system using object aggregation, including the `Money` and `Person` classes, with test drivers.
- **images/**: Contains output proofs for each problem and a UML diagram for the `MyRectangle` class.
- **QAP 2 - Completion Info.docx**: Documentation providing the details of the assignment.


## Problems Overview

### Problem 1: The MyLine and MyPoint Classes
In this problem, the `MyLine` class models a line segment with a begin point at `(x1, y1)` and an end point at `(x2, y2)`. This class uses two `MyPoint` objects to represent these points.

- **Deliverables**:
  1. `MyPoint.java`: A class that models a point with `x` and `y` coordinates.
  2. `MyLine.java`: A class that models a line using two `MyPoint` instances.
  3. `TestMyLine.java`: A test driver to verify the functionality of the `MyLine` class.

- **Key Concepts**:
  - Class composition using `MyPoint`.
  - Testing public methods to ensure class correctness.

### Problem 2: The MyRectangle and MyPoint Classes
In this problem, the `MyRectangle` class models a rectangle using two `MyPoint` instances as its top-left and bottom-right corners.

- **Deliverables**:
  1. `MyRectangle.java`: A class that models a rectangle using two `MyPoint` objects.
  2. `TestMyRectangle.java`: A test driver to verify the functionality of the `MyRectangle` class.

- **Key Concepts**:
  - Object composition with `MyPoint`.
  - Writing test drivers to validate functionality.

### Problem 3: The CreditCard System Using Aggregation
This problem involves object aggregation, where the `CreditCard` class is composed of other classes, including `Person` and `Money`, to model a real-world credit card system. 

- **Task 1**: Overloading by Writing a Copy Constructor
  - You will create a copy constructor in the `Money` class to duplicate `Money` objects by copying the values of instance variables.

- **Task 2**: Passing and Returning Objects
  - The `CreditCard` class is designed with data fields including `owner` (a `Person` object), `balance` (a `Money` object), and `creditLimit` (also a `Money` object). These objects are passed or returned using the copy constructor to avoid security risks.

- **Deliverables**:
  1. `Money.java`: A class that models an amount of money with methods for equality checking and comparison.
  2. `Person.java`: A class that models a person with name and address details.
  3. `CreditCard.java`: A class that models a credit card, incorporating `Person` and `Money` objects.
  4. Test drivers to verify the functionality of the `Money`, `Person`, and `CreditCard` classes.

- **Key Concepts**:
  - Aggregation of objects (`Person`, `Money`) in a more complex class (`CreditCard`).
  - Copy constructors for safe handling of objects.
  - Object-oriented design principles.

## How to Run the Code

1. Clone the repository:
```
    git clone https://github.com/SearchingSteve/QAP2-Java-Sem3.git
```
2. Navigate to the respective problem directory and compile the code. For example:
```
    cd Problem1
    javac MyPoint.java MyLine.java TestMyLine.java
    java TestMyLine
   ```

4. Similarly, navigate to the `Problem2` or `Problem3` directories to compile and run their respective test drivers:
```
    cd Problem2
    javac MyPoint.java MyRectangle.java TestMyRectangle.java
    java TestMyRectangle

    cd Problem3
    javac Person.java Money.java CreditCard.java TestCreditCard.java
    java TestCreditCard
```

