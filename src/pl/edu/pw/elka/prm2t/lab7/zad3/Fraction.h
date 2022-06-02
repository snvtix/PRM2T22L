#ifndef __FRACTION_H
#define __FRACTION_H

#include <string>

class Fraction {

private:
    int numerator, denominator;

public:
    Fraction();
    Fraction(int n, int d);
    std::string to_string();

    Fraction simplify();

    Fraction multiply(int n);
    Fraction multiply(Fraction other);

    Fraction operator* (const int n);
    Fraction operator* (const Fraction other);
};

#endif