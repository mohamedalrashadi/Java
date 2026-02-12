# #018 & #019 JAVA – Methods and Functions

---

## 1️⃣ TOPIC INTRODUCTION

### What is a Method?
A **method** is a **block of reusable code** that performs a specific task. You write it once and call it as many times as you need.

### Why is it important?
- **No repetition** — write once, use many times (DRY principle)
- **Organization** — breaks big programs into small pieces
- **Easier to debug** — fix one method, fixes everywhere it's used
- **Readable** — code tells a story when methods have good names

### Real World Analogy:
```
Think of a method like a COFFEE MACHINE:
- You press the button (call the method)
- It does its job internally
- It gives you coffee back (returns a value)
- You don't need to know HOW it works inside
```

---

## 2️⃣ METHOD STRUCTURE

```java
accessModifier returnType methodName(parameters) {
    // method body
    return value; // only if returnType is NOT void
}
```

### Breaking it down:

```java
//      ↓ modifier  ↓ return type  ↓ name    ↓ parameters
public  static      int            add      (int a, int b) {
    return a + b;  // ← return statement
}
```

| Part | Meaning | Example |
|------|---------|---------|
| `public` | Who can access it | `public`, `private` |
| `static` | Belongs to class (for now) | `static` |
| `int` | What type it returns | `int`, `double`, `String`, `void` |
| `add` | Method name | any camelCase name |
| `(int a, int b)` | Input parameters | values passed in |
| `return` | Sends value back | `return a + b;` |

---

## 3️⃣ TYPES OF METHODS

### Type 1 — void (No Return Value)
```java
public class VoidMethod {

    // void = returns NOTHING, just does a task
    public static void greet(String name) {
        System.out.println("Hello, " + name + "! 👋");
    }

    public static void printLine() {
        System.out.println("================================");
    }

    public static void main(String[] args) {
        greet("Ali");          // call the method
        printLine();           // call another method
        greet("Sara");         // reuse it!
        printLine();
    }
}
```
**Output:**
```
Hello, Ali! 👋
================================
Hello, Sara! 👋
================================
```

---

### Type 2 — Return Value (int, double, String...)
```java
public class ReturnMethod {

    // Returns an int value
    public static int add(int a, int b) {
        return a + b;    // sends result back to caller
    }

    // Returns a double value
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Returns a String value
    public static String getGrade(int score) {
        if      (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else                  return "F";
    }

    public static void main(String[] args) {

        // Store returned value in a variable
        int sum    = add(10, 20);
        double area = circleArea(5.0);
        String grade = getGrade(85);

        System.out.println("Sum    : " + sum);
        System.out.printf ("Area   : %.2f%n", area);
        System.out.println("Grade  : " + grade);

        // Or use directly inside println
        System.out.println("Add 7+3: " + add(7, 3));
    }
}
```
**Output:**
```
Sum    : 30
Area   : 78.54
Grade  : B
Add 7+3: 10
```

---

### Type 3 — No Parameters, No Return
```java
public class NoParamNoReturn {

    public static void showMenu() {
        System.out.println("=== MAIN MENU ===");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Settings");
        System.out.println("4. Exit");
        System.out.println("=================");
    }

    public static void showWelcome() {
        System.out.println("🎮 Welcome to Java Quest!");
        System.out.println("The adventure begins...\n");
    }

    public static void main(String[] args) {
        showWelcome();
        showMenu();
    }
}
```
**Output:**
```
🎮 Welcome to Java Quest!
The adventure begins...

=== MAIN MENU ===
1. Start Game
2. Load Game
3. Settings
4. Exit
=================
```

---

### Type 4 — Parameters, No Return (void with params)
```java
public class ParamNoReturn {

    public static void printBox(String message) {
        int len = message.length() + 4;

        // print top border
        for (int i = 0; i < len; i++) System.out.print("=");
        System.out.println();

        // print message
        System.out.println("| " + message + " |");

        // print bottom border
        for (int i = 0; i < len; i++) System.out.print("=");
        System.out.println();
    }

    public static void printInfo(String name, int age, double gpa) {
        System.out.printf("Name : %-15s Age : %d  GPA : %.2f%n",
                           name, age, gpa);
    }

    public static void main(String[] args) {
        printBox("Hello Java!");
        printBox("Methods are awesome!");
        System.out.println();
        printInfo("Ali",   22, 3.85);
        printInfo("Sara",  20, 3.92);
        printInfo("Ahmed", 23, 3.71);
    }
}
```
**Output:**
```
===============
| Hello Java! |
===============
========================
| Methods are awesome! |
========================

Name : Ali             Age : 22  GPA : 3.85
Name : Sara            Age : 20  GPA : 3.92
Name : Ahmed           Age : 23  GPA : 3.71
```

---

## 4️⃣ METHOD OVERLOADING

Same method name, **different parameters**. Java picks the right one automatically.

```java
public class MethodOverloading {

    // Same name "add" — different parameter types/count
    public static int add(int a, int b) {
        System.out.print("[int version] ");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.print("[double version] ");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.print("[3 param version] ");
        return a + b + c;
    }

    public static String add(String a, String b) {
        System.out.print("[String version] ");
        return a + b;
    }

    public static void main(String[] args) {
        // Java automatically picks the right version
        System.out.println(add(5, 10));              // int version
        System.out.println(add(3.5, 2.5));           // double version
        System.out.println(add(1, 2, 3));            // 3 param version
        System.out.println(add("Hello ", "World!")); // String version
    }
}
```
**Output:**
```
[int version] 15
[double version] 6.0
[3 param version] 6
[String version] Hello World!
```

---

## 5️⃣ VARIABLE SCOPE

```java
public class ScopeDemo {

    // Class-level variable (accessible everywhere)
    static int globalCount = 0;

    public static void incrementCount() {
        globalCount++;    // can access global variable
        int local = 10;   // local variable — ONLY inside this method
        System.out.println("Count: " + globalCount);
    }

    public static void showLocal() {
        int local = 99;   // different 'local' — ONLY in this method
        System.out.println("Local: " + local);
        // System.out.println(local from incrementCount); ← ERROR! can't access
    }

    public static void main(String[] args) {
        incrementCount();   // Count: 1
        incrementCount();   // Count: 2
        incrementCount();   // Count: 3
        showLocal();        // Local: 99
        System.out.println("Global: " + globalCount); // 3
    }
}
```
**Output:**
```
Count: 1
Count: 2
Count: 3
Local: 99
Global: 3
```

---

## 6️⃣ REAL PROGRAM — All Together

A complete program using multiple methods working together:

```java
import java.util.Scanner;

public class StudentGradeSystem {

    // ── Method 1: Get letter grade from score ────────────────
    public static String getGrade(double score) {
        if      (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else                  return "F";
    }

    // ── Method 2: Calculate average ──────────────────────────
    public static double calcAverage(double s1, double s2,
                                     double s3, double s4, double s5) {
        return (s1 + s2 + s3 + s4 + s5) / 5;
    }

    // ── Method 3: Check pass or fail ─────────────────────────
    public static String passOrFail(double average) {
        return (average >= 60) ? "PASS ✅" : "FAIL ❌";
    }

    // ── Method 4: Print report card ──────────────────────────
    public static void printReport(String name, double[] marks,
                                   double avg, String grade,
                                   String status) {
        System.out.println("\n================================");
        System.out.println("        REPORT CARD             ");
        System.out.println("================================");
        System.out.printf ("Student : %s%n", name);
        System.out.println("--------------------------------");
        System.out.printf ("Math    : %.1f%n", marks[0]);
        System.out.printf ("Science : %.1f%n", marks[1]);
        System.out.printf ("English : %.1f%n", marks[2]);
        System.out.printf ("History : %.1f%n", marks[3]);
        System.out.printf ("Java    : %.1f%n", marks[4]);
        System.out.println("--------------------------------");
        System.out.printf ("Average : %.2f%n", avg);
        System.out.printf ("Grade   : %s%n",   grade);
        System.out.printf ("Status  : %s%n",   status);
        System.out.println("================================");
    }

    // ── Main: Ties everything together ───────────────────────
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        double[] marks = new double[5];
        String[] subjects = {"Math", "Science", "English",
                             "History", "Java"};

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter " + subjects[i] + " mark: ");
            marks[i] = sc.nextDouble();
        }

        // Call methods
        double avg    = calcAverage(marks[0], marks[1], marks[2],
                                    marks[3], marks[4]);
        String grade  = getGrade(avg);
        String status = passOrFail(avg);

        // Print the full report
        printReport(name, marks, avg, grade, status);

        sc.close();
    }
}
```

**Input:**
```
Enter student name: Ali Hassan
Enter Math mark   : 88
Enter Science mark: 92
Enter English mark: 76
Enter History mark: 85
Enter Java mark   : 95
```

**Output:**
```
================================
        REPORT CARD
================================
Student : Ali Hassan
--------------------------------
Math    : 88.0
Science : 92.0
English : 76.0
History : 85.0
Java    : 95.0
--------------------------------
Average : 87.20
Grade   : B
Status  : PASS ✅
================================
```

---

## 7️⃣ EXERCISES

---

### ✅ EASY Level

#### Exercise 1: Greeting Method
**Task:** Write a method `greet(String name, int age)` that prints:
```
Hello Ali! You are 22 years old. Welcome to Java! 🎉
```

---

#### Exercise 2: Calculator Methods
**Task:** Write 4 separate methods:
- `add(int a, int b)`
- `subtract(int a, int b)`
- `multiply(int a, int b)`
- `divide(double a, double b)`

Call all four in main and print results.

**Expected Output:**
```
10 + 5 = 15
10 - 5 = 5
10 × 5 = 50
10 ÷ 5 = 2.00
```

---

#### Exercise 3: isEven Method
**Task:** Write a method `isEven(int number)` that **returns a boolean** (true if even, false if odd). Use it in main to check 3 different numbers.

**Expected Output:**
```
4  is even: true
7  is even: false
10 is even: true
```

---

### 🔶 MEDIUM Level

#### Exercise 4: Max of Three
**Task:** Write a method `maxOfThree(int a, int b, int c)` that returns the **largest** of three numbers. Test it with different inputs.

**Expected Output:**
```
Max of (3, 7, 5)    = 7
Max of (100, 50, 75)= 100
Max of (1, 1, 1)    = 1
```

---

#### Exercise 5: Temperature Converter Methods
**Task:** Write two methods:
- `celsiusToFahrenheit(double celsius)` → returns double
- `fahrenheitToCelsius(double fahrenheit)` → returns double

Ask user which conversion they want, get input, call the right method.

**Expected Input/Output:**
```
1. Celsius to Fahrenheit
2. Fahrenheit to Celsius
Choice: 1
Enter Celsius: 100
100.0°C = 212.00°F
```

---

#### Exercise 6: Overloaded Area Method
**Task:** Create an overloaded method `area()` for:
- `area(double side)` → square area
- `area(double length, double width)` → rectangle area
- `area(double base, double height, boolean isTriangle)` → triangle area

**Expected Output:**
```
Square area    (side=5)          : 25.00
Rectangle area (5 × 3)          : 15.00
Triangle area  (base=6,height=4): 12.00
```

---

### 🔴 HARD Level

#### Exercise 7: Number Utilities Class
**Task:** Create a class with these utility methods:
- `isPrime(int n)` → returns boolean
- `factorial(int n)` → returns long
- `sumOfDigits(int n)` → returns int
- `reverseNumber(int n)` → returns int

Test each with user input.

**Expected Output:**
```
Number: 17
Is Prime     : true
Factorial    : 355687428096000
Sum of Digits: 8
Reversed     : 71
```

---

#### Exercise 8: Bank Account Methods
**Task:** Simulate a bank account using methods:
- `showBalance(double balance)` → prints balance
- `deposit(double balance, double amount)` → returns new balance
- `withdraw(double balance, double amount)` → returns new balance (check insufficient funds)
- `showStatement(String name, double opening, double closing)` → prints summary

**Expected Output:**
```
Opening Balance: $1000.00
Deposited      : $500.00
New Balance    : $1500.00
Withdrawn      : $200.00
Final Balance  : $1300.00

=== STATEMENT ===
Account : Ali
Opening : $1000.00
Closing : $1300.00
Net     : +$300.00
```

---

#### Exercise 9: String Utilities
**Task:** Write these String methods without using built-in shortcuts:
- `countVowels(String s)` → returns int
- `isPalindrome(String s)` → returns boolean
- `capitalizeWords(String s)` → returns String
- `repeatString(String s, int n)` → returns String

**Expected Output:**
```
String: "hello world"
Vowels         : 3
Is Palindrome  : false

String: "racecar"
Is Palindrome  : true

capitalizeWords: "Hello World"
repeatString x3: "hello hello hello "
```

---

## 💡 KEY TAKEAWAYS

1. **`void`** = method does a job, returns nothing
2. **`return type`** = method gives a value back
3. **Parameters** = inputs the method needs to do its job
4. **Overloading** = same name, different parameters
5. **Scope** = variables only live inside their `{ }` block
6. **DRY Principle** = Don't Repeat Yourself — use methods!
7. **Always name methods** with a **verb** → `calculateArea()`, `printReport()`, `isValid()`

---

**Ready to practice?** Start with Exercise 1 and share your code! 🚀
Type `"My solution Exercise X"` when done!