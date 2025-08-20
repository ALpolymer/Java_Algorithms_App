# JAVA ALGORITHMS APP
# Java Algorithms Application

## Overview

This is a comprehensive Java algorithms application developed as an educational exercise for Coding Factory 8 of AUEB (Athens University of Economics and Business). The application provides an interactive console-based interface that allows users to explore and test various fundamental algorithms and data structures concepts.

## Project Structure

The application is organized into the following components:

### Core Classes

- **`Main.java`** - Entry point and user interface controller
- **`Algorithms.java`** - Core algorithms implementations
- **`utils/Utils.java`** - General utility functions
- **`utils/IOUtils.java`** - Input/output utility functions

### Architecture

The project follows a modular design pattern with clear separation of concerns:
- **Presentation Layer**: `Main.java` handles user interaction and menu navigation
- **Business Logic**: `Algorithms.java` contains all algorithmic implementations
- **Utility Layer**: `Utils.java` and `IOUtils.java` provide reusable helper functions

## Features

The application offers 20 different algorithmic implementations organized through an interactive menu system:

### 1. Basic Operations
- **Add Integers**: Simple addition of two integers
- **Add Array Values**: Summation of all elements in an array

### 2. Array Algorithms
- **Compare Scores**: Compare Alice and Bob's scores across three rounds
- **Array Diagonals**: Calculate sum of main and secondary diagonals in a square matrix
- **Min-Max Sum**: Find sum of n-1 smallest and largest integers
- **Max Element Count**: Count occurrences of maximum element
- **Record Breaking**: Track when new maximum/minimum records are set
- **Target Sum**: Find pairs of integers that sum to a target value
- **Array Rotation**: Rotate array elements by a given offset

### 3. Mathematical Algorithms
- **Prime Check**: Determine if a number is prime
- **Fibonacci**: Calculate nth Fibonacci number using recursion
- **Staircase Pattern**: Draw a right-aligned staircase using '#' characters

### 4. String Processing
- **String Reversal**: Reverse a string character by character
- **Anagram Detection**: Check if two strings are anagrams
- **Duplicate Removal**: Remove duplicate characters from a string
- **Character Frequency**: Find character with maximum occurrences
- **Palindrome Check**: Verify if a string reads the same forwards and backwards
- **Whitespace Replacement**: Replace spaces with "%20"

### 5. Statistical Analysis
- **Integer Frequencies**: Calculate relative frequencies of positive, negative, and zero values

## Algorithm Implementations

### Key Algorithms Explained

#### Compare Scores Algorithm
```java
public static int[] compareScores(int[] arr1, int[] arr2);
```
Compares corresponding elements of two arrays and returns a count of wins for each participant.

#### Diagonal Sum Algorithm
```java
public static int[] arrayDiagonals(int[][] arr);
```
Calculates the sum of main diagonal (i==j) and secondary diagonal (i+j==size-1) elements in a square matrix.

#### Prime Number Check
```java
public static boolean isPrime(int n);
```
Efficiently checks primality by testing divisibility up to √n, implementing the fundamental prime checking algorithm.

#### Fibonacci Sequence
```java
public static int fib(int n);
```
Recursive implementation of Fibonacci sequence with visualization of function calls.

#### Anagram Detection
```java
public static boolean anagram(String str1, String str2);
```
Uses character sorting approach to determine if two strings are anagrams.

#### Target Sum Problem
```java
public static List<int[]> targetSum(int[] arr, int target);
```
Finds all pairs of array indices whose corresponding values sum to a target value (Two Sum problem variant).

#### Array Rotation
```java
public static int[] leftRotationOfArray(int[] arr, int offset);
```
Implements circular array rotation using modular arithmetic.

## Utility Functions

### IOUtils Class
Provides standardized input methods:
- `arrayInput()`: Reads array from user input with validation
- `squareMatrixInput()`: Reads square matrix with formatted display
- `integerInput()`: Reads single integer with prompt
- `stringInput()`: Reads string input

### Utils Class
Contains helper functions:
- `findMax()`: Recursive maximum element finder
- `findMaxIndex()`: Returns all indices containing maximum value
- `add()`: Basic integer addition
- `addArrayValues()`: Stream-based array summation

## Technical Features

- Input validation for array sizes and score ranges (0-100)
- Boundary checking for edge cases
- Handling of empty inputs and null values
- Uses StringBuilder for string operations
- Implements in-place algorithms where possible
- Efficient sorting and searching techniques
- Consistent naming conventions
- Clear method signatures with descriptive names
- Modular design with single responsibility principle
- Comprehensive commenting and documentation

## Educational Value

This application showcases core programming skills in:

1. **Data Structures**: Arrays, 2D arrays, Lists, HashMaps, StringBuilder
2. **Algorithms**: Sorting, searching, recursion, dynamic programming concepts
3. **Problem Solving**: Classic algorithmic problems (Two Sum, Prime checking, etc.)
4. **Java Programming**: OOP principles, utility classes, modular design
5. **User Interface Design**: Console-based menu systems and user interaction
6. **Input Validation**:  Error handling and data validation


## Sample Execution Flow

```
---->ALGORITHMS<----
Please select one of the following algorithms:
0. Exit application
1. Add Integers
...
20. Rotate the elements of an array given a fixed offset

[User selects option]
[Algorithm executes with user input]
[Results displayed]
[Return to main menu]
```

