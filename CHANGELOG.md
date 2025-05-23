# Updated CHANGELOG.md - May 23, 2025

### Sample Program Testing
- Successfully executed all `.gem` programs in the `samples/` directory.
- Verified core language features through sample programs:
    - [`samples/arrays.gem`](samples/arrays.gem): Array declaration, initialization, iteration, and access.
    - [`samples/basic_calculator.gem`](samples/basic_calculator.gem): User input, conditional logic, arithmetic operations, and looping.
    - [`samples/classes.gem`](samples/classes.gem): Class definition, object instantiation, and method calls.
    - [`samples/composite.gem`](samples/composite.gem): Struct and class composition.
    - [`samples/control_flow.gem`](samples/control_flow.gem): If-else statements and logical operators.
    - [`samples/functions.gem`](samples/functions.gem): Function definition, function calls, and return values.
    - [`samples/hello.gem`](samples/hello.gem): Basic program structure and print statement.
    - [`samples/inner_functions.gem`](samples/inner_functions.gem): Nested function definitions and scope.
    - [`samples/loops.gem`](samples/loops.gem): For and while loops.
    - [`samples/message.gem`](samples/message.gem): String manipulation and message passing (conceptual).
    - [`samples/references.gem`](samples/references.gem): Reference parameters in functions.
    - [`samples/user_input.gem`](samples/user_input.gem): Reading user input.
    - [`samples/variables.gem`](samples/variables.gem): Variable declaration and various data types.

### Break Statement Implementation
- Added support for break statements in all loop types (for, while, infinite loop)
- Fixed handling of break statements within if-then constructs
- Implemented proper tracking of nested loop contexts for break statement targets
- Enhanced compiler to generate correct bytecode for loop exit points

### Compiler Implementation
- Implemented a complete compiler pipeline with lexical, syntax, and semantic analysis
- Added command-line flags to stop compilation at any stage (lexing, parsing, semantic)
- Implemented robust error detection and reporting for all compilation stages
- Enhanced the semantic analyzer to check for type compatibility in expressions and assignments

### Error Detection
- Added detection for duplicate type definitions
- Added detection for unresolved type references
- Added detection for variables used before definition
- Added detection for type mismatches in expressions and assignments
- Added additional checks for boolean operands in logical expressions

### Bug Fixes
- Fixed parsing issues with expressions and statement blocks
- Fixed symbol table management for nested scopes
- Fixed type checking in complex expressions
- Resolved issues with multiplicative and additive expressions
- Improved error reporting with line and column information

### Previous Updates (Apr 15, 2025)

#### Structure
- Added support for top-level declarations (functions, structs, classes, messages) outside the main `start...finish` block
- The original specification wasn't explicit about whether these declarations were allowed outside the main program block
- Fixed handling of programs with multiple declaration types before the main block

#### Comments
- Implemented support for both single-line comments using `--`
- Added multi-line comment syntax using `--[` and `]--` delimiters
- Ensured proper lexical handling of comments to avoid interference with other tokens

#### Conditionals
- Added precise handling for both styles of conditionals:
  - Single-line conditionals with `then` keyword
  - Multi-line conditionals with blocks and `end if`
- Ensured proper parsing of `else if` and `else` clauses

#### Function Declarations
- Made the `returns` type clause optional to support void functions
- Added support for both top-level and inner function declarations
- Added special handling for class methods

#### Object-Oriented Features
- Added distinct rules for method calls (like `rect.area()`) vs regular function calls
- Improved property access syntax for structs and classes
- Enhanced message passing system with the `->` operator
- Fixed identifier conflicts to allow field names that match function names

#### Input/Output Functions
- Added support for `read_line()` and `read_integer()` input functions
- Enhanced print statement to handle complex expressions

#### Built-in Functions
- Added special handling for built-in functions like `split`, `length`, and `uppercase`
- Ensured these functions can be used in expressions
- Implemented proper identifier resolution to prevent conflicts

#### Reference Parameters
- Added proper support for the `ref` keyword in both function declarations and function calls
- Fixed parameter passing for reference types

#### Variable Declarations
- Added support for both primitive types and user-defined types
- Enhanced array declaration and access syntax