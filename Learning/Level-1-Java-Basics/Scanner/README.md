# #06 JAVA – Input & Output (Scanner + System.out)

---

## 1️⃣ TOPIC INTRODUCTION

### What is Input/Output?
- **Output** = Your program **talking to the user** (printing text to screen)
- **Input** = The user **talking to your program** (typing data via keyboard)

### Why is it important?
- Every real program needs to communicate with users
- Without I/O your program just runs silently — useless!
- Foundation for building interactive applications

### Where is it used?
- Login forms, calculators, games, menus — literally everywhere

---

## 2️⃣ OUTPUT FIRST — System.out

Java has **3 print methods**. Know the difference:

```java
public class OutputDemo {
    public static void main(String[] args) {

        // 1. println() → prints + moves to NEW LINE
        System.out.println("Hello World");
        System.out.println("I am on a new line");

        // 2. print() → prints but STAYS on same line
        System.out.print("Hello ");
        System.out.print("World ");
        System.out.print("Same Line!");

        System.out.println(); // just adds a new line

        // 3. printf() → formatted printing (like a template)
        System.out.printf("My name is %s and I am %d years old%n", "Ali", 22);
        System.out.printf("Price: %.2f%n", 19.9999); // .2f = 2 decimal places
    }
}
```

**Output:**
```
Hello World
I am on a new line
Hello World Same Line!
My name is Ali and I am 22 years old
Price: 20.00
```

---

## 📋 printf() FORMAT SPECIFIERS

These are the "placeholders" used inside `printf()`:

| Specifier | Meaning | Example |
|-----------|---------|---------|
| `%d` | Integer (int, long) | `printf("%d", 25)` |
| `%f` | Floating point | `printf("%f", 3.14)` |
| `%.2f` | Float with 2 decimals | `printf("%.2f", 3.14159)` → `3.14` |
| `%s` | String | `printf("%s", "Java")` |
| `%c` | Character | `printf("%c", 'A')` |
| `%b` | Boolean | `printf("%b", true)` |
| `%n` | New line | `printf("text%n")` |

```java
public class PrintfDemo {
    public static void main(String[] args) {
        String name    = "Sara";
        int age        = 20;
        double gpa     = 3.856789;
        char grade     = 'A';
        boolean passed = true;

        // Using each format specifier
        System.out.printf("Name    : %s%n",   name);
        System.out.printf("Age     : %d%n",   age);
        System.out.printf("GPA     : %.2f%n", gpa);   // 2 decimal places
        System.out.printf("Grade   : %c%n",   grade);
        System.out.printf("Passed  : %b%n",   passed);

        // Multiple values in one printf
        System.out.printf("%nStudent %s (age %d) passed with GPA %.2f%n",
                           name, age, gpa);
    }
}
```

**Output:**
```
Name    : Sara
Age     : 20
GPA     : 3.86
Grade   : A
Passed  : true

Student Sara (age 20) passed with GPA 3.86
```

---

## 3️⃣ INPUT — Scanner Class

To read user input you need to **import** and **create** a Scanner:

```java
import java.util.Scanner;   // Step 1: Import at the TOP of file

public class InputDemo {
    public static void main(String[] args) {

        // Step 2: Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 3: Use it to read input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();   // reads a full line of text

        System.out.println("Hello, " + name + "!");

        // Step 4: Close scanner when done
        scanner.close();
    }
}
```

**Input / Output:**
```
Enter your name: Ali
Hello, Ali!
```

---

## 📋 SCANNER METHODS — Which one to use?

| Method | Reads | Use for |
|--------|-------|---------|
| `nextLine()` | Full line of text | Strings with spaces |
| `next()` | Single word | One word Strings |
| `nextInt()` | Integer number | `int` variables |
| `nextDouble()` | Decimal number | `double` variables |
| `nextFloat()` | Float number | `float` variables |
| `nextLong()` | Long number | `long` variables |
| `nextBoolean()` | true / false | `boolean` variables |

```java
import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Reading different data types
        System.out.print("Enter your name   : ");
        String name = sc.nextLine();           // full line

        System.out.print("Enter your age    : ");
        int age = sc.nextInt();                // integer

        System.out.print("Enter your height : ");
        double height = sc.nextDouble();       // decimal

        System.out.print("Are you a student (true/false): ");
        boolean isStudent = sc.nextBoolean();  // boolean

        // Print everything back
        System.out.println("\n--- Your Info ---");
        System.out.printf("Name     : %s%n",   name);
        System.out.printf("Age      : %d%n",   age);
        System.out.printf("Height   : %.1f%n", height);
        System.out.printf("Student  : %b%n",   isStudent);

        sc.close();
    }
}
```

**Input:**
```
Enter your name   : Ali Hassan
Enter your age    : 22
Enter your height : 1.75
Are you a student (true/false): true
```

**Output:**
```
--- Your Info ---
Name     : Ali Hassan
Age      : 22
Height   : 1.8
Student  : true
```

---

## ⚠️ COMMON BEGINNER MISTAKE — nextInt() + nextLine()

This is a **very common bug** every beginner hits:

```java
import java.util.Scanner;

public class BugDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        // ❌ BUG: nextInt() leaves a leftover newline '\n' in the buffer!

        System.out.print("Enter name: ");
        String name = sc.nextLine(); // this reads the leftover '\n' — SKIPS input!

        System.out.println("Age: " + age);
        System.out.println("Name: " + name); // prints empty string!
    }
}
```

### ✅ THE FIX — Add `sc.nextLine()` after nextInt():

```java
import java.util.Scanner;

public class BugFixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); // ✅ clears the leftover newline from buffer

        System.out.print("Enter name: ");
        String name = sc.nextLine(); // now reads correctly!

        System.out.println("Age: "  + age);
        System.out.println("Name: " + name);

        sc.close();
    }
}
```

**Input:**
```
Enter age: 22
Enter name: Ali Hassan
```

**Output:**
```
Age: 22
Name: Ali Hassan
```

---

## 4️⃣ FULL EXAMPLE PROGRAM

A complete program combining everything:

```java
import java.util.Scanner;

public class StudentProfile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ── Collect user info ──────────────────────────
        System.out.println("=== Student Profile Creator ===\n");

        System.out.print("First Name    : ");
        String firstName = sc.nextLine();

        System.out.print("Last Name     : ");
        String lastName = sc.nextLine();

        System.out.print("Age           : ");
        int age = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("GPA (e.g 3.75): ");
        double gpa = sc.nextDouble();
        sc.nextLine(); // clear buffer

        System.out.print("Major         : ");
        String major = sc.nextLine();

        // ── Display formatted profile ──────────────────
        System.out.println("\n================================");
        System.out.println("       STUDENT PROFILE          ");
        System.out.println("================================");
        System.out.printf("Full Name : %s %s%n", firstName, lastName);
        System.out.printf("Age       : %d years old%n", age);
        System.out.printf("Major     : %s%n", major);
        System.out.printf("GPA       : %.2f%n", gpa);
        System.out.printf("Status    : %s%n", gpa >= 2.0 ? "Passing" : "Failing");
        System.out.println("================================");

        sc.close();
    }
}
```

**Input:**
```
First Name    : Ali
Last Name     : Hassan
Age           : 22
GPA (e.g 3.75): 3.75
Major         : Computer Science
```

**Output:**
```
================================
       STUDENT PROFILE
================================
Full Name : Ali Hassan
Age       : 22 years old
Major     : Computer Science
GPA       : 3.75
Status    : Passing
================================
```

---

## 5️⃣ EXERCISES

---

### ✅ EASY Level

#### Exercise 1: Hello User
**Task:** Ask the user for their name and greet them.

**Expected Input/Output:**
```
Enter your name: Sara
Hello Sara! Welcome to Java!
```

---

#### Exercise 2: Rectangle Calculator
**Task:** Ask user for length and width. Print area and perimeter.

**Expected Input/Output:**
```
Enter length: 10
Enter width : 5
Area      = 50.0
Perimeter = 30.0
```

---

#### Exercise 3: Favorite Things
**Task:** Ask user for:
- Favorite color
- Favorite number
- Favorite food

Then print them back formatted nicely.

**Expected Output:**
```
Your favorite color  is : Blue
Your favorite number is : 7
Your favorite food   is : Pizza
```

---

### 🔶 MEDIUM Level

#### Exercise 4: Simple Bill Calculator
**Task:** Ask user for:
- Product name (String)
- Price per unit (double)
- Quantity (int)

Calculate and print total bill.

**Expected Input/Output:**
```
Product name    : Notebook
Price per unit  : 2.50
Quantity        : 4

--- BILL ---
Product  : Notebook
Price    : $2.50
Quantity : 4
Total    : $10.00
```

---

#### Exercise 5: BMI Calculator
**Task:** Ask user for weight (kg) and height (m). Calculate and display BMI.
- Formula: `BMI = weight / (height * height)`

**Expected Input/Output:**
```
Enter weight (kg): 70
Enter height (m) : 1.75

Your BMI is: 22.86
```

---

#### Exercise 6: Temperature Converter
**Task:** Ask user to enter temperature in Celsius. Convert and print in Fahrenheit and Kelvin.
- F = (C × 9/5) + 32
- K = C + 273.15

**Expected Input/Output:**
```
Enter temperature in Celsius: 100

100.0°C = 212.00°F
100.0°C = 373.15K
```

---

### 🔴 HARD Level

#### Exercise 7: Invoice Generator
**Task:** Ask user for:
- Customer name
- 3 items (name + price each)
- Tax rate (%)

Calculate subtotal, tax amount, and grand total. Print a formatted invoice.

**Expected Output:**
```
=============================
         INVOICE
=============================
Customer   : Ali Hassan
-----------------------------
Item 1     : Keyboard  $45.99
Item 2     : Mouse     $25.00
Item 3     : USB Hub   $15.50
-----------------------------
Subtotal   : $86.49
Tax (10%)  : $8.65
-----------------------------
TOTAL      : $95.14
=============================
```

---

#### Exercise 8: Student Report Card
**Task:** Ask for student name and marks in 5 subjects. Calculate:
- Total marks
- Average
- Grade (A=90+, B=80+, C=70+, D=60+, F=below 60)

**Expected Output:**
```
Student  : Ali
Marks    : 85, 90, 78, 92, 88
Total    : 433
Average  : 86.60
Grade    : B
```

---

#### Exercise 9: Loan Calculator
**Task:** Ask user for:
- Loan amount
- Annual interest rate (%)
- Loan period in years

Calculate and display monthly payment.
- Formula: `M = P * [r(1+r)^n] / [(1+r)^n - 1]`
- Where: P = loan amount, r = monthly rate, n = total months

**Expected Output:**
```
Loan Amount    : $10000.00
Interest Rate  : 5.00% per year
Loan Period    : 3 years (36 months)
Monthly Rate   : 0.42%
Monthly Payment: $299.71
```

---

## 💡 KEY TAKEAWAYS

Remember these 4 rules always:

1. **Always import Scanner** → `import java.util.Scanner;` at the top
2. **Match the method to the type** → `nextInt()` for int, `nextDouble()` for double, `nextLine()` for String
3. **Always clear the buffer** → add `sc.nextLine()` after `nextInt()` or `nextDouble()` before reading a String
4. **Always close Scanner** → `sc.close()` at the end

---

**Ready to practice?** Start with Exercise 1 and share your code! 🚀
Type `"My solution for Exercise X"` when you're done!