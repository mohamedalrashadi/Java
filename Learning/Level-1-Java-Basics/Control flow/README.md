# #07 & #09 JAVA – Control Flow (if-else + Switch)

---

## 1️⃣ TOPIC INTRODUCTION

### What is Control Flow?
By default Java runs code **line by line top to bottom**. Control Flow lets you **make decisions** — run different code based on conditions.

### Why is it important?
- Every real program makes decisions
- Login systems, games, calculators all use it
- Without it your program does the same thing every time

### Real World Analogy:
```
IF it is raining
    take an umbrella
ELSE IF it is cloudy
    take a jacket
ELSE
    wear a t-shirt
```

---

## 2️⃣ IF - ELSE FAMILY

### Basic Structure:

```java
// 1️⃣ Simple IF
if (condition) {
    // runs ONLY if condition is true
}

// 2️⃣ IF - ELSE
if (condition) {
    // runs if TRUE
} else {
    // runs if FALSE
}

// 3️⃣ IF - ELSE IF - ELSE
if (condition1) {
    // runs if condition1 is TRUE
} else if (condition2) {
    // runs if condition2 is TRUE
} else {
    // runs if ALL conditions are FALSE
}
```

---

## 📋 RELATIONAL OPERATORS (used in conditions)

| Operator | Meaning | Example | Result |
|----------|---------|---------|--------|
| `==` | Equal to | `5 == 5` | true |
| `!=` | Not equal to | `5 != 3` | true |
| `>` | Greater than | `10 > 5` | true |
| `<` | Less than | `3 < 7` | true |
| `>=` | Greater or equal | `5 >= 5` | true |
| `<=` | Less or equal | `4 <= 3` | false |

## 📋 LOGICAL OPERATORS (combine conditions)

| Operator | Meaning | Example |
|----------|---------|---------|
| `&&` | AND — both must be true | `age > 18 && hasID` |
| `\|\|` | OR — at least one true | `isAdmin \|\| isOwner` |
| `!` | NOT — flips the result | `!isLoggedIn` |

---

## 3️⃣ IF-ELSE EXAMPLES

### Example 1 — Simple if-else:
```java
public class AgeCheck {
    public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {
            System.out.println("You are an ADULT ✅");
        } else {
            System.out.println("You are a MINOR ❌");
        }
    }
}
```
**Output:**
```
You are an ADULT ✅
```

---

### Example 2 — if / else-if / else (Grade System):
```java
public class GradeSystem {
    public static void main(String[] args) {

        int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A ⭐");
        } else if (score >= 80) {
            System.out.println("Grade: B ✅");
        } else if (score >= 70) {
            System.out.println("Grade: C ⚠️");
        } else if (score >= 60) {
            System.out.println("Grade: D 📉");
        } else {
            System.out.println("Grade: F ❌");
        }
    }
}
```
**Output:**
```
Grade: B ✅
```

---

### Example 3 — Logical Operators (&&, ||):
```java
public class LoginCheck {
    public static void main(String[] args) {

        String username = "admin";
        String password = "java123";
        boolean isActive = true;

        // && → ALL conditions must be true
        if (username.equals("admin") && password.equals("java123") && isActive) {
            System.out.println("✅ Login successful! Welcome, admin.");
        } else {
            System.out.println("❌ Login failed. Check credentials.");
        }

        // || → at least ONE condition must be true
        int age = 16;
        boolean hasParentConsent = true;

        if (age >= 18 || hasParentConsent) {
            System.out.println("✅ Access granted.");
        } else {
            System.out.println("❌ Access denied.");
        }
    }
}
```
**Output:**
```
✅ Login successful! Welcome, admin.
✅ Access granted.
```

---

### Example 4 — Nested if-else:
```java
public class NestedIfDemo {
    public static void main(String[] args) {

        int age    = 25;
        boolean hasLicense = true;
        boolean hasCar     = true;

        if (age >= 18) {
            System.out.println("Old enough to drive ✅");

            if (hasLicense) {
                System.out.println("Has a license ✅");

                if (hasCar) {
                    System.out.println("Has a car ✅");
                    System.out.println("🚗 You can drive!");
                } else {
                    System.out.println("No car ❌ — rent one");
                }
            } else {
                System.out.println("No license ❌ — get one first");
            }
        } else {
            System.out.println("Too young to drive ❌");
        }
    }
}
```
**Output:**
```
Old enough to drive ✅
Has a license ✅
Has a car ✅
🚗 You can drive!
```

---

## 4️⃣ TERNARY OPERATOR

A **shortcut** for simple if-else in one line:

```java
// Normal if-else
if (age >= 18) {
    status = "Adult";
} else {
    status = "Minor";
}

// Same thing with ternary ✅
String status = (age >= 18) ? "Adult" : "Minor";
//               condition     true      false
```

### More Examples:
```java
public class TernaryDemo {
    public static void main(String[] args) {

        int score = 75;
        int a     = 10;
        int b     = 20;

        // Ternary for pass/fail
        String result = (score >= 60) ? "PASS ✅" : "FAIL ❌";
        System.out.println("Result: " + result);

        // Ternary for max number
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max);

        // Ternary inside printf
        System.out.printf("Score %d is %s%n",
                score, (score >= 90) ? "Excellent" : "Keep trying");
    }
}
```
**Output:**
```
Result: PASS ✅
Max: 20
Score 75 is Keep trying
```

---

## 5️⃣ SWITCH STATEMENT

Use switch when you have **one variable** with **many specific values**:

### Basic Structure:
```java
switch (variable) {
    case value1:
        // code for value1
        break;         // ← VERY IMPORTANT! stops here
    case value2:
        // code for value2
        break;
    case value3:
        // code for value3
        break;
    default:           // like 'else' — runs if nothing matches
        // code if no case matches
        break;
}
```

---

### Example 1 — Day of Week:
```java
public class DayOfWeek {
    public static void main(String[] args) {

        int day = 3;  // 1=Mon, 2=Tue, 3=Wed...

        switch (day) {
            case 1:
                System.out.println("Monday 😴");
                break;
            case 2:
                System.out.println("Tuesday 📚");
                break;
            case 3:
                System.out.println("Wednesday 💻");
                break;
            case 4:
                System.out.println("Thursday 🔥");
                break;
            case 5:
                System.out.println("Friday 🎉");
                break;
            case 6:
                System.out.println("Saturday 😎");
                break;
            case 7:
                System.out.println("Sunday 😴");
                break;
            default:
                System.out.println("Invalid day ❌");
                break;
        }
    }
}
```
**Output:**
```
Wednesday 💻
```

---

### Example 2 — Switch with String:
```java
public class SeasonSwitch {
    public static void main(String[] args) {

        String season = "Summer";

        switch (season) {
            case "Spring":
                System.out.println("🌸 Flowers are blooming!");
                break;
            case "Summer":
                System.out.println("☀️  Stay hydrated!");
                break;
            case "Autumn":
                System.out.println("🍂 Leaves are falling!");
                break;
            case "Winter":
                System.out.println("❄️  It's cold outside!");
                break;
            default:
                System.out.println("❓ Unknown season");
                break;
        }
    }
}
```
**Output:**
```
☀️  Stay hydrated!
```

---

### ⚠️ WHAT HAPPENS WITHOUT break? (Fall-through)
```java
public class FallThrough {
    public static void main(String[] args) {

        int num = 2;

        switch (num) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");   // starts here
            case 3:
                System.out.println("Three"); // falls through!
            case 4:
                System.out.println("Four");  // falls through!
                break;                       // stops here
            case 5:
                System.out.println("Five");
        }
    }
}
```
**Output:**
```
Two
Three
Four
```
> ⚠️ Without `break`, Java keeps running ALL cases below the match. **Always add `break`** unless you want this behavior!

---

### Example 3 — Switch with Scanner (Interactive):
```java
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULATOR MENU ===");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("\nChoose operation (1-4): ");

        int choice = sc.nextInt();

        System.out.print("Enter number 1: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter number 2: ");
        double num2 = sc.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                break;
            case 2:
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
                break;
            case 3:
                result = num1 * num2;
                System.out.printf("%.2f × %.2f = %.2f%n", num1, num2, result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("%.2f ÷ %.2f = %.2f%n", num1, num2, result);
                } else {
                    System.out.println("❌ Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("❌ Invalid choice!");
                break;
        }

        sc.close();
    }
}
```
**Input:**
```
Choose operation (1-4): 1
Enter number 1: 15.5
Enter number 2: 4.5
```
**Output:**
```
15.50 + 4.50 = 20.00
```

---

## 6️⃣ IF-ELSE vs SWITCH — When to Use Which?

| Situation | Use |
|-----------|-----|
| Range checks (`score >= 90`) | `if-else` |
| Complex conditions (`&&`, `\|\|`) | `if-else` |
| Exact value matches | `switch` |
| Menu options (1, 2, 3...) | `switch` |
| Days, months, seasons | `switch` |
| Simple true/false | `ternary` |

---

## 7️⃣ EXERCISES

### ✅ EASY Level

#### Exercise 1: Positive / Negative / Zero
**Task:** Ask user for a number. Print whether it's positive, negative, or zero.

**Input/Output:**
```
Enter a number: -7
The number is NEGATIVE
```

---

#### Exercise 2: Even or Odd
**Task:** Ask user for an integer. Check if it's even or odd.
**Hint:** Use `%` (modulus) operator. Even numbers have remainder 0 when divided by 2.

**Input/Output:**
```
Enter a number: 8
8 is EVEN
```

---

#### Exercise 3: Day Name (Switch)
**Task:** Ask user to enter a number (1–7). Print the day name using switch.

**Input/Output:**
```
Enter day number (1-7): 5
Day 5 is: Friday
```

---

### 🔶 MEDIUM Level

#### Exercise 4: Grade Calculator
**Task:** Ask user for a score (0–100). Print the letter grade AND a message.

| Score | Grade | Message |
|-------|-------|---------|
| 90–100 | A | Excellent! |
| 80–89 | B | Great job! |
| 70–79 | C | Good work! |
| 60–69 | D | Need improvement |
| 0–59 | F | Failed |

**Input/Output:**
```
Enter your score: 87
Grade : B
Message: Great job!
```

---

#### Exercise 5: Leap Year Checker
**Task:** Ask user for a year. Check if it's a leap year.

**Rules:**
- Divisible by 4 → leap year
- BUT divisible by 100 → NOT a leap year
- UNLESS also divisible by 400 → IS a leap year

**Input/Output:**
```
Enter a year: 2000
2000 is a LEAP YEAR 🗓️
```

---

#### Exercise 6: Season Finder (Switch)
**Task:** Ask user for a month number (1–12). Print the season using switch.

| Months | Season |
|--------|--------|
| 12, 1, 2 | Winter ❄️ |
| 3, 4, 5 | Spring 🌸 |
| 6, 7, 8 | Summer ☀️ |
| 9, 10, 11 | Autumn 🍂 |

**Hint:** Multiple cases can share the same code block!

**Input/Output:**
```
Enter month number: 7
Season: Summer ☀️
```

---

### 🔴 HARD Level

#### Exercise 7: ATM Machine
**Task:** Simulate a simple ATM. Ask user for:
- PIN (correct PIN is 1234)
- If correct → show menu (Check Balance / Deposit / Withdraw)
- If wrong PIN → show error

**Input/Output:**
```
Enter PIN: 1234
✅ PIN Correct!

=== ATM MENU ===
1. Check Balance
2. Deposit
3. Withdraw
Choose: 1
Your balance is: $1000.00
```

---

#### Exercise 8: Triangle Type Checker
**Task:** Ask user for 3 sides of a triangle. Determine:
- Is it a valid triangle? (sum of any two sides > third side)
- If valid: Equilateral / Isosceles / Scalene

**Input/Output:**
```
Enter side 1: 5
Enter side 2: 5
Enter side 3: 5
Valid Triangle: YES ✅
Type: Equilateral 🔺
```

---

#### Exercise 9: Smart Ticket Pricing
**Task:** A cinema charges different prices. Ask for age and day. Calculate ticket price.

| Condition | Price |
|-----------|-------|
| Child (under 12) | $5.00 |
| Senior (60+) | $6.00 |
| Weekday (Mon–Fri) + Adult | $10.00 |
| Weekend (Sat–Sun) + Adult | $14.00 |
| Student (12–25) any day | $8.00 |

**Input/Output:**
```
Enter age: 20
Are you a student? (true/false): true
Enter day (e.g. Monday): Saturday

Ticket Price: $8.00 (Student discount applied)
```

---

## 💡 KEY TAKEAWAYS

1. `if-else` is for **ranges and complex conditions**
2. `switch` is for **exact value matching**
3. **Always add `break`** in switch cases
4. `default` in switch = `else` in if-else
5. **Ternary** is a one-line shortcut for simple if-else
6. `&&` = both true, `||` = one true, `!` = flip result

---

**Pick an exercise and start coding!** 🚀
Type `"My solution Exercise X"` to share your code for review!