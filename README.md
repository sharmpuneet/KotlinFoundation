# KotlinFoundation
This is a repository including source codes related to basic Kotlin concepts

## Concepts
* Variables
* Strings

### Variables
There are two type of variables - mutable (values can be changed) and immutable (values cannot be changed)
*"var"* keyword is used to declare mutable variables ands *"val"* keyword is used to declare immutable variables.

Kotlin has type inference that means we don't have to declare type of a variable. However, if required we can explicitly set the type of variable.

Variables can be converted to different types using toSting(), toDouble(), etc.

[Code Reference for Variables](src/Variables.kt)

### Strings 

String is a collection of characters. There are two main type of strings - escaped string and raw string.

Escaped String - "\A Joke \" , \n, \t, \b, \r, \', \\, \$, 

Raw String = """ """" 

We can Loop through string using for loop.

*Useful Methods in Strings*

1. Compare Strings - contentEquals()
2. Check if a string Contains character - contains(other: CharSequence, ignoreCase: Boolean = false)
3. Change string value to upper or lower case - toUpperCase() and toLowerCase()
4. Conversion of numbers to String - toString()
5. Subsequence of String - subSequence(startIndex, endIndex)

String Templates 
We can pass variables and methods along with string using $ sign e.g.
``` println("$luke has a $lightSaberColor lightsaber and drives a $vehicle and is age $age")```
``` println("Lukes full name $luke has ${luke.length}")```

[Code Reference for Strings](src/Strings.kt)

### Numbers

Main operations on numbers are sum (+), subtraction (-), multiplication (*),
division (/), Remainder (%)

[Code Reference for Numbers](src/Numbers.kt)


