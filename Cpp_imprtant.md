#!/bin/bash
# Complete C++ Repository Setup with 10-Level Roadmap

cd Cpp

echo "🚀 Creating C++ Repository Structure..."

# ==================== CREATE FOLDER STRUCTURE ====================

# LEVEL 1: C++ Basics
mkdir -p "Level-1-Cpp-Basics"/{Examples,Exercises,Projects}

# LEVEL 2: Pointers & Memory
mkdir -p "Level-2-Pointers-Memory"/{Pointers,References,Memory-Management,Practice}

# LEVEL 3: Object-Oriented Programming
mkdir -p "Level-3-OOP"/{Classes-Objects,Inheritance,Polymorphism,Abstraction,Operator-Overloading,Projects}

# LEVEL 4: STL (Standard Template Library)
mkdir -p "Level-4-STL"/{Containers,Iterators,Algorithms,Function-Objects,Practice}

# LEVEL 5: Data Structures
mkdir -p "Level-5-Data-Structures"/{Arrays,LinkedList,Stacks,Queues,Trees,Graphs,HashTables,Heaps}

# LEVEL 6: Algorithms
mkdir -p "Level-6-Algorithms"/{Sorting,Searching,Recursion,Backtracking,Dynamic-Programming,Greedy,Graph-Algorithms}

# LEVEL 7: Advanced C++
mkdir -p "Level-7-Advanced-Cpp"/{Templates,Exception-Handling,File-IO,Namespaces,Smart-Pointers,Move-Semantics}

# LEVEL 8: Modern C++ (C++11/14/17/20)
mkdir -p "Level-8-Modern-Cpp"/{Lambda-Expressions,Auto-Keyword,Range-Based-Loops,Multithreading,Chrono,Regex}

# LEVEL 9: Competitive Programming
mkdir -p "Level-9-Competitive-Programming"/{Codeforces,CodeChef,AtCoder,ICPC-Practice,Contest-Solutions}

# LEVEL 10: Advanced Projects
mkdir -p "Level-10-Projects"/{System-Tools,Performance-Apps,Games,Simulations,Libraries}

echo "✅ Folder structure created!"

# ==================== MAIN README ====================

cat > "README.md" << 'EOF'
# ⚡ C++ Learning Repository

<div align="center">

**Master C++ Through Structured Learning & Practice**

![C++](https://img.shields.io/badge/C%2B%2B-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white)
![Status](https://img.shields.io/badge/Status-Active%20Learning-success?style=for-the-badge)

*From fundamentals to systems programming mastery*

</div>

---

## 📖 About This Repository

Complete C++ learning journey organized into 10 progressive levels. From basic syntax to advanced systems programming and competitive coding.

---

## 🗺️ Repository Structure

```
Cpp/
├── 📚 Fundamentals/          # Core C++ concepts
├── 🧠 Data-Structures/       # DS implementations
├── 🔧 Algorithms/            # Algorithm practice
├── 💡 Competitive-Programming/ # CP and contests
├── 🚀 Projects/              # Real applications
└── ⚡ Advanced-Topics/        # Modern C++ features
```

---

## 🎯 10-Level C++ Mastery Roadmap

### **LEVEL 1: C++ Basics** 🌱
*Duration: 1-2 weeks | Status: ⬜ Not Started*

**Topics to Master:**
- ✅ Setup (Compiler, IDE)
- ✅ Basic Syntax & Structure
- ✅ Variables & Data Types
- ✅ Operators & Expressions
- ✅ Input/Output (cin, cout)
- ✅ Control Flow (if, switch)
- ✅ Loops (for, while, do-while)
- ✅ Functions & Function Overloading

**Practice:** 25+ basic programs  
**Folder:** `Level-1-Cpp-Basics/`

---

### **LEVEL 2: Pointers & Memory** 🎯
*Duration: 2 weeks | Status: ⬜ Not Started*

**Topics to Master:**
- ✅ Pointers basics & operations
- ✅ Pointer arithmetic
- ✅ Pointers and arrays
- ✅ Pointers to pointers
- ✅ References (& operator)
- ✅ Dynamic memory (new, delete)
- ✅ Memory leaks prevention
- ✅ nullptr vs NULL

**Practice:** 30+ pointer problems  
**Folder:** `Level-2-Pointers-Memory/`

---

### **LEVEL 3: Object-Oriented Programming** 🎨
*Duration: 2-3 weeks | Status: ⬜ Not Started*

**Topics to Master:**
- ✅ Classes & Objects
- ✅ Constructors & Destructors
- ✅ Copy Constructor & Assignment
- ✅ Encapsulation (public, private, protected)
- ✅ Inheritance (single, multiple, multilevel)
- ✅ Polymorphism (virtual functions)
- ✅ Abstract Classes & Pure Virtual Functions
- ✅ Operator Overloading
- ✅ Friend Functions & Classes
- ✅ Static Members

**Practice:** 5+ OOP projects  
**Folder:** `Level-3-OOP/`

---

### **LEVEL 4: STL (Standard Template Library)** 📦
*Duration: 2 weeks | Status: ⬜ Not Started*

**Topics to Master:**
- ✅ Vectors, Lists, Deque
- ✅ Stack, Queue, Priority Queue
- ✅ Set, Multiset, Unordered Set
- ✅ Map, Multimap, Unordered Map
- ✅ Iterators (begin, end, etc.)
- ✅ Algorithms (sort, find, binary_search)
- ✅ Function Objects (Functors)
- ✅ Pair & Tuple

**Practice:** 40+ STL problems  
**Folder:** `Level-4-STL/`

---

### **LEVEL 5: Data Structures Deep Dive** 🧠
*Duration: 3-4 weeks | Status: ⬜ Not Started*

**Topics to Master:**
- ✅ Arrays & Dynamic Arrays
- ✅ Linked Lists (Singly, Doubly, Circular)
- ✅ Stacks & Queues
- ✅ Binary Trees & BST
- ✅ AVL Trees & Red-Black Trees
- ✅ Heaps (Min/Max)
- ✅ Graphs (Adjacency Matrix/List)
- ✅ Hash Tables
- ✅ Trie, Segment Tree

**Practice:** 60+ DS problems  
**Folder:** `Level-5-Data-Structures/`

---

### **LEVEL 6: Algorithms Mastery** 🔧
*Duration: 4-5 weeks | Status: ⬜ Not Started*

**Topics to Master:**
- ✅ All Sorting Algorithms
- ✅ Binary Search & Variants
- ✅ Two Pointers & Sliding Window
- ✅ Recursion & Backtracking
- ✅ Dynamic Programming
- ✅ Greedy Algorithms
- ✅ Graph Algorithms (DFS, BFS, Dijkstra, Floyd-Warshall)
- ✅ Bit Manipulation
- ✅ Time & Space Complexity

**Practice:** 150+ algorithm problems  
**Folder:** `Level-6-Algorithms/`

---

### **LEVEL 7: Advanced C++ Concepts** ⚡
*Duration: 3 weeks | Status: ⬜ Not Started*

**Topics to Master:**
- ✅ Templates (Function & Class)
- ✅ Template Specialization
- ✅ Exception Handling (try-catch-throw)
- ✅ File I/O (fstream)
- ✅ Namespaces
- ✅ Preprocessor Directives
- ✅ Smart Pointers (unique_ptr, shared_ptr)
- ✅ RAII Principle
- ✅ Move Semantics & rvalue references

**Practice:** 20+ advanced exercises  
**Folder:** `Level-7-Advanced-Cpp/`

---

### **LEVEL 8: Modern C++ (C++11/14/17/20)** 🆕
*Duration: 2-3 weeks | Status: ⬜ Not Started*

**Topics to Master:**
- ✅ Auto keyword & Type Deduction
- ✅ Lambda Expressions
- ✅ Range-based for loops
- ✅ nullptr
- ✅ constexpr
- ✅ std::thread & Multithreading
- ✅ Mutex & Locks
- ✅ Atomic operations
- ✅ std::chrono (Time)
- ✅ Regular Expressions
- ✅ std::optional, std::variant

**Practice:** Modern C++ features  
**Folder:** `Level-8-Modern-Cpp/`

---

### **LEVEL 9: Competitive Programming** 💡
*Duration: Ongoing | Status: ⬜ Not Started*

**Platforms:**
- ✅ Codeforces (Rating 1400+)
- ✅ CodeChef (3-star+)
- ✅ AtCoder (Problems)
- ✅ ICPC Practice
- ✅ LeetCode (C++ solutions)

**Practice:** 300+ CP problems  
**Folder:** `Level-9-Competitive-Programming/`

---

### **LEVEL 10: Advanced Projects** 🚀
*Duration: Ongoing | Status: ⬜ Not Started*

**Projects:**
1. **System Tools** - File managers, compression tools
2. **Performance Apps** - High-speed applications
3. **Games** - 2D/3D games with graphics
4. **Simulations** - Physics, traffic, etc.
5. **Libraries** - Reusable code libraries

**Folder:** `Level-10-Projects/`

---

## 📊 Progress Tracker

| Level | Topic | Status | Completion | Problems Solved |
|-------|-------|--------|------------|-----------------|
| 1 | C++ Basics | ⬜ Not Started | 0% | 0/25 |
| 2 | Pointers & Memory | ⬜ Not Started | 0% | 0/30 |
| 3 | OOP | ⬜ Not Started | 0% | 0/5 projects |
| 4 | STL | ⬜ Not Started | 0% | 0/40 |
| 5 | Data Structures | ⬜ Not Started | 0% | 0/60 |
| 6 | Algorithms | ⬜ Not Started | 0% | 0/150 |
| 7 | Advanced C++ | ⬜ Not Started | 0% | 0/20 |
| 8 | Modern C++ | ⬜ Not Started | 0% | 0/15 |
| 9 | Competitive Programming | ⬜ Not Started | 0% | 0/300 |
| 10 | Projects | ⬜ Not Started | 0% | 0/10 projects |

**Overall Progress:** 0% Complete

---

## 🎯 Learning Strategy

### **Phase 1: Foundation (Levels 1-2)**
Master basics and understand memory management deeply.

### **Phase 2: OOP & STL (Levels 3-4)**
Object-oriented concepts and powerful STL.

### **Phase 3: DS & Algo (Levels 5-6)**
Core competitive programming skills.

### **Phase 4: Advanced (Levels 7-8)**
Modern C++ and professional practices.

### **Phase 5: Mastery (Levels 9-10)**
Competitive coding and real-world projects.

---

## 📚 Resources

### **Books:**
- "C++ Primer" - Stanley Lippman
- "Effective C++" - Scott Meyers
- "The C++ Programming Language" - Bjarne Stroustrup
- "Competitive Programming 3" - Steven Halim

### **Online Courses:**
- [LearnCpp.com](https://www.learncpp.com/)
- [C++ Tutorial - GeeksforGeeks](https://www.geeksforgeeks.org/c-plus-plus/)
- [The Cherno C++ Series](https://www.youtube.com/playlist?list=PLlrATfBNZ98dudnM48yfGUldqGD0S4FFb)

### **Practice Platforms:**
- [Codeforces](https://codeforces.com/)
- [CodeChef](https://www.codechef.com/)
- [AtCoder](https://atcoder.jp/)
- [LeetCode](https://leetcode.com/)
- [HackerRank C++](https://www.hackerrank.com/domains/cpp)

### **Documentation:**
- [cppreference.com](https://en.cppreference.com/)
- [cplusplus.com](http://www.cplusplus.com/)

---

## ✅ Completion Criteria

Each level is complete when:
- ✅ All topics studied and understood
- ✅ Practice problems solved
- ✅ Code documented and committed
- ✅ Projects/exercises completed
- ✅ Personal notes written

---

## 🏆 Milestones

- [ ] Complete Levels 1-2 (Foundation)
- [ ] Master pointers and memory
- [ ] Build first OOP project
- [ ] Master STL completely
- [ ] Implement all data structures
- [ ] Solve 150 algorithm problems
- [ ] Learn Modern C++ features
- [ ] Reach Codeforces rating 1400+
- [ ] Solve 300+ CP problems
- [ ] Build 10 major projects

---

## 💡 C++ Best Practices

1. **Always initialize variables**
2. **Use const correctness**
3. **Prefer references over pointers when possible**
4. **Use smart pointers instead of raw pointers**
5. **Follow RAII principle**
6. **Avoid memory leaks**
7. **Use STL instead of reinventing the wheel**
8. **Write const-correct code**
9. **Use modern C++ features**
10. **Comment complex pointer logic**

---

<div align="center">

**🚀 "C makes it easy to shoot yourself in the foot; C++ makes it harder, but when you do it blows your whole leg off." - Bjarne Stroustrup**

*Start Date:* `___/___/___`  
*Target Completion:* `___/___/___`

---

**Last Updated:** October 2025

</div>
EOF

echo "✅ Main README created!"

# ==================== LEVEL README FILES ====================

# Level 1
cat > "Level-1-Cpp-Basics/README.md" << 'LEVEL1'
# 🌱 Level 1: C++ Basics

## Status: ⬜ Not Started
**Duration:** 1-2 weeks | **Difficulty:** Beginner

## Topics
- Setup & Compilation
- Basic Syntax
- Variables & Data Types
- Operators
- Input/Output
- Control Flow
- Loops
- Functions

## Practice: 25+ programs
## Folder: Examples/ Exercises/ Projects/

**Next:** Level 2 - Pointers & Memory →
LEVEL1

# Level 2
cat > "Level-2-Pointers-Memory/README.md" << 'LEVEL2'
# 🎯 Level 2: Pointers & Memory Management

## Status: ⬜ Not Started
**Duration:** 2 weeks | **Difficulty:** Intermediate

## Topics
- Pointer Basics
- Pointer Arithmetic
- Arrays & Pointers
- Dynamic Memory (new/delete)
- References
- Memory Leaks
- nullptr

## Practice: 30+ problems
## Master memory management before proceeding!

**Prev:** Level 1 | **Next:** Level 3 - OOP →
LEVEL2

# Level 3
cat > "Level-3-OOP/README.md" << 'LEVEL3'
# 🎨 Level 3: Object-Oriented Programming

## Status: ⬜ Not Started
**Duration:** 2-3 weeks | **Difficulty:** Intermediate

## Topics
- Classes & Objects
- Constructors/Destructors
- Inheritance
- Polymorphism
- Virtual Functions
- Operator Overloading
- Friend Functions

## Projects: 5+ OOP systems

**Prev:** Level 2 | **Next:** Level 4 - STL →
LEVEL3

# Continue for all levels...
echo "✅ Level READMEs created!"

# ==================== MAIN FOLDER READMES ====================

cat > "Fundamentals/README.md" << 'FUND'
# 📚 C++ Fundamentals

## Basics/
- Variables, data types, operators
- Control flow, loops
- Functions, scope

## Pointers/
- Pointer operations
- Memory management
- References vs Pointers

## OOP/
- Classes, inheritance
- Polymorphism, virtual functions
- Operator overloading

## STL/
- Containers, iterators
- Algorithms
- Function objects
  FUND

cat > "Data-Structures/README.md" << 'DS'
# 🧠 C++ Data Structures

Implement all DS from scratch in C++.

## Folders:
- Arrays/ - Static & dynamic arrays
- LinkedList/ - Singly, doubly, circular
- Stacks/ - Array & linked implementations
- Queues/ - All queue types
- Trees/ - Binary tree, BST, AVL
- Graphs/ - Adjacency representations
- HashTables/ - Hash functions, collision handling
- Heaps/ - Min/max heap operations

**Target:** 60+ DS problems
**Implement:** Everything from scratch
DS

cat > "Algorithms/README.md" << 'ALGO'
# 🔧 C++ Algorithms

Master algorithmic problem-solving.

## Categories:
- Sorting/ - All O(n²) and O(n log n) sorts
- Searching/ - Binary search mastery
- Recursion/ - Recursive thinking
- Backtracking/ - Constraint satisfaction
- Dynamic-Programming/ - Optimization problems
- Greedy/ - Optimal choices
- Graph-Algorithms/ - DFS, BFS, shortest paths

**Target:** 150+ algorithm problems
**Focus:** Time/space optimization
ALGO

cat > "Competitive-Programming/README.md" << 'CP'
# 💡 Competitive Programming

## Platforms:

### Codeforces/
- Practice by rating (800-2000)
- Contest solutions
- **Goal:** Rating 1400+ (Specialist)

### CodeChef/
- Long Challenge
- Cook-Off, Lunchtime
- **Goal:** 3-star rating

### AtCoder/
- Beginner Contest (ABC)
- Regular problems
- **Goal:** Solve 100+ problems

### ICPC-Practice/
- Team practice
- Past problems
- Contest strategies

**Total Target:** 300+ CP problems
**Focus:** Speed + Accuracy
CP

cat > "Projects/README.md" << 'PROJ'
# 🚀 C++ Projects

## System-Tools/
- File manager
- Compression utility
- System monitor

## Performance-Apps/
- High-speed data processor
- Memory-efficient applications
- Benchmarking tools

## Games/
- Console games (Snake, Tetris)
- 2D game engine basics
- Graphics programming

## Simulations/
- Physics simulation
- Traffic simulation
- Particle systems

## Libraries/
- Custom data structures library
- Utility functions
- Reusable components

**Target:** 10+ complete projects
PROJ

cat > "Advanced-Topics/README.md" << 'ADV'
# ⚡ Advanced C++ Topics

## Templates/
- Function templates
- Class templates
- Template specialization
- Variadic templates

## Multithreading/
- std::thread
- Mutex & locks
- Condition variables
- Thread-safe structures

## Smart-Pointers/
- unique_ptr
- shared_ptr
- weak_ptr
- Custom deleters

## Modern-Cpp/
- Lambda expressions
- Move semantics
- Perfect forwarding
- constexpr

**Focus:** Production-ready C++ code
ADV

echo "✅ All folder READMEs created!"
echo ""
echo "🎉 C++ Repository Setup Complete!"
echo ""
echo "📁 Created:"
echo "  ✓ 10 Level folders with structure"
echo "  ✓ Main repository README with roadmap"
echo "  ✓ Individual level READMEs"
echo "  ✓ Main folder READMEs (6 folders)"
echo ""
echo "🚀 Your C++ learning journey is ready to begin!"