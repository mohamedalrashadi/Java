# 📘 String, Scanner, and printf - Complete Guide

Let's master working with text, user input, and formatted output in Java!

---

## **1️⃣ TOPIC INTRODUCTION**

### **What are String, Scanner, and printf?**

- **String** - A class for storing and manipulating text (sequences of characters)
- **Scanner** - A class for reading user input from keyboard, files, etc.
- **printf** - A method for formatted output (controlling how data is displayed)

### **Why are they Important?**

- ✅ **String** - Almost every program needs to work with text
- ✅ **Scanner** - Programs need user interaction and input
- ✅ **printf** - Professional programs need formatted, readable output

### **Where are they Used?**

- 📝 Reading user data (login credentials, forms)
- 💬 Text processing (search, validation, manipulation)
- 📊 Formatted reports and tables
- 🎮 Games (player names, scores)
- 🌐 Web applications (handling text data)

---

## **2️⃣ STRING CLASS - SYNTAX & BASICS**

### **Creating Strings**

```java
// Method 1: String literal (most common)
String name = "John";

// Method 2: Using new keyword
String greeting = new String("Hello");

// Empty string
String empty = "";
```

### **Important String Characteristics**

- Strings are **objects**, not primitive types
- Strings are **immutable** (cannot be changed after creation)
- String class starts with **uppercase S**

### **Common String Methods**

```java
String text = "Hello World";

// Length of string
int len = text.length();              // 11

// Character at index
char ch = text.charAt(0);             // 'H'

// Convert to uppercase/lowercase
String upper = text.toUpperCase();    // "HELLO WORLD"
String lower = text.toLowerCase();    // "hello world"

// Substring
String sub = text.substring(0, 5);    // "Hello"

// Check if contains
boolean has = text.contains("World"); // true

// Replace characters
String newText = text.replace('o', 'a'); // "Hella Warld"

// Split string
String[] words = text.split(" ");     // ["Hello", "World"]

// Trim whitespace
String messy = "  Java  ";
String clean = messy.trim();          // "Java"
```

### **String Concatenation**

```java
// Using + operator
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName;  // "John Doe"

// Concatenating with numbers
int age = 25;
String info = "Age: " + age;  // "Age: 25"

// Multiple concatenations
String message = "Hello" + " " + "World" + "!";  // "Hello World!"
```

---

## **3️⃣ SCANNER CLASS - SYNTAX & BASICS**

### **Importing Scanner**

```java
import java.util.Scanner;  // At top of file, before class declaration
```

### **Creating Scanner Object**

```java
// Create Scanner to read from keyboard (System.in)
Scanner input = new Scanner(System.in);
```

### **Reading Different Data Types**

```java
Scanner scanner = new Scanner(System.in);

// Read a String (single word - stops at space)
String name = scanner.next();

// Read entire line (including spaces)
String fullName = scanner.nextLine();

// Read an integer
int age = scanner.nextInt();

// Read a double
double price = scanner.nextDouble();

// Read a float
float temperature = scanner.nextFloat();

// Read a boolean
boolean isValid = scanner.nextBoolean();

// Read a byte
byte smallNum = scanner.nextByte();

// Close scanner when done (good practice)
scanner.close();
```

### **⚠️ Common Scanner Pitfall - nextLine() Issue**

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter age: ");
int age = scanner.nextInt();           // Reads number but leaves newline

System.out.print("Enter name: ");
String name = scanner.nextLine();      // Reads leftover newline (empty!)

// SOLUTION: Add extra nextLine() to consume leftover newline
scanner.nextLine();  // Consume the leftover newline
String name = scanner.nextLine();  // Now reads actual input
```

---

## **4️⃣ PRINTF METHOD - SYNTAX & BASICS**

### **Basic Syntax**

```java
System.out.printf("format string", arguments);
```

### **Format Specifiers**

| Specifier | Data Type | Description |
|-----------|-----------|-------------|
| `%d` | int, long, short, byte | Decimal integer |
| `%f` | float, double | Floating-point |
| `%s` | String | String |
| `%c` | char | Character |
| `%b` | boolean | Boolean |
| `%n` | - | Newline (platform-independent) |

### **Basic printf Examples**

```java
int age = 25;
String name = "Alice";
double gpa = 3.856;

// Basic formatting
System.out.printf("Name: %s%n", name);           // Name: Alice
System.out.printf("Age: %d%n", age);             // Age: 25
System.out.printf("GPA: %f%n", gpa);             // GPA: 3.856000

// Multiple values
System.out.printf("Name: %s, Age: %d%n", name, age);
```

### **Controlling Decimal Places**

```java
double price = 19.99;
double pi = 3.14159265359;

// 2 decimal places
System.out.printf("Price: %.2f%n", price);       // Price: 19.99

// 4 decimal places
System.out.printf("Pi: %.4f%n", pi);             // Pi: 3.1416

// No decimal places
System.out.printf("Rounded: %.0f%n", pi);        // Rounded: 3
```

### **Field Width & Alignment**

```java
String item1 = "Apple";
String item2 = "Banana";
double price1 = 1.50;
double price2 = 2.75;

// Right-aligned (default for numbers)
System.out.printf("%10s: %6.2f%n", item1, price1);
//     Apple:   1.50

// Left-aligned (use -)
System.out.printf("%-10s: %.2f%n", item1, price1);
// Apple     : 1.50

// Creating a table
System.out.printf("%-10s %10s%n", "Item", "Price");
System.out.printf("%-10s %10.2f%n", item1, price1);
System.out.printf("%-10s %10.2f%n", item2, price2);
```

---

## **5️⃣ COMPLETE EXAMPLE PROGRAMS**

### **Example 1: String Methods Demonstration**

```java
/**
 * Program: StringDemo.java
 * Purpose: Demonstrate common String methods
 */

public class StringDemo {
    public static void main(String[] args) {
        // Create strings
        String greeting = "Hello";
        String name = "Alice";
        
        // Concatenation
        String message = greeting + " " + name + "!";
        System.out.println("Message: " + message);
        
        // Length
        int length = message.length();
        System.out.println("Length: " + length);
        
        // Character at index
        char firstChar = message.charAt(0);
        System.out.println("First character: " + firstChar);
        
        // Convert case
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());
        
        // Substring
        String sub = message.substring(0, 5);
        System.out.println("Substring (0-5): " + sub);
        
        // Check contains
        boolean hasAlice = message.contains("Alice");
        System.out.println("Contains 'Alice': " + hasAlice);
        
        // Replace
        String replaced = message.replace('!', '?');
        System.out.println("Replaced: " + replaced);
    }
}
```

**Execution Flow:**
1. Two strings created: `greeting` and `name`
2. Strings concatenated with space and exclamation mark
3. Length calculated (13 characters including spaces)
4. First character extracted (index 0 = 'H')
5. String converted to uppercase, then lowercase
6. Substring extracted from index 0 to 4 (5 not included)
7. Checks if "Alice" exists in message (returns true)
8. Replaces '!' with '?'

**Output:**
```
Message: Hello Alice!
Length: 13
First character: H
Uppercase: HELLO ALICE!
Lowercase: hello alice!
Substring (0-5): Hello
Contains 'Alice': true
Replaced: Hello Alice?
```

---

### **Example 2: Scanner for User Input**

```java
/**
 * Program: UserInputDemo.java
 * Purpose: Read and display user information using Scanner
 */

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Read string (single word)
        System.out.print("Enter your first name: ");
        String firstName = input.next();
        
        // Read integer
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        // Clear the newline left by nextInt()
        input.nextLine();
        
        // Read full line (with spaces)
        System.out.print("Enter your city: ");
        String city = input.nextLine();
        
        // Read double
        System.out.print("Enter your GPA: ");
        double gpa = input.nextDouble();
        
        // Display collected information
        System.out.println("\n=== Your Information ===");
        System.out.println("Name: " + firstName);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("GPA: " + gpa);
        
        // Close scanner
        input.close();
    }
}
```

**Execution Flow:**
1. Scanner object created to read from keyboard
2. Prompts user for first name, reads single word
3. Prompts for age, reads integer
4. Calls `nextLine()` to consume leftover newline character
5. Prompts for city, reads entire line (can include spaces)
6. Prompts for GPA, reads double value
7. Displays all collected information
8. Closes scanner to free resources

**Sample Input:**
```
Enter your first name: John
Enter your age: 20
Enter your city: Kuala Lumpur
Enter your GPA: 3.75
```

**Output:**
```
=== Your Information ===
Name: John
Age: 20
City: Kuala Lumpur
GPA: 3.75
```

---

### **Example 3: Printf Formatting**

```java
/**
 * Program: PrintfDemo.java
 * Purpose: Demonstrate printf formatting capabilities
 */

public class PrintfDemo {
    public static void main(String[] args) {
        // Student information
        String name = "Alice Wong";
        int studentId = 12345;
        double gpa = 3.856;
        char grade = 'A';
        boolean isActive = true;
        
        // Basic formatting
        System.out.println("=== BASIC FORMATTING ===");
        System.out.printf("Name: %s%n", name);
        System.out.printf("ID: %d%n", studentId);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.printf("Grade: %c%n", grade);
        System.out.printf("Active: %b%n", isActive);
        
        // Creating a formatted table
        System.out.println("\n=== PRODUCT TABLE ===");
        System.out.printf("%-15s %10s %10s%n", "Item", "Quantity", "Price");
        System.out.printf("%-15s %10d %10.2f%n", "Apple", 5, 1.50);
        System.out.printf("%-15s %10d %10.2f%n", "Banana", 12, 0.75);
        System.out.printf("%-15s %10d %10.2f%n", "Orange", 8, 2.00);
        
        // Different decimal precisions
        System.out.println("\n=== DECIMAL PRECISION ===");
        double pi = 3.14159265359;
        System.out.printf("Pi (2 decimals): %.2f%n", pi);
        System.out.printf("Pi (4 decimals): %.4f%n", pi);
        System.out.printf("Pi (6 decimals): %.6f%n", pi);
        
        // Width and alignment
        System.out.println("\n=== WIDTH & ALIGNMENT ===");
        System.out.printf("Right aligned: %10d%n", 42);
        System.out.printf("Left aligned:  %-10d (end)%n", 42);
        System.out.printf("Padded float:  %10.2f%n", 3.14);
    }
}
```

**Execution Flow:**
1. Variables declared with different data types
2. Basic formatting section shows each format specifier
3. Table section demonstrates column alignment
4. Decimal precision section shows same number with different precision
5. Width & alignment section shows spacing control

**Output:**
```
=== BASIC FORMATTING ===
Name: Alice Wong
ID: 12345
GPA: 3.86
Grade: A
Active: true

=== PRODUCT TABLE ===
Item                 Quantity      Price
Apple                       5       1.50
Banana                     12       0.75
Orange                      8       2.00

=== DECIMAL PRECISION ===
Pi (2 decimals): 3.14
Pi (4 decimals): 3.1416
Pi (6 decimals): 3.141593

=== WIDTH & ALIGNMENT ===
Right aligned:         42
Left aligned:  42         (end)
Padded float:        3.14
```

---

### **Example 4: Combined - Student Registration System**

```java
/**
 * Program: StudentRegistration.java
 * Purpose: Complete system using String, Scanner, and printf
 */

import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        // Create Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Display header
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║   STUDENT REGISTRATION SYSTEM      ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println();
        
        // Collect student information
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        System.out.print("Enter program (e.g., Computer Science): ");
        String program = scanner.nextLine();
        
        System.out.print("Enter CGPA (0.00 - 4.00): ");
        double cgpa = scanner.nextDouble();
        
        // Process data
        String upperName = fullName.toUpperCase();
        int nameLength = fullName.length();
        char gradeLevel = (age >= 23) ? 'P' : 'U';  // P=Postgrad, U=Undergrad
        
        // Display formatted output
        System.out.println("\n");
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║      REGISTRATION CONFIRMED        ║");
        System.out.println("╚════════════════════════════════════╝");
        
        System.out.printf("%-20s: %s%n", "Student Name", fullName);
        System.out.printf("%-20s: %s%n", "Name (Uppercase)", upperName);
        System.out.printf("%-20s: %d characters%n", "Name Length", nameLength);
        System.out.printf("%-20s: %s%n", "Student ID", studentId);
        System.out.printf("%-20s: %d years%n", "Age", age);
        System.out.printf("%-20s: %s%n", "Program", program);
        System.out.printf("%-20s: %.2f%n", "CGPA", cgpa);
        System.out.printf("%-20s: %c%n", "Level", gradeLevel);
        
        // Determine academic standing
        String standing;
        if (cgpa >= 3.5) {
            standing = "EXCELLENT - Dean's List";
        } else if (cgpa >= 3.0) {
            standing = "GOOD STANDING";
        } else if (cgpa >= 2.0) {
            standing = "SATISFACTORY";
        } else {
            standing = "PROBATION";
        }
        
        System.out.printf("%-20s: %s%n", "Academic Standing", standing);
        System.out.println("════════════════════════════════════");
        
        // Close scanner
        scanner.close();
    }
}
```

**Execution Flow:**
1. Scanner created for input
2. Header displayed using box-drawing characters
3. User prompted for: name, ID, age, program, CGPA
4. `nextLine()` used after `nextInt()` to clear buffer
5. Data processed: name converted to uppercase, length calculated
6. Grade level determined based on age
7. All information displayed in formatted table using `printf`
8. Academic standing calculated from CGPA
9. Scanner closed

**Sample Input:**
```
Enter full name: Alice Wong Wei Ling
Enter student ID: A123456
Enter age: 21
Enter program (e.g., Computer Science): Software Engineering
Enter CGPA (0.00 - 4.00): 3.75
```

**Output:**
```
╔════════════════════════════════════╗
║   STUDENT REGISTRATION SYSTEM      ║
╚════════════════════════════════════╝

╔════════════════════════════════════╗
║      REGISTRATION CONFIRMED        ║
╚════════════════════════════════════╝
Student Name        : Alice Wong Wei Ling
Name (Uppercase)    : ALICE WONG WEI LING
Name Length         : 19 characters
Student ID          : A123456
Age                 : 21 years
Program             : Software Engineering
CGPA                : 3.75
Level               : U
Academic Standing   : EXCELLENT - Dean's List
════════════════════════════════════
```

---

## **6️⃣ EXERCISES**

### **✏️ Easy Exercises**

**Exercise 1: String Manipulation**
Write a program that:
- Asks user for their full name
- Displays the name in uppercase
- Displays the name in lowercase
- Displays the number of characters in the name

**Expected Output:**
```
Enter your full name: John Doe
Uppercase: JOHN DOE
Lowercase: john doe
Length: 8 characters
```

---

**Exercise 2: Simple Calculator Input**
Create a program that:
- Asks user for two numbers (doubles)
- Displays their sum using printf with 2 decimal places

**Expected Output:**
```
Enter first number: 5.5
Enter second number: 3.2
Sum: 8.70
```

---

**Exercise 3: Character Extraction**
Write a program that:
- Asks user for a word
- Displays the first, middle, and last character

**Expected Output:**
```
Enter a word: HELLO
First character: H
Middle character: L
Last character: O
```

---

### **📝 Medium Exercises**

**Exercise 4: Temperature Converter**
Create a program that:
- Asks user for temperature in Celsius
- Converts to Fahrenheit (F = C × 9/5 + 32)
- Displays both temperatures formatted to 1 decimal place

**Expected Output:**
```
Enter temperature in Celsius: 25
Temperature: 25.0°C = 77.0°F
```

---

**Exercise 5: Receipt Generator**
Write a program that:
- Asks for item name, quantity, and price
- Calculates total (quantity × price)
- Adds 6% tax
- Displays formatted receipt

**Expected Output:**
```
Enter item name: Laptop
Enter quantity: 2
Enter price per unit: 1500.00

===== RECEIPT =====
Item      : Laptop
Quantity  : 2
Price     : RM 1500.00
Subtotal  : RM 3000.00
Tax (6%)  : RM 180.00
Total     : RM 3180.00
===================
```

---

**Exercise 6: Email Validator**
Create a program that:
- Asks user for email address
- Checks if it contains "@" symbol
- Extracts username (before @) and domain (after @)
- Displays the parts

**Expected Output:**
```
Enter email: alice@university.edu
Valid email: true
Username: alice
Domain: university.edu
```

---

### **🔥 Hard Exercises**

**Exercise 7: Student Grade Report**
Create a comprehensive program that:
- Asks for student name
- Asks for 5 subject marks (doubles)
- Calculates average
- Determines letter grade (A: ≥90, B: ≥80, C: ≥70, D: ≥60, F: <60)
- Displays formatted report card

**Expected Output:**
```
Enter student name: Alice Wong
Enter mark for Subject 1: 85.5
Enter mark for Subject 2: 92.0
Enter mark for Subject 3: 78.5
Enter mark for Subject 4: 88.0
Enter mark for Subject 5: 95.5

╔═══════════════════════════════════╗
║        GRADE REPORT CARD          ║
╚═══════════════════════════════════╝
Student: Alice Wong
Subject 1:    85.50
Subject 2:    92.00
Subject 3:    78.50
Subject 4:    88.00
Subject 5:    95.50
────────────────────────
Average:      87.90
Grade:        B
═══════════════════════════════════
```

---

**Exercise 8: Product Inventory Table**
Create a program that:
- Asks for 3 products (name, stock, price)
- Calculates total inventory value for each
- Displays in formatted table
- Shows grand total

**Expected Output:**
```
Enter details for 3 products:

Product 1:
Name: Laptop
Stock: 15
Price: 2500.00

Product 2:
Name: Mouse
Stock: 50
Price: 25.00

Product 3:
Name: Keyboard
Stock: 30
Price: 75.00

╔════════════════════════════════════════════════╗
║           INVENTORY REPORT                     ║
╚════════════════════════════════════════════════╝
Product          Stock    Price      Total Value
────────────────────────────────────────────────
Laptop              15  2500.00        37500.00
Mouse               50    25.00         1250.00
Keyboard            30    75.00         2250.00
────────────────────────────────────────────────
                           Grand Total: 41000.00
════════════════════════════════════════════════
```

---

## **7️⃣ EXERCISE SOLUTIONS & EXPLANATIONS**

### **Solution 1: String Manipulation**

```java
/**
 * Program: StringManipulation.java
 * Purpose: Demonstrate string manipulation methods
 */

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();
        
        // Process string
        String uppercase = fullName.toUpperCase();
        String lowercase = fullName.toLowerCase();
        int length = fullName.length();
        
        // Display results
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Length: " + length + " characters");
        
        // Close scanner
        input.close();
    }
}
```

**Input:** `John Doe`

**Output:**
```
Enter your full name: John Doe
Uppercase: JOHN DOE
Lowercase: john doe
Length: 8 characters
```

**Explanation:**
- `nextLine()` reads entire line including spaces
- `toUpperCase()` converts all characters to uppercase
- `toLowerCase()` converts all characters to lowercase
- `length()` counts total characters (including spaces)

---

### **Solution 2: Simple Calculator Input**

```java
/**
 * Program: SimpleCalculator.java
 * Purpose: Read two numbers and display formatted sum
 */

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        
        // Read two numbers
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        // Calculate sum
        double sum = num1 + num2;
        
        // Display result with 2 decimal places
        System.out.printf("Sum: %.2f%n", sum);
        
        // Close scanner
        input.close();
    }
}
```

**Input:**
```
5.5
3.2
```

**Output:**
```
Enter first number: 5.5
Enter second number: 3.2
Sum: 8.70
```

**Explanation:**
- `nextDouble()` reads decimal numbers
- Variables store the values
- Addition performed and result stored in `sum`
- `printf` with `%.2f` formats to exactly 2 decimal places
- `%n` adds platform-independent newline

---

### **Solution 3: Character Extraction**

```java
/**
 * Program: CharacterExtraction.java
 * Purpose: Extract first, middle, and last characters from a word
 */

import java.util.Scanner;

public class CharacterExtraction {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        
        // Read word
        System.out.print("Enter a word: ");
        String word = input.next();
        
        // Calculate positions
        int length = word.length();
        int middleIndex = length / 2;
        int lastIndex = length - 1;
        
        // Extract characters
        char firstChar = word.charAt(0);
        char middleChar = word.charAt(middleIndex);
        char lastChar = word.charAt(lastIndex);
        
        // Display results
        System.out.println("First character: " + firstChar);
        System.out.println("Middle character: " + middleChar);
        System.out.println("Last character: " + lastChar);
        
        // Close scanner
        input.close();
    }
}
```

**Input:** `HELLO`

**Output:**
```
Enter a word: HELLO
First character: H
Middle character: L
Last character: O
```

**Explanation:**
- `next()` reads single word (stops at space)
- `length()` gets total number of characters (5)
- First character is always at index 0
- Middle index calculated as length/2 (5/2 = 2)
- Last index is length-1 (5-1 = 4)
- `charAt(index)` extracts character at specific position
- String indices start at 0: H(0), E(1), L(2), L(3), O(4)

---

### **Solution 4: Temperature Converter**

```java
/**
 * Program: TemperatureConverter.java
 * Purpose: Convert Celsius to Fahrenheit
 */

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        
        // Read Celsius temperature
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        
        // Convert to Fahrenheit
        // Formula: F = C × 9/5 + 32
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        
        // Display result with 1 decimal place
        System.out.printf("Temperature: %.1f°C = %.1f°F%n", celsius, fahrenheit);
        
        // Close scanner
        input.close();
    }
}
```

**Input:** `25`

**Output:**
```
Enter temperature in Celsius: 25
Temperature: 25.0°C = 77.0°F
```

**Explanation:**
- Conversion formula: F = (C × 9/5) + 32
- Use 9.0 and 5.0 (not 9/5) to ensure floating-point division
- Integer division 9/5 would give 1, but 9.0/5.0 gives 1.8
- `%.1f` formats to 1 decimal place
- Can print degree symbol (°) directly in string

---

### **Solution 5: Receipt Generator**

```java
/**
 * Program: ReceiptGenerator.java
 * Purpose: Generate formatted sales receipt
 */

import java.util.Scanner;

public class ReceiptGenerator {
    public static void main(String[] args) {
        // Tax rate constant
        final double TAX_RATE = 0.06;  // 6%
        
        // Create scanner
        Scanner input = new Scanner(System.in);
        
        // Read item details
        System.out.print("Enter item name: ");
        String itemName = input.nextLine();
        
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        
        System.out.print("Enter price per unit: ");
        double pricePerUnit = input.nextDouble();
        
        // Calculate totals
        double subtotal = quantity * pricePerUnit;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;
        
        // Display receipt
        System.out.println();
        System.out.println("===== RECEIPT =====");
        System.out.printf("%-10s: %s%n", "Item", itemName);
        System.out.printf("%-10s: %d%n", "Quantity", quantity);
        System.out.printf("%-10s: RM %.2f%n", "Price", pricePerUnit);
        System.out.printf("%-10s: RM %.2f%n", "Subtotal", subtotal);
        System.out.printf("%-10s: RM %.2f%n", "Tax (6%)", tax);
        System.out.printf("%-10s: RM %.2f%n", "Total", total);
        System.out.println("===================");
        
        // Close scanner
        input.close();
    }
}
```

**Input:**
```
Laptop
2
1500.00
```

**Output:**
```
Enter item name: Laptop
Enter quantity: 2
Enter price per unit: 1500.00

===== RECEIPT =====
Item      : Laptop
Quantity  : 2
Price     : RM 1500.00
Subtotal  : RM 3000.00
Tax (6%)  : RM 180.00
Total     : RM 3180.00
===================
```

**Explanation:**
- `final double TAX_RATE` creates a constant (cannot be changed)
- Subtotal = quantity × price per unit (2 × 1500 = 3000)
- Tax = subtotal × tax rate (3000 ×