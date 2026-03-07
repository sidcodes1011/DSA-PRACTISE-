# Backtracking

## 📌 Definition
Backtracking is an algorithmic technique used to solve problems by **building a solution step-by-step and removing choices (backtracking) if they lead to a dead end**.  
It systematically explores all possible configurations and abandons a path as soon as it determines that the path cannot lead to a valid solution.

In simple terms, backtracking means:
> **Try → Check → If it fails → Undo (Backtrack) → Try another option**

---

## ⚙️ Short Process

The general process of backtracking follows these steps:

1. **Choose** – Select a possible option.
2. **Explore** – Move forward with the chosen option.
3. **Check** – If the solution becomes invalid, stop exploring.
4. **Backtrack** – Undo the last choice.
5. **Try another option** – Continue until all possibilities are explored.

This approach is often implemented using **recursion**.

---

## 🧠 Common Problems Using Backtracking

Some classic problems solved using backtracking include:

- N-Queens Problem
- Sudoku Solver
- Rat in a Maze
- Permutations and Combinations
- Subset Generation
- Word Search

---

## 🌍 Real Life Example

### 🔐 Password Cracking (Brute Force)
Imagine trying to guess a password:

1. Try a possible character.
2. Move to the next character.
3. If the combination is wrong, go back and change the previous character.
4. Continue until the correct password is found.

This process of **trying possibilities and reverting incorrect attempts** is similar to backtracking.

### 🧩 Maze Solving
When solving a maze:
- You move in one direction.
- If you reach a dead end, you **go back to the previous point and try another path**.

This is exactly how backtracking works.

---

## 💡 Key Idea

Backtracking is useful when:
- We need to explore **all possible solutions**
- The problem can be broken into **smaller decision steps**
- Invalid paths can be **detected early**

---
## 👨‍💻 Author
**Omkar Amrit Ingale (Siddharth)**

⭐ If you found this repository helpful, consider giving it a star!
