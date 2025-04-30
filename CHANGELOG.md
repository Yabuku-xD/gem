# Updated CHANGELOG.md - Apr 15/2025

### Structure
- Added support for top-level declarations (functions, structs, classes, messages) outside the main `start...finish` block
- The original specification wasn't explicit about whether these declarations were allowed outside the main program block
- Fixed handling of programs with multiple declaration types before the main block

### Comments
- Implemented support for both single-line comments using `--`
- Added multi-line comment syntax using `--[` and `]--` delimiters
- Ensured proper lexical handling of comments to avoid interference with other tokens

### Conditionals
- Added precise handling for both styles of conditionals:
    - Single-line conditionals with `then` keyword
    - Multi-line conditionals with blocks and `end if`
- Ensured proper parsing of `else if` and `else` clauses

### Function Declarations
- Made the `returns` type clause optional to support void functions
- Added support for both top-level and inner function declarations
- Added special handling for class methods

### Object-Oriented Features
- Added distinct rules for method calls (like `rect.area()`) vs regular function calls
- Improved property access syntax for structs and classes
- Enhanced message passing system with the `->` operator
- Fixed identifier conflicts to allow field names that match function names

### Input/Output Functions
- Added support for `read_line()` and `read_integer()` input functions
- Enhanced print statement to handle complex expressions

### Built-in Functions
- Added special handling for built-in functions like `split`, `length`, and `uppercase`
- Ensured these functions can be used in expressions
- Implemented proper identifier resolution to prevent conflicts

### Reference Parameters
- Added proper support for the `ref` keyword in both function declarations and function calls
- Fixed parameter passing for reference types

### Variable Declarations
- Added support for both primitive types and user-defined types
- Enhanced array declaration and access syntax
