Car List

Overview

Car List is a Kotlin-based console application that allows users to manage a collection of cars. Users can add cars, view the list, and remove duplicate entries. The program utilizes various Kotlin features such as conditionals, collections, loops, functions, nullability handling, constructors, and init blocks.

Features

Add a Car: Users can enter a car's name and year.

View All Cars: Displays all cars in the list.

Remove Duplicates: Ensures no duplicate entries.

Exit Program: Allows users to close the application.

Technologies Used

Kotlin

IntelliJ IDEA

How to Run

Clone the repository from GitHub:

git clone <your-repository-link>

Open the project in IntelliJ IDEA.

Run the main.kt file.

Follow the on-screen instructions to interact with the program.

Code Breakdown

Car Class

Stores car name and year.

init block prints a message when a new car is created.

Method getCarInfo() returns car details.

Functions

formatCarName(name: String?): Formats car names to ensure proper capitalization and handling of null values.

Program Logic

A MutableList<Car> stores cars.

when statements handle user input.

Uses a Set to remove duplicate cars.

for loops iterate over car lists.

Example Usage

Car List
1. Add a car
2. View all cars
3. Remove duplicates
4. Exit
Choose an option: 1
Enter car name: Toyota
Enter car year: 2020
Car added: Toyota (2020)

Contributions

Feel free to contribute by submitting pull requests or reporting issues!

License

This project is open-source and available under the MIT License.
