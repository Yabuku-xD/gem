# Gem
A beginner-friendly programming language with clear syntax and intuitive structure. The file extension will be `.gem`

## Core Features:

- Readable keywords: Uses clear, English-like keywords
- Simple type system: Types are clearly marked and intuitive
- Clean structure: Minimal syntax characters, focus on readability
- Sensible defaults: Reduces boilerplate code for common patterns
- Consistent syntax: Similar patterns for similar constructs

## Addressing Open Questions:

### Valid identifier characters:
- Letters (a-z, A-Z), digits (0-9), underscore (_)
- Must start with a letter
- Case-sensitive
### Comments
Use double dash for single line comments:
```python
-- This is a comment
```
Use `--[ ... ]--` for multi line comments:
```python
--[ This is a comment
    But multi line ]--
```
### Numeric data types:
- `number` (covers all numeric values)
- `integer` (for whole numbers specifically)
### Character data type:
- `char` type for single characters
### Literals:
- Integer: 42, -7
- Float: 3.14, -0.5
- Character: 'a', '$'
- String: "Hello, World!"
- Array: [1, 2, 3]
- Boolean: yes, no
### Program entry point:
- Programs start with start and end with finish
- No explicit main function required
### Statement termination:
- Each statement on a new line
- No special terminator needed
### Conditionals:
- Use if, else if, else with end if to close
- One-line conditionals use then for simple cases
### Parameter passing:
- Default is pass-by-value
- Use ref keyword for pass-by-reference
### Reference variables:
- Use ref to create reference variables

`Program 1: Hello World (hello.gem)`
```python
-- Hello World program
-- Shows basic program structure and output
-- Expected output: "Hello, World!"

start
  print "Hello, World!"
finish
```

`Program 2: Variables and Types (variables.gem)`
```python
-- Variables and Types
-- Shows different data types and variable declarations
-- Expected output:
-- Name: John
-- Age: 30
-- Height: 1.85
-- Is a student: yes

start
  string name = "John"
  integer age = 30
  number height = 1.85
  boolean is_student = yes
  
  print "Name: " + name
  print "Age: " + age
  print "Height: " + height
  print "Is a student: " + is_student
finish
```

`Program 3: Functions (functions.gem)`
```python
-- Functions
-- Shows how to define and call functions
-- Expected output:
-- Sum: 8
-- Greeting: Hello, Alice!

function add(integer a, integer b) returns integer
  return a + b
end function

function greet(string name) returns string
  return "Hello, " + name + "!"
end function

start
  integer result = add(3, 5)
  print "Sum: " + result
  
  string greeting = greet("Alice")
  print "Greeting: " + greeting
finish
```

`Program 4: Control Flow (control_flow.gem)`
```python
-- Control Flow
-- Shows conditional statements
-- Expected output (with hour = 14):
-- Good afternoon!
-- Time of day: afternoon

start
  integer hour = 14  -- Set to 2pm for testing
  
  if hour < 12
    print "Good morning!"
  else if hour < 18
    print "Good afternoon!"
  else
    print "Good evening!"
  end if
  
  string time_of_day
  if hour < 12 then time_of_day = "morning"
  else if hour < 18 then time_of_day = "afternoon"
  else time_of_day = "evening"
  
  print "Time of day: " + time_of_day
finish
```

`Program 5: Loops (loops.gem)`
```python
-- Loops
-- Shows different types of loops
-- Expected output:
-- Counting: 1 2 3 4 5
-- Sum: 15
-- Fibonacci: 1 1 2 3 5 8 13

start
  -- For loop
  print "Counting: "
  for i from 1 to 5
    print i + " "
  end for
  
  -- While loop with sum calculation
  integer sum = 0
  integer i = 1
  while i <= 5
    sum = sum + i
    i = i + 1
  end while
  print "Sum: " + sum
  
  -- Loop with break
  print "Fibonacci: "
  integer a = 1
  integer b = 1
  loop
    print a + " "
    integer temp = a
    a = b
    b = temp + b
    if b > 20 then break
  end loop
finish
```

`Program 6: Arrays (arrays.gem)`
```python
-- Arrays
-- Shows array creation and usage
-- Expected output:
-- Fruits: Apple Banana Cherry
-- Scores: 85 92 78 90
-- Average score: 86.25

start
  -- String array
  string[] fruits = ["Apple", "Banana", "Cherry"]
  print "Fruits: "
  for i from 0 to 2
    print fruits[i] + " "
  end for
  
  -- Number array with calculations
  number[] scores = [85, 92, 78, 90]
  print "Scores: "
  for i from 0 to 3
    print scores[i] + " "
  end for
  
  -- Calculate average
  number sum = 0
  for i from 0 to 3
    sum = sum + scores[i]
  end for
  number average = sum / 4
  print "Average score: " + average
finish
```

`Program 7: Composite Types (composite.gem)`
```python
-- Composite Types
-- Shows struct definition and usage
-- Expected output:
-- Person: John Doe, 30 years old
-- Student: Alice Smith, 20 years old, ID: S12345

struct Person
  string name
  integer age
end struct

struct Student extends Person
  string student_id
  number gpa
end struct

start
  -- Create a Person
  Person person
  person.name = "John Doe"
  person.age = 30
  print "Person: " + person.name + ", " + person.age + " years old"
  
  -- Create a Student
  Student student
  student.name = "Alice Smith"
  student.age = 20
  student.student_id = "S12345"
  student.gpa = 3.8
  print "Student: " + student.name + ", " + student.age + " years old, ID: " + student.student_id
finish
```

`Program 8: Classes and Methods (classes.gem)`
```python
-- Classes and Methods
-- Shows class definition with methods
-- Expected output:
-- Rectangle area: 20
-- Circle area: 28.26

class Shape
  -- Base class for shapes
end class

class Rectangle is Shape
  number width
  number height
  
  function area() returns number
    return width * height
  end function
end class

class Circle is Shape
  number radius
  
  function area() returns number
    return 3.14 * radius * radius
  end function
end class

start
  Rectangle rect
  rect.width = 4
  rect.height = 5
  print "Rectangle area: " + rect.area()
  
  Circle circle
  circle.radius = 3
  print "Circle area: " + circle.area()
finish
```

`Program 9: Inner Functions (inner_functions.gem)`
```python
-- Inner Functions
-- Shows nested functions and closures
-- Expected output:
-- Outer value: 10
-- Inner value: 5
-- Combined: 15

start
  integer outer_value = 10
  print "Outer value: " + outer_value
  
  function inner() returns integer
    integer inner_value = 5
    print "Inner value: " + inner_value
    return outer_value + inner_value
  end function
  
  integer result = inner()
  print "Combined: " + result
finish
```

`Program 10: User Input (user_input.gem)`
```python
-- User Input
-- Shows reading from the console
-- Expected output depends on input

start
  print "What is your name?"
  string name = read_line()
  
  print "How old are you?"
  integer age = read_integer()
  
  print "Hello, " + name + "!"
  print "You are " + age + " years old."
  
  integer dog_years = age * 7
  print "In dog years, you would be " + dog_years + " years old."
finish
```

`Program 11: Reference Parameters (references.gem)`
```python
-- Reference Parameters
-- Shows pass-by-reference for functions
-- Expected output:
-- Before swap: a=5, b=10
-- After swap: a=10, b=5
-- Original point: (3,4)
-- Moved point: (8,9)

struct Point
  integer x
  integer y
end struct

function swap(ref integer a, ref integer b)
  integer temp = a
  a = b
  b = temp
end function

function move_point(ref Point p, integer dx, integer dy)
  p.x = p.x + dx
  p.y = p.y + dy
end function

start
  integer a = 5
  integer b = 10
  print "Before swap: a=" + a + ", b=" + b
  
  swap(ref a, ref b)
  print "After swap: a=" + a + ", b=" + b
  
  Point p
  p.x = 3
  p.y = 4
  print "Original point: (" + p.x + "," + p.y + ")"
  
  move_point(ref p, 5, 5)
  print "Moved point: (" + p.x + "," + p.y + ")"
finish
```

`Program 12: Message Passing System (message.gem)`
```python
-- Message Passing System
-- Shows special message system between objects
-- Expected output:
-- Processing text: Hello, World!
-- Word count: 2
-- Character count: 13
-- Uppercase: HELLO, WORLD!

message TextRequest
  string text
end message

message TextResponse
  integer word_count
  integer char_count
  string uppercase
end message

class TextProcessor
  function analyze(TextRequest request) returns TextResponse
    print "Processing text: " + request.text
    
    -- Count words (simple split by spaces)
    string[] words = split(request.text, " ")
    integer word_count = length(words)
    
    -- Count characters
    integer char_count = length(request.text)
    
    -- Convert to uppercase
    string uppercase = uppercase(request.text)
    
    -- Create response
    TextResponse response
    response.word_count = word_count
    response.char_count = char_count
    response.uppercase = uppercase
    
    return response
  end function
end class

start
  -- Create request
  TextRequest request
  request.text = "Hello, World!"
  
  -- Process the text
  TextProcessor processor
  TextResponse response = processor -> analyze(request)
  
  -- Display results
  print "Word count: " + response.word_count
  print "Character count: " + response.char_count
  print "Uppercase: " + response.uppercase
finish
```
