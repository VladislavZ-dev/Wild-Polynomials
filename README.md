# Wild Polynomials

A very simple java application that takes a wild polynomial (a polynomial which is very complex and hard to understand) and transforms it into a more readable state. It also returns the result of any x solved in that polynomial.

Given the polynomial P(x) = −8x^2 + 3 + 2x − 8x^6 − 1 + 34x^2 − 1 + 8x^6 + 4 − 27x^5, if we want the result of P(2), the input to provide to the application is 2 P(x). Each term of the polynomial must be in this format: coefficint x exponent. 2x would be represented as 2x1. 3 would be represented as 3x0. 

As such, the provided input to the application is 2 -8x2 3x0 2x1 -8x6 -1x0 34x2 -1x0 8x6 4x0 -27x5. It then will print this polynomial in a readable format, plus the result of P(2)
