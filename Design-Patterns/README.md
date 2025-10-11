# 🎯 Design Patterns

## 📋 Overview
Learn industry-standard solutions to common software design problems. Essential for enterprise Java development.

## 🎯 What's Inside

### 📂 Folder Structure
```
Design-Patterns/
├── Creational/     # Object creation patterns
├── Structural/     # Object composition patterns
├── Behavioral/     # Object interaction patterns
└── Examples/       # Real-world applications
```

---

## 🏗️ Creational Patterns
**Focus:** Object creation mechanisms

### Patterns to Master:

#### 1. Singleton Pattern ⭐⭐⭐⭐⭐
**Purpose:** Ensure only one instance exists

**Use Cases:**
- Database connections
- Logger classes
- Configuration managers

**Implementation:**
```java
- Eager initialization
- Lazy initialization
- Thread-safe singleton
- Bill Pugh singleton
```

**When to Use:** Global point of access needed

---

#### 2. Factory Pattern ⭐⭐⭐⭐⭐
**Purpose:** Create objects without specifying exact class

**Use Cases:**
- Shape factory (Circle, Rectangle, Triangle)
- Vehicle factory
- Document creators

**When to Use:** Object creation logic is complex

---

#### 3. Abstract Factory Pattern ⭐⭐⭐⭐
**Purpose:** Family of related objects

**Use Cases:**
- GUI toolkit (Windows/Mac themes)
- Database factory (MySQL/PostgreSQL)

**When to Use:** Multiple families of products

---

#### 4. Builder Pattern ⭐⭐⭐⭐⭐
**Purpose:** Construct complex objects step by step

**Use Cases:**
- StringBuilder in Java
- HTTP request builders
- Meal builders (Burger, Pizza)

**When to Use:** Many optional parameters

---

#### 5. Prototype Pattern ⭐⭐⭐
**Purpose:** Clone existing objects

**Use Cases:**
- Object copying
- Avoid expensive creation

**When to Use:** Object creation is costly

---

## 🏛️ Structural Patterns
**Focus:** Object composition and relationships

### Patterns to Master:

#### 1. Adapter Pattern ⭐⭐⭐⭐⭐
**Purpose:** Make incompatible interfaces work together

**Use Cases:**
- Legacy code integration
- Third-party library adaptation
- Media player adapters

**When to Use:** Interface mismatch

---

#### 2. Decorator Pattern ⭐⭐⭐⭐⭐
**Purpose:** Add behavior dynamically

**Use Cases:**
- Java I/O streams
- Pizza toppings
- Text formatting

**When to Use:** Extend functionality without inheritance

---

#### 3. Proxy Pattern ⭐⭐⭐⭐
**Purpose:** Control access to another object

**Use Cases:**
- Virtual proxy (lazy loading)
- Protection proxy (access control)
- Remote proxy (network objects)

**When to Use:** Control object access

---

#### 4. Facade Pattern ⭐⭐⭐⭐
**Purpose:** Simplified interface to complex subsystem

**Use Cases:**
- Library wrappers
- API simplification
- Home theater system

**When to Use:** Hide complexity

---

#### 5. Bridge Pattern ⭐⭐⭐
**Purpose:** Separate abstraction from implementation

**Use Cases:**
- Device drivers
- Database drivers
- Shape drawing

**When to Use:** Avoid permanent binding

---

#### 6. Composite Pattern ⭐⭐⭐⭐
**Purpose:** Tree structure of objects

**Use Cases:**
- File system (files and folders)
- GUI components
- Organization hierarchy

**When to Use:** Part-whole hierarchies

---

#### 7. Flyweight Pattern ⭐⭐⭐
**Purpose:** Share objects to save memory

**Use Cases:**
- String pool in Java
- Character rendering
- Game objects

**When to Use:** Many similar objects needed

---

## 🎭 Behavioral Patterns
**Focus:** Object communication and responsibilities

### Patterns to Master:

#### 1. Observer Pattern ⭐⭐⭐⭐⭐
**Purpose:** Notify multiple objects of changes

**Use Cases:**
- Event listeners
- MVC architecture
- Newsletter subscriptions
- Stock price notifications

**When to Use:** One-to-many dependency

---

#### 2. Strategy Pattern ⭐⭐⭐⭐⭐
**Purpose:** Select algorithm at runtime

**Use Cases:**
- Payment methods
- Sorting algorithms
- Compression algorithms

**When to Use:** Multiple algorithms for same task

---

#### 3. Command Pattern ⭐⭐⭐⭐
**Purpose:** Encapsulate requests as objects

**Use Cases:**
- Undo/Redo functionality
- Transaction systems
- Remote control

**When to Use:** Parameterize operations

---

#### 4. Iterator Pattern ⭐⭐⭐⭐⭐
**Purpose:** Access elements sequentially

**Use Cases:**
- Collections in Java
- Database result sets
- Custom collections

**When to Use:** Traverse collections uniformly

---

#### 5. State Pattern ⭐⭐⭐⭐
**Purpose:** Change behavior based on state

**Use Cases:**
- Vending machine
- TCP connection
- Order processing

**When to Use:** Object behavior changes with state

---

#### 6. Template Method Pattern ⭐⭐⭐⭐
**Purpose:** Define skeleton, subclasses fill details

**Use Cases:**
- Game template
- Data parsing
- Framework hooks

**When to Use:** Common algorithm structure

---

#### 7. Chain of Responsibility ⭐⭐⭐⭐
**Purpose:** Pass request along chain of handlers

**Use Cases:**
- Exception handling
- Event bubbling
- Approval workflows

**When to Use:** Multiple handlers possible

---

#### 8. Mediator Pattern ⭐⭐⭐
**Purpose:** Reduce coupling between objects

**Use Cases:**
- Chat room
- Air traffic control
- GUI dialogs

**When to Use:** Complex communications

---

#### 9. Memento Pattern ⭐⭐⭐
**Purpose:** Save and restore object state

**Use Cases:**
- Undo functionality
- Save game state
- Transaction rollback

**When to Use:** Need state snapshots

---

#### 10. Visitor Pattern ⭐⭐⭐
**Purpose:** Add operations without modifying classes

**Use Cases:**
- Compiler operations
- Document export
- Shopping cart calculations

**When to Use:** Operations on object structure

---

## 📚 SOLID Principles

### 1. Single Responsibility Principle (SRP)
**Rule:** A class should have only one reason to change
- Each class does one thing well
- Easier to maintain and test

### 2. Open/Closed Principle (OCP)
**Rule:** Open for extension, closed for modification
- Add new features without changing existing code
- Use inheritance and interfaces

### 3. Liskov Substitution Principle (LSP)
**Rule:** Subtypes must be substitutable for base types
- Derived classes must not break behavior
- Maintain inheritance contracts

### 4. Interface Segregation Principle (ISP)
**Rule:** Don't force clients to depend on unused methods
- Many specific interfaces better than one general
- Clients use only what they need

### 5. Dependency Inversion Principle (DIP)
**Rule:** Depend on abstractions, not concretions
- High-level modules shouldn't depend on low-level
- Use interfaces and abstract classes

---

## 🎯 Learning Path

### Phase 1: Creational (Week 1-2)
1. Start with Singleton
2. Then Factory
3. Builder pattern
4. Abstract Factory
5. Prototype

### Phase 2: Structural (Week 3-4)
1. Adapter pattern
2. Decorator pattern
3. Proxy pattern
4. Facade pattern
5. Others as needed

### Phase 3: Behavioral (Week 5-6)
1. Observer pattern
2. Strategy pattern
3. Iterator pattern
4. Command pattern
5. State and Template
6. Others as needed

### Phase 4: Practice (Ongoing)
- Identify patterns in existing code
- Apply in projects
- Refactor old projects using patterns

---

## 📊 Pattern Comparison

| Pattern | Purpose | Use When |
|---------|---------|----------|
| Singleton | One instance | Global access needed |
| Factory | Object creation | Hide creation logic |
| Builder | Complex construction | Many parameters |
| Observer | Notify changes | One-to-many updates |
| Strategy | Algorithm selection | Multiple algorithms |
| Decorator | Add functionality | Dynamic behavior |
| Adapter | Interface conversion | Incompatible interfaces |

---

## 🎯 Practice Projects

### 1. Design Pattern Library
Build a comprehensive library with all patterns implemented

### 2. Logging Framework
Use Singleton, Factory, Strategy patterns

### 3. Game Development
State, Strategy, Command, Observer patterns

### 4. GUI Framework
Composite, Decorator, Observer patterns

### 5. E-commerce System
Factory, Strategy, Observer, State patterns

---

## ✅ Mastery Checklist

### Creational Patterns:
- [ ] Singleton (3+ variations)
- [ ] Factory
- [ ] Abstract Factory
- [ ] Builder
- [ ] Prototype

### Structural Patterns:
- [ ] Adapter
- [ ] Decorator
- [ ] Proxy
- [ ] Facade
- [ ] Bridge
- [ ] Composite
- [ ] Flyweight

### Behavioral Patterns:
- [ ] Observer
- [ ] Strategy
- [ ] Command
- [ ] Iterator
- [ ] State
- [ ] Template Method
- [ ] Chain of Responsibility
- [ ] Mediator
- [ ] Memento
- [ ] Visitor

### SOLID Principles:
- [ ] SRP understood and applied
- [ ] OCP practiced
- [ ] LSP implemented
- [ ] ISP followed
- [ ] DIP applied

---

## 📚 Resources

### Books:
- **"Design Patterns"** - Gang of Four (GoF)
- **"Head First Design Patterns"** - Freeman & Freeman
- **"Clean Code"** - Robert Martin

### Online:
- [Refactoring.Guru](https://refactoring.guru/design-patterns)
- [SourceMaking](https://sourcemaking.com/design_patterns)
- [Java Design Patterns](https://java-design-patterns.com/)

### Videos:
- Derek Banas Design Patterns Series
- Programming with Mosh Design Patterns

---

## 💡 Key Takeaways

1. **Patterns are solutions, not rules** - Know when to use
2. **Don't force patterns** - Use only when beneficial
3. **Understand the problem first** - Pattern comes second
4. **Patterns work together** - Combine multiple patterns
5. **Practice in real projects** - Theory + Practice = Mastery

---

## 🏆 Goals

- [ ] Implement all 23 GoF patterns
- [ ] Apply SOLID in every project
- [ ] Identify patterns in frameworks (Spring, etc.)
- [ ] Refactor old code using patterns
- [ ] Teach patterns to others

---

**Status:** ⬜ Not Started  
**Target:** Master all patterns in 6 weeks  
**Last Updated:** October 2025
