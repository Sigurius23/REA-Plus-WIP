#include <stdio.h>
__attribute__((noinline)) int rea_native_value(int input) { return input*7+3; }
int main(void) { puts("native retained inventory fixture"); return rea_native_value(2); }
