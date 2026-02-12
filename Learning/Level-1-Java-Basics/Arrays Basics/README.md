# #024 JAVA – Arrays Basics

---

## 1️⃣ TOPIC INTRODUCTION

### What is an Array?
An **array** is a container that holds **multiple values of the same type** in a single variable, stored in **sequential memory locations**.

### Why is it important?
- Store 100 student marks in ONE variable instead of 100 variables
- Process large amounts of data efficiently
- Foundation for all data structures (Lists, Stacks, Queues...)

### Real World Analogy:
```
Without Array:              With Array:
int mark1 = 85;             int[] marks = {85, 90, 78, 92, 88};
int mark2 = 90;
int mark3 = 78;             marks[0] = 85  ← index starts at 0!
int mark4 = 92;             marks[1] = 90
int mark5 = 88;             marks[2] = 78
                            marks[3] = 92
                            marks[4] = 88
```

---

## 2️⃣ ARRAY SYNTAX

### 3 Ways to Declare an Array:

```java
// Way 1: Declare then assign
int[] numbers;              // declare
numbers = new int[5];       // create with size 5 (all zeros)

// Way 2: Declare + create together
int[] numbers = new int[5]; // creates [0, 0, 0, 0, 0]

// Way 3: Declare + create + initialize (most common)
int[] numbers = {10, 20, 30, 40, 50};
```

### Other Data Type Arrays:
```java
double[] prices    = {9.99, 14.99, 4.99, 24.99};
String[] names     = {"Ali", "Sara", "Ahmed", "Mia"};
boolean[] answers  = {true, false, true, true, false};
char[] grades      = {'A', 'B', 'A', 'C', 'B'};
```

---

## 3️⃣ ACCESSING ARRAY ELEMENTS

```
Array:   {10,  20,  30,  40,  50}
Index:     0    1    2    3    4
           ↑                   ↑
        First              Last (length-1)
```

```java
public class ArrayAccess {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        // Access by index
        System.out.println(numbers[0]);  // 10 ← first element
        System.out.println(numbers[2]);  // 30 ← middle
        System.out.println(numbers[4]);  // 50 ← last element

        // Get array length
        System.out.println("Length: " + numbers.length); // 5

        // Modify an element
        numbers[1] = 99;
        System.out.println(numbers[1]);  // now 99

        // ⚠️ Common mistake — going out of bounds!
        // System.out.println(numbers[5]); // ERROR! index 5 doesn't exist
        // Last valid index = length - 1 = 4
    }
}
```

**Output:**
```
10
30
50
Length: 5
99
```

---

## 4️⃣ LOOPING THROUGH ARRAYS

### Method 1 — Regular for loop:
```java
public class ArrayForLoop {
    public static void main(String[] args) {

        int[] scores = {85, 92, 78, 96, 88};

        System.out.println("All scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("scores[%d] = %d%n", i, scores[i]);
        }
    }
}
```
**Output:**
```
All scores:
scores[0] = 85
scores[1] = 92
scores[2] = 78
scores[3] = 96
scores[4] = 88
```

---

### Method 2 — Enhanced for loop (for-each):
```java
public class ArrayForEach {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Banana", "Cherry", "Mango"};

        // For-each: cleaner when you don't need the index
        for (String fruit : fruits) {
            System.out.println("🍎 " + fruit);
        }
    }
}
```
**Output:**
```
🍎 Apple
🍎 Banana
🍎 Cherry
🍎 Mango
```

---

### Method 3 — While loop:
```java
public class ArrayWhileLoop {
    public static void main(String[] args) {

        int[] numbers = {3, 7, 1, 9, 4, 6, 2};
        int i = 0;

        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();
    }
}
```
**Output:**
```
3 7 1 9 4 6 2
```

---

## 5️⃣ COMMON ARRAY OPERATIONS

### Operation 1 — Sum & Average:
```java
public class ArraySumAvg {
    public static void main(String[] args) {

        int[] marks = {85, 92, 78, 96, 88, 74, 91};

        int sum = 0;

        for (int mark : marks) {
            sum += mark;    // sum = sum + mark
        }

        double average = (double) sum / marks.length;

        System.out.println("Marks  : ");
        for (int mark : marks) System.out.print(mark + " ");
        System.out.println();
        System.out.println("Sum    : " + sum);
        System.out.printf ("Average: %.2f%n", average);
    }
}
```
**Output:**
```
Marks  :
85 92 78 96 88 74 91
Sum    : 604
Average: 86.29
```

---

### Operation 2 — Find Max & Min:
```java
public class ArrayMaxMin {
    public static void main(String[] args) {

        int[] numbers = {34, 67, 12, 89, 45, 23, 78};

        int max = numbers[0];   // assume first is max
        int min = numbers[0];   // assume first is min

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];   // found a bigger one
            }
            if (numbers[i] < min) {
                min = numbers[i];   // found a smaller one
            }
        }

        System.out.println("Array  : ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();
        System.out.println("Maximum: " + max);  // 89
        System.out.println("Minimum: " + min);  // 12
    }
}
```
**Output:**
```
Array  :
34 67 12 89 45 23 78
Maximum: 89
Minimum: 12
```

---

### Operation 3 — Search (Linear Search):
```java
public class LinearSearch {
    public static void main(String[] args) {

        int[] numbers = {15, 42, 8, 73, 29, 56, 11};
        int target = 73;
        int foundAt = -1;   // -1 means not found

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundAt = i;
                break;  // stop searching once found
            }
        }

        if (foundAt != -1) {
            System.out.println(target + " found at index " + foundAt + " ✅");
        } else {
            System.out.println(target + " not found ❌");
        }
    }
}
```
**Output:**
```
73 found at index 3 ✅
```

---

### Operation 4 — Reverse an Array:
```java
public class ArrayReverse {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.print("Original : ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();

        // Reverse by swapping first ↔ last
        int left  = 0;
        int right = numbers.length - 1;

        while (left < right) {
            // swap
            int temp      = numbers[left];
            numbers[left]  = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }

        System.out.print("Reversed : ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();
    }
}
```
**Output:**
```
Original : 1 2 3 4 5
Reversed : 5 4 3 2 1
```

---

### Operation 5 — Sort (Bubble Sort):
```java
public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Before sort: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();

        // Bubble Sort — compare neighbors, swap if wrong order
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // swap numbers[j] and numbers[j+1]
                    int temp       = numbers[j];
                    numbers[j]     = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.print("After sort : ");
        for (int n2 : numbers) System.out.print(n2 + " ");
        System.out.println();
    }
}
```
**Output:**
```
Before sort: 64 34 25 12 22 11 90
After sort : 11 12 22 25 34 64 90
```

---

## 6️⃣ ARRAYS + SCANNER (User Input)

```java
import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many students? ");
        int size = sc.nextInt();

        // Create array dynamically based on user input
        String[] names  = new String[size];
        double[] grades = new double[size];

        // Fill array with user input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name   " + (i + 1) + ": ");
            sc.nextLine(); // clear buffer (if needed)
            names[i] = sc.nextLine();

            System.out.print("Enter grade  " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }

        // Display all students
        System.out.println("\n=== STUDENT LIST ===");
        for (int i = 0; i < size; i++) {
            System.out.printf("%-15s → %.1f%n", names[i], grades[i]);
        }

        sc.close();
    }
}
```

**Input:**
```
How many students? 3
Enter name   1: Ali
Enter grade  1: 88.5
Enter name   2: Sara
Enter grade  2: 92.0
Enter name   3: Ahmed
Enter grade  3: 76.5
```

**Output:**
```
=== STUDENT LIST ===
Ali             → 88.5
Sara            → 92.0
Ahmed           → 76.5
```

---

## 7️⃣ ARRAYS + METHODS (Combining Topics!)

```java
public class ArrayMethods {

    // Method: print array
    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println("]");
    }

    // Method: calculate sum
    public static int sum(int[] arr) {
        int total = 0;
        for (int n : arr) total += n;
        return total;
    }

    // Method: find maximum
    public static int max(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    // Method: find minimum
    public static int min(int[] arr) {
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }

    // Method: calculate average
    public static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    // Method: count even numbers
    public static int countEven(int[] arr) {
        int count = 0;
        for (int n : arr) if (n % 2 == 0) count++;
        return count;
    }

    public static void main(String[] args) {

        int[] data = {23, 45, 12, 67, 34, 89, 56, 8, 71, 42};

        System.out.print("Array   : ");
        printArray(data);

        System.out.println("Sum     : " + sum(data));
        System.out.printf ("Average : %.2f%n", average(data));
        System.out.println("Maximum : " + max(data));
        System.out.println("Minimum : " + min(data));
        System.out.println("Evens   : " + countEven(data));
    }
}
```

**Output:**
```
Array   : [ 23 45 12 67 34 89 56 8 71 42 ]
Sum     : 447
Average : 44.70
Maximum : 89
Minimum : 8
Evens   : 5
```

---

## 8️⃣ 2D ARRAYS (Bonus)

A **2D array** is an array of arrays — like a table or grid:

```java
public class TwoDArray {
    public static void main(String[] args) {

        // 3 rows × 4 columns
        int[][] matrix = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12}
        };

        // Access element: matrix[row][column]
        System.out.println(matrix[0][0]);  // 1  (row 0, col 0)
        System.out.println(matrix[1][2]);  // 7  (row 1, col 2)
        System.out.println(matrix[2][3]);  // 12 (row 2, col 3)

        // Print entire 2D array as a grid
        System.out.println("\nMatrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%4d", matrix[row][col]);
            }
            System.out.println();
        }
    }
}
```

**Output:**
```
1
7
12

Matrix:
   1   2   3   4
   5   6   7   8
   9  10  11  12
```

---

## 9️⃣ EXERCISES

---

### ✅ EASY Level

#### Exercise 1: Array Basics
**Task:** Create an array of 5 integers. Print each element with its index.

**Expected Output:**
```
Index 0 → 10
Index 1 → 20
Index 2 → 30
Index 3 → 40
Index 4 → 50
```

---

#### Exercise 2: Sum & Average
**Task:** Create an array `{12, 45, 67, 23, 89, 34, 56}`. Calculate and print:
- Sum of all elements
- Average of all elements

**Expected Output:**
```
Array   : 12 45 67 23 89 34 56
Sum     : 326
Average : 46.57
```

---

#### Exercise 3: Reverse Print
**Task:** Create an array of 5 names. Print them forwards then backwards.

**Expected Output:**
```
Forward : Ali Sara Ahmed Mia Omar
Backward: Omar Mia Ahmed Sara Ali
```

---

### 🔶 MEDIUM Level

#### Exercise 4: Mark Analyzer
**Task:** Ask the user to enter marks for 5 subjects. Find and display:
- All marks
- Highest mark
- Lowest mark
- Average mark
- Pass/Fail (average >= 60 to pass)

**Expected Output:**
```
Enter 5 marks:
Mark 1: 78
Mark 2: 85
Mark 3: 62
Mark 4: 90
Mark 5: 74

Marks   : 78 85 62 90 74
Highest : 90
Lowest  : 62
Average : 77.80
Status  : PASS ✅
```

---

#### Exercise 5: Count Occurrences
**Task:** Create an array of 10 integers (include duplicates). Ask user for a number. Count how many times it appears.

**Expected Output:**
```
Array  : 3 7 2 7 5 7 1 4 7 2
Search : 7
Found  : 4 times at indexes: 1 3 5 7
```

---

#### Exercise 6: Array Copy & Merge
**Task:** Create two arrays `{1, 2, 3}` and `{4, 5, 6}`. Create a third merged array `{1, 2, 3, 4, 5, 6}` and print it.

**Expected Output:**
```
Array 1  : 1 2 3
Array 2  : 4 5 6
Merged   : 1 2 3 4 5 6
```

---

### 🔴 HARD Level

#### Exercise 7: Student Grade System
**Task:** Build a complete system using arrays that:
- Stores names of 5 students (String array)
- Stores their marks (double array)
- Calculates grades for each (char array)
- Prints a full formatted report

**Expected Output:**
```
==============================
       CLASS REPORT
==============================
No  Name       Mark   Grade
------------------------------
1   Ali         92.0    A
2   Sara        85.5    B
3   Ahmed       73.0    C
4   Mia         96.5    A
5   Omar        58.0    F
------------------------------
Class Average : 81.00
Top Student   : Mia (96.5)
```

---

#### Exercise 8: Number Sorter
**Task:** Ask user to enter 6 numbers. Sort them in **both** ascending AND descending order using bubble sort.

**Expected Output:**
```
Enter 6 numbers: 64 25 12 22 11 90

Original   : 64 25 12 22 11 90
Ascending  : 11 12 22 25 64 90
Descending : 90 64 25 22 12 11
```

---

#### Exercise 9: Matrix Operations
**Task:** Create a 3×3 matrix. Calculate and display:
- The full matrix (formatted grid)
- Sum of each row
- Sum of each column
- Sum of main diagonal

**Expected Output:**
```
Matrix:
  1  2  3
  4  5  6
  7  8  9

Row Sums    : Row1=6   Row2=15  Row3=24
Col Sums    : Col1=12  Col2=15  Col3=18
Diagonal Sum: 15
```

---

## 💡 KEY TAKEAWAYS

1. **Index starts at 0** — first element is `array[0]`, last is `array[length-1]`
2. **`array.length`** — gives you the size (no parentheses!)
3. **`ArrayIndexOutOfBoundsException`** — happens when you go past the last index
4. **for-each loop** — cleaner for reading, regular for loop needed for index access
5. **Arrays are fixed size** — once created, size cannot change (use ArrayList for dynamic size)
6. **Pass arrays to methods** — arrays are passed by reference, changes inside method affect original

---

**Pick an exercise and start coding!** 🚀
Type `"My solution Exercise X"` when done for review!