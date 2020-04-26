# KotlinFoundation
This is a repository including source codes related to basic Kotlin concepts

## Concepts
* Variables
* Strings
* Numbers
* Functions
* Conditional Logic
* Collections
* Loops

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

### Functions

In Kotlin, functions are first-class citizen. It means that functions can be assigned to the variables, passed as an arguments or returned from another function. While Kotlin is statically typed, to make it possible, functions need to have a type. 
It exists and it is called function type.

* ()->Unit —the function type that returns nothing useful (Unit) and takes no arguments.
* (Int)->Int— the function type that returns Int and takes single argument of type Int.
* ()->()->Unit— the function type that returns another function that returns nothing useful (Unit). Both functions take no arguments.

[Code Reference for Functions](src/Functions.kt)

### Conditional Logic

Conditional operators in Kotlin are == != > >= < <= 

when replaces the switch operator

```kotlin
when (x) {
       1 -> print("x == 1")
       2 -> print("x == 2")
       else -> { // Note the block
           print("x is neither 1 nor 2")
       }
   }
```

[Code Reference for Conditional Logic](src/ConditionalLogic.kt)

### Collections

Kotlin does not have its own collection classes, they are built out of Java.

* Immutable Array Type

```kotlin
listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
```

* Mutable Array Type

```kotlin
arrayListOf("Leiah", "Luke", " Han Solo", "Mon Mothma")
```

Map is an unordered collection of key value pairs.

* Immutable Map Type

```kotlin
mapOf("Solo" to "Millennium Falcon", "Luke" to "Land Speeder")
```

* Mutable Map Type

```kotlin
hashMapOf("Solo" to "Millennium Falcon", "Luke" to "Land Speeder", "Boba Fett" to "Rocket Pack")
```

[Code Reference for Collections](src/Collections.kt)

### Loops

Common loops are for and while.

```kotlin
for (rebel in rebels) {
        println("Name: $rebel")
    }
```

```kotlin
while (x > 0) {
        println(x)
        x--
    }
```

[Code Reference for Loops](src/Loops.kt)
