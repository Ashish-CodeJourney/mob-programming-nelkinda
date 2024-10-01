# Roman numeral's kata using TDD in Kotlin

A Kotlin implementation of the Roman Numerals' Kata that follows a TDD approach. 

## Kata Description

 - Given a decimal number, convert it in a roman numeral string
 - Given a roman numeral string, convert it in a decimal number

For the sake of the exercise numbers above 3 000 won't be handled.

for 1, 2, 3 we can make a parameterized test

Here are some useful conversions
```
I  = 1
IV = 4
V  = 5
IX = 9
X  = 10
XL = 40
L  = 50
XC = 90
C  = 100
CD = 400
D  = 500
CM = 900
M  = 1000
```

### Examples
#### Int → Roman numerals
```
Input: 1
Output: "I"

Input: 4
Output: "IV"

Input: 2583
Output: "MMDLXXXIII"
```

#### Roman numerals → Int

```
Input: "I"
Output: 1

Input: "IV"
Output: 4

Input: "MMDLXXXIII"
Output: 2583
```
