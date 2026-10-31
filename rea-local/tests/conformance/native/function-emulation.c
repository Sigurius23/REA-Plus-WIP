/* Source-owned oracles. Compiled artifacts are only read by the emulator. */
typedef unsigned long long u64;
__attribute__((noinline)) u64 rea_arithmetic(u64 a, u64 b) { return (a * 7 + b) ^ 0x5a; }
__attribute__((noinline)) u64 rea_choose(u64 a) { return a > 12 ? a - 5 : a + 9; }
__attribute__((noinline)) u64 rea_store(u64 *p, u64 n) {
    u64 sum = 0;
    for (u64 i = 0; i < n; ++i) { p[i] = i * 3 + 1; sum += p[i]; }
    return sum;
}
__attribute__((noinline)) u64 rea_helper(u64 a) { return a ^ 0x35; }
__attribute__((noinline)) u64 rea_nested(u64 a) { return rea_helper(a) + 9; }
extern u64 rea_opaque(u64);
__attribute__((noinline)) u64 rea_external(u64 a) { return rea_opaque(a) + 3; }
__attribute__((noinline)) double rea_float(double a, double b) { return a + b; }
__attribute__((noinline)) u64 rea_indirect(u64 (*callback)(u64), u64 a) { return callback(a) + 2; }
