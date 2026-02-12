# 🎯 VARIABLES AND DATA TYPES - Practice & Learning

Perfect! Let's do a complete deep dive into Variables and Data Types with hands-on practice.

---

## 📘 PART 1: COMPLETE THEORY

### What is a Variable?

A **variable** is a named storage location in memory that holds a value. Think of it like a labeled box:

```
📦 Box Label: "age"
   Contents: 25
```

### Variable Declaration Rules:

✅ **Valid Names:**
```java
int age;
int studentAge;
int student_age;
int _age;
int $age;
int age2;
```

❌ **Invalid Names:**
```java
int 2age;          // Can't start with number
int student-age;   // No hyphens allowed
int class;         // Can't use Java keywords
int student age;   // No spaces allowed
```

### Naming Conventions (Best Practices):
```java
int studentAge;      // ✅ camelCase (recommended)
int StudentAge;      // ❌ PascalCase (used for class names)
int student_age;     // ⚠️ snake_case (not common in Java)
int STUDENT_AGE;     // ⚠️ UPPER_CASE (used for constants)
```

---

## 📊 PART 2: ALL DATA TYPES IN DETAIL

### 🔢 INTEGER TYPES

| Type | Size | Range | Example |
|------|------|-------|---------|
| `byte` | 8-bit | -128 to 127 | `byte age = 25;` |
| `short` | 16-bit | -32,768 to 32,767 | `short year = 2024;` |
| `int` | 32-bit | -2 billion to 2 billion | `int population = 1000000;` |
| `long` | 64-bit | Very large numbers | `long distance = 123456789L;` |

**Example Program:**
```java
public class IntegerTypes {
    public static void main(String[] args) {
        byte level = 100;           // Good for small numbers
        short students = 5000;      // Good for medium numbers
        int salary = 50000;         // Most commonly used
        long worldPopulation = 8000000000L; // Note the 'L' suffix
        
        System.out.println("Level: " + level);
        System.out.println("Students: " + students);
        System.out.println("Salary: " + salary);
        System.out.println("World Population: " + worldPopulation);
    }
}
```

**Output:**
```
Level: 100
Students: 5000
Salary: 50000
World Population: 8000000000
```

---

### 🔢 FLOATING-POINT TYPES

| Type | Size | Precision | Example |
|------|------|-----------|---------|
| `float` | 32-bit | ~7 decimal digits | `float price = 10.99f;` |
| `double` | 64-bit | ~15 decimal digits | `double pi = 3.14159265359;` |

**Example Program:**
```java
public class FloatingTypes {
    public static void main(String[] args) {
        float temperature = 36.6f;      // Note the 'f' suffix
        double piValue = 3.14159265359; // No suffix needed
        
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Pi value: " + piValue);
        
        // Showing precision difference
        float f = 1.123456789f;
        double d = 1.123456789;
        
        System.out.println("Float:  " + f);  // Less precise
        System.out.println("Double: " + d);  // More precise
    }
}
```

**Output:**
```
Temperature: 36.6°C
Pi value: 3.14159265359
Float:  1.1234568
Double: 1.123456789
```

---

### 🔤 CHARACTER TYPE

```java
public class CharacterType {
    public static void main(String[] args) {
        char grade = 'A';           // Single quotes for char
        char symbol = '@';
        char digit = '9';           // Character, not number
        char unicode = '\u0041';    // Unicode for 'A'
        
        System.out.println("Grade: " + grade);
        System.out.println("Symbol: " + symbol);
        System.out.println("Digit: " + digit);
        System.out.println("Unicode: " + unicode);
        
        // Characters can be used in arithmetic (ASCII values)
        char letter = 'A';
        System.out.println("Next letter: " + (char)(letter + 1)); // Prints 'B'
    }
}
```

**Output:**
```
Grade: A
Symbol: @
Digit: 9
Unicode: A
Next letter: B
```

---

### ✅ BOOLEAN TYPE

```java
public class BooleanType {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        
        System.out.println("Java is fun: " + isJavaFun);
        System.out.println("Fish is tasty: " + isFishTasty);
        
        // Booleans from comparisons
        int age = 20;
        boolean isAdult = (age >= 18);
        System.out.println("Is adult: " + isAdult);
        
        // Booleans in conditions (we'll learn more later)
        if (isJavaFun) {
            System.out.println("Keep learning Java!");
        }
    }
}
```

**Output:**
```
Java is fun: true
Fish is tasty: false
Is adult: true
Keep learning Java!
```

---

### 📝 STRING TYPE (Special - Not Primitive)

```java
public class StringType {
    public static void main(String[] args) {
        String name = "John Doe";           // Double quotes for String
        String greeting = "Hello, World!";
        String empty = "";                  // Empty string
        
        System.out.println(name);
        System.out.println(greeting);
        
        // String concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);
        
        // String with numbers
        String message = "I am " + 25 + " years old";
        System.out.println(message);
        
        // String length
        System.out.println("Name length: " + name.length());
    }
}
```

**Output:**
```
John Doe
Hello, World!
Full name: John Doe
I am 25 years old
Name length: 8
```

---

## 🔄 PART 3: TYPE CASTING

### Implicit Casting (Automatic - Widening)
```java
public class ImplicitCasting {
    public static void main(String[] args) {
        // Smaller to larger type (automatic)
        byte b = 10;
        int i = b;          // byte → int
        long l = i;         // int → long
        float f = l;        // long → float
        double d = f;       // float → double
        
        System.out.println("byte: " + b);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
    }
}
```

### Explicit Casting (Manual - Narrowing)
```java
public class ExplicitCasting {
    public static void main(String[] args) {
        // Larger to smaller type (manual casting required)
        double d = 9.78;
        int i = (int) d;    // Explicit cast - loses decimal part
        
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);    // Prints 9 (decimal lost)
        
        // Be careful with range
        int largeNumber = 130;
        byte b = (byte) largeNumber;  // May lose data
        System.out.println("Byte: " + b);  // Unexpected result!
        
        // Char to int
        char letter = 'A';
        int asciiValue = letter;      // Implicit
        System.out.println("ASCII of A: " + asciiValue);  // 65
    }
}
```

---

## 🎓 PART 4: PRACTICE EXERCISES WITH SOLUTIONS

### ✅ EASY LEVEL

#### **Exercise 1: Variable Declaration & Initialization**

**Task:** Declare and initialize variables for:
- Your name (String)
- Your age (int)
- Your height in meters (double)
- Your grade (char)
- Whether you're a student (boolean)

Then print all of them.

**My Solution:**
```java
public class Exercise1 {
    public static void main(String[] args) {
        // Declare and initialize variables
        String name = "Ali Hassan";
        int age = 22;
        double height = 1.75;
        char grade = 'A';
        boolean isStudent = true;
        
        // Print all variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + isStudent);
    }
}
```

**Output:**
```
Name: Ali Hassan
Age: 22
Height: 1.75 meters
Grade: A
Student: true
```

**Now you try!** Write this program yourself and share your code.

---

#### **Exercise 2: Basic Arithmetic**

**Task:** Create two integers (a = 20, b = 8). Calculate and print:
- Sum
- Difference
- Product
- Quotient
- Remainder

**Template for you:**
```java
public class Exercise2 {
    public static void main(String[] args) {
        // Your code here
        int a = 20;
        int b = 8;
        
        // Calculate sum, difference, product, quotient, remainder
        // Print each result
    }
}
```

**Expected Output:**
```
Sum: 28
Difference: 12
Product: 160
Quotient: 2
Remainder: 4
```

**Try this yourself now!**

---

#### **Exercise 3: String Concatenation**

**Task:** Create variables for:
- First name: "John"
- Last name: "Doe"
- Age: 25
- City: "New York"

Print: "My name is John Doe, I am 25 years old, and I live in New York."

**Template:**
```java
public class Exercise3 {
    public static void main(String[] args) {
        // Declare variables
        
        // Concatenate and print the message
    }
}
```

---

### 🔶 MEDIUM LEVEL

#### **Exercise 4: Temperature Converter**

**Task:** Convert temperature from Celsius to Fahrenheit.
- Formula: F = (C × 9/5) + 32
- Use celsius = 25.0

**Template:**
```java
public class Exercise4 {
    public static void main(String[] args) {
        double celsius = 25.0;
        
        // Calculate fahrenheit
        
        // Print both temperatures
    }
}
```

**Expected Output:**
```
25.0°C = 77.0°F
```

---

#### **Exercise 5: Circle Calculations**

**Task:** Given radius = 7.0, calculate:
- Circumference = 2 × π × r
- Area = π × r²

Use `Math.PI` for π.

**Template:**
```java
public class Exercise5 {
    public static void main(String[] args) {
        double radius = 7.0;
        
        // Calculate circumference and area
        
        // Print results
    }
}
```

---

#### **Exercise 6: Type Casting Practice**

**Task:**
1. Create a double variable: price = 19.99
2. Cast it to int and store in a new variable
3. Print both values
4. Create an int: marks = 95
5. Cast it to double
6. Print both

**Template:**
```java
public class Exercise6 {
    public static void main(String[] args) {
        // Part 1: double to int
        
        // Part 2: int to double
    }
}
```

---

### 🔴 HARD LEVEL

#### **Exercise 7: Swap Two Variables**

**Task:** Swap two numbers WITHOUT using a third variable.
- Initial: a = 10, b = 20
- Final: a = 20, b = 10

**Hint:** Use arithmetic operations.

**Template:**
```java
public class Exercise7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        // Swap logic here (no third variable!)
        
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
```

---

#### **Exercise 8: Time Breakdown**

**Task:** Given total seconds = 3725, break it down into:
- Hours
- Minutes
- Seconds

**Formula:**
- hours = totalSeconds / 3600
- minutes = (totalSeconds % 3600) / 60
- seconds = totalSeconds % 60

**Template:**
```java
public class Exercise8 {
    public static void main(String[] args) {
        int totalSeconds = 3725;
        
        // Calculate hours, minutes, seconds
        
        // Print in format: "1 hours, 2 minutes, 5 seconds"
    }
}
```

---

#### **Exercise 9: ASCII Art**

**Task:** Use char variables to print your initials in large letters.

Example for "AB":
```
  A      BBBB
 A A     B   B
AAAAA    BBBB
A   A    B   B
A   A    BBBB
```

**Template:**
```java
public class Exercise9 {
    public static void main(String[] args) {
        // Use println to create ASCII art with your initials
    }
}
```

---

## 📝 SUBMISSION GUIDELINES

**For each exercise:**
1. Write the complete program
2. Run it and verify the output
3. Share your code with me
4. I'll review and provide feedback

**Start with Exercise 1, 2, and 3 (Easy level).**

**When you're ready, type:**
- `"My solution for Exercise 1"` (then paste your code)
- `"Need help with Exercise X"`
- `"Show me solution for Exercise X"`

---

🚀 **Ready? Start coding Exercise 1 now and show me what you've got!**