## Day 1
### Printing
- Programs get executed sequentially.
- **Escape sequences** are sequences of charachters with special meaning:
    - `\n` (new line)
    - `\t` (tab)
- To print `"` or `\` you have to put a back-slash before it like so `\"` and `\\`

### Variables
- A **variable** is a place in memory. It stores data.
- Variables have types.
- Some types:
    - `int` (integer)
    - `double` (floating point number)
    - `boolean` (can only be true or false)
    - `char` (single charachter)
    - `String` (text)
- Variables can change.
- Variable Naming rules:
    - May only contain letters, numbers, `_`,`$`.
    - Can't start with a number.
- Variable names are case sensistive.
- Variable name can't be a reserved word.
- To make a variable unchangeable use `final`.

### Arithmetic Operators
- Java supports arithmetic operators `+` `-` `*` `/` `%`
- `%` is called modulus, it gets remainder of division.
- modulus only works with integers.
- Dividing two integers yields an integer. If you want a fraction, cast it to `double` or `float`.

### Assignment Operators
- Instead of writing `x = x + 5` you may write `x += 5`
- There also these operators `+=` `-=` `*=` `/=`
- `x++` means `x = x + 1`
- `x--` means `x = x - 1`

> [!NOTE]
> A comment is text neglected by the compiler

### Different datatypes have differnet sizes
Integral Types:
- `int` 4 bytes
- `long` 8 bytes
- `short` 2 bytes
- `byte` 1 byte

Fractional Types:
- `float` 4 bytes
- `double` 8 bytes

### Everything is a number
- Binary is a number system.
- Charachters are representable as numbers.
- True can be one and False can be zero.
- You can also represent colors as numbers.
