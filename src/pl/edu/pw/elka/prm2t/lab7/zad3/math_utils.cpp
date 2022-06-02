#include "math_utils.h"

bool is_divisor(int d, int n) {
    return (n / d) * d == n;
}

int min(int a, int b) {
    return a < b ? a : b;
}

int greatest_common_divisor(int a, int b) {
    for (int d = min(a, b); d > 1; d--) {
        if (is_divisor(d, a) && is_divisor(d, b))
            return d;
    }
    return 1;
}