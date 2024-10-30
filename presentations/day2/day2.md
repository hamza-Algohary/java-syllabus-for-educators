---
marp: true
theme: default
---
# Java Programming For Beginners
## Day 2

--- 

## Recap

---

## Getting user input

---

Copy the following code.
```java
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // insert your code here

    }
}
```
Replace the comment with your code.

--- 

Some functions to get user input
  - `next()` (for String)
  - `nextInt()`
  - `nextDouble()`
  - `nextChar()` 

---

Example:
```java
int x = scanner.nextInt();
```

---

## The result of a logical expression can be stored in `boolean`

---

## Comparison operators
- `>`  greater than?
- `<`  less than?
- `>=` greater than or equal?
- `<=` less than or equal?
- `==` is equal?
- `!=` is not equal?

---

## Avoid comparing floating point numbers.

---

booleans can be used to make decisions.

---

## `if` and `else` are used for decision making.<br>
```java
if (condition) {
    // do something
} else {
    // do another thing
}
```

---

## Logical operators:
- `&&` (AND)
- `||` (OR)
- `!`  (NOT)

---

# Thank You
