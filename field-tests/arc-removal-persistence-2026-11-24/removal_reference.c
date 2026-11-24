/* Owned raw-memory references. These are not Swift nominal declarations.
 * No hashing or managed-object implementation is supplied or simulated. */
#include <stdint.h>
#include <stddef.h>
typedef struct {
  uint64_t unused[2];
  int64_t count;
  uint64_t capacity;
  uint8_t scale;
  uint8_t pad[3];
  uint32_t word24;
  uint64_t seed;
  void *keys;
  void *values;
  uint64_t bitmap;
} RawHeader;
_Static_assert(offsetof(RawHeader, count) == 0x10, "count");
_Static_assert(offsetof(RawHeader, scale) == 0x20, "scale");
_Static_assert(offsetof(RawHeader, word24) == 0x24, "word24");
_Static_assert(offsetof(RawHeader, bitmap) == 0x40, "bitmap");
uint64_t choose_move(uint64_t start, uint64_t hole, uint64_t hash, uint64_t mask) {
  return (((hash & mask) - start) & mask) <= ((hole - start) & mask);
}
void isolated_remove(RawHeader *h, uint64_t slot) {
  h->bitmap &= ~(UINT64_C(1) << slot);
  h->count -= 1;
  h->word24 += 1;
}
