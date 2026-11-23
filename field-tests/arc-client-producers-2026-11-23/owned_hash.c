/* Owned reference: unsigned 64-bit byte hashing; compiled and emulated only. */
#include <stdint.h>
uint64_t owned_hash(const unsigned char *p, uint64_t n) {
  uint64_t h = 5381;
  for (uint64_t i = 0; i < n; i++) h = h * 33 + p[i];
  return h;
}
