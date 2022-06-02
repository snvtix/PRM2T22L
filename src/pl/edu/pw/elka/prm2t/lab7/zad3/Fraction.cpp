#include "Fraction.h"
#include "math_utils.h"
#include <iostream>

Fraction::Fraction() {
    numerator = 0;
    denominator = 1;
}

Fraction::Fraction(int n, int d) {
    numerator = n;
    denominator = d;
}

std::string Fraction::to_string() {
    return std::to_string(numerator) + "/" + std::to_string(denominator);
}

Fraction Fraction::simplify() {
    int newNumerator;
    int newDenominator;
    int gcd = greatest_common_divisor(numerator, denominator);
    newNumerator = numerator/gcd;
    newDenominator = denominator/gcd;
    Fraction *fraction = new Fraction(newNumerator,newDenominator);
    return *fraction;
}

Fraction Fraction::multiply(int n) {
    int newNumerator = numerator*n;
    Fraction *fraction = new Fraction(newNumerator,denominator);
    return fraction->simplify();

}

Fraction Fraction::multiply(Fraction other) {
    int newNumerator = numerator*other.numerator;
    int newDenominator = denominator*other.denominator;
    Fraction *fraction = new Fraction(newNumerator,newDenominator);
    return fraction->simplify();
}

Fraction Fraction::operator*(const int n) {
    multiply(n);
}

Fraction Fraction::operator*(const Fraction other) {
    multiply(other);
}

int main(int argc,char** argv) {

    Fraction*f1 =new Fraction(3, 4);
    Fraction*f2 =new Fraction(2, 9);
    std::cout<< f1->to_string()<< " * 2 = ";
    std::cout<< (f1->multiply(2)).to_string()<< std::endl;
    std::cout<< f1->to_string()<< " * "<< f2->to_string()<< " = ";
    std::cout<< (f1->multiply(*f2)).to_string()<< std::endl;

    std::cout<< f1->to_string()<< " * 2 = "<< (*f1* 2).to_string();
    std::cout<< std::endl;
    std::cout<< f1->to_string()<< " * "<< f2->to_string()<< " = ";
    std::cout<< (*f1* *f2).to_string()<< std::endl;
}