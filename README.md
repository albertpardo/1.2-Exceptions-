## 📄 Description - Exercise Statement

This is the first task for **Sprint 1. Java Language** in the **Backen Java Course** in ITAcademy (Barcelona, Spain).
There are 3 levels with exercises.

### Level 1

#### Exercise 1

Create a class named "Product" with the attributes name and price, and another class named "Sale." This class has attributes like a collection of products and the total price of the sale.

The "Sale" class has a method called `calculateTotal()` that throws a custom exception "EmptySaleException" and displays the message “To make a sale, you must first add products” if the collection of products is empty. If the collection has products, it should iterate through the collection and store the sum of the prices of all products in the total price attribute of the sale.

The custom exception "EmptySaleException" must be a subclass of the Exception class. In its constructor, we should pass the message “To make a sale, you must first add products” and when we catch the exception, we should display it using the `getMessage()` method of the exception.

Write the necessary code to generate and capture an exception of type "IndexOutOfBoundsException."

* * *

### Level 2

####  Exercise 1

Create a class named "Input." This class should be used to control the different exceptions that may arise in Java when entering data from the keyboard using the Scanner class.

The first step is to instantiate an object of the Scanner class and from there, create static methods to read different types of data from the keyboard.

**Important**

It is crucial that if any method throws an exception, we handle it and re-prompt the user until the data is entered correctly. For example: If a float is entered with a dot instead of a comma, it should display “Format error.” The prompt should continue until the user enters a properly formatted float.

All methods receive a String with the message to be displayed to the user, for example: “Enter your age”, and return the appropriate data entered by the user in each method, for example: a byte with the user’s age.

Methods to implement capturing the exception of the class "InputMismatchException":

-   public static byte readByte(String message);
-   public static int readInt(String message);
-   public static float readFloat(String message);
-   public static double readDouble(String message);

Methods to implement capturing a custom exception of the class Exception:

-   public static char readChar(String message);
-   public static String readString(String message);
-   public static boolean readYesNo(String message), if the user enters “y”, return “true”; if the user enters “n”, return “false”.

* * *

### Level 3

#### - Exercise 1

A famous cinema company has asked us to develop an application for seat reservations in their cinemas. The application will be used by sellers to sell tickets.

##### Functionality

Once the application is started, it will ask the user how many rows and how many seats per row the cinema hall has. After entering this data, the following menu will be displayed:

1. Show all reserved seats.
2. Show the seats reserved by a person. 
3. Reserve a seat. 
4. Cancel the reservation of a seat.
5. Cancel all reservations of a person. 
0. Exit.

The application will have the following classes:

**Main Class**

It will have the main method of the application where an object of the class "Cinema" will be instantiated and will call its method "start."

**Seat Class**

It will have the data for a seat:

Attributes:

-   Row number.
-   Seat number.
-   Person reserving the seat.

Methods:

-   Constructor with all parameters.
-   Getters for all attributes.
-   Equals: will return true if two seats are equal if the row and seat are the same.
-   toString: will return a String in the following format: “Row: 5, Seat: 20, Person: Maria Febrer”

**Cinema Class**

It will contain the attributes and the initialization method.

Attributes:

-   Number of rows in the cinema.
-   Number of seats per row.
-   An object of the class "SeatManagement."
-   An object of the class "CinemaManagement."

Methods:

-   Constructor: will not receive parameters. It will initialize the object of the class "SeatManagement" and "CinemaManagement." It will call the method "requestInitialData" which will initialize the number of rows and seats.
-   start: will begin the application. It will call the "menu" method and based on the returned number, it will call the corresponding method of the class "CinemaManagement."
-   "requestInitialData": Will ask the user for the number of rows and seats and store them in the respective attributes.

**Class CinemaManagement:**

It will contain the logic for managing cinema operations.

Attributes:

-   An object of the class "Cinema."

Methods:

-   "Constructor": Will receive as a parameter an object of the class "Cinema" and assign it to the corresponding attribute.
-   "menu": Will display the main menu options to the user, ask for the chosen

## 📋 Requirements

Developed with:
- *IDE* : IntelliJ IDEA 2025.2.4 (Community Edition)
- *Java version* : openjdk 21.0.8 2025-07-15

## 🛠️ Installation

Fork or download this repo.

## ▶️ Execution

Run with *IntelliJ IDEA 2025.2.4* or import to your favorite IDE.

This code has been only tested under *Java version* : openjdk 21.0.8 2025-07-15
