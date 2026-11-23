/* Owned reference for the observed raw probe, not a Swift nominal declaration.
 * Compiled and emulated only. Hash and table contents are explicit test inputs. */
#include <stdint.h>
#include <stddef.h>
typedef struct { uint64_t identity; uint8_t context; uint8_t pad[7]; } Key;
typedef struct {
  uint64_t unused[4];
  uint8_t scale;
  uint8_t pad[15];
  Key *keys;
  uint64_t unused2;
  uint64_t bitmap;
} Header;
typedef struct { uint64_t slot, found; } Result;
_Static_assert(offsetof(Header, scale) == 0x20, "scale");
_Static_assert(offsetof(Header, keys) == 0x30, "keys");
_Static_assert(offsetof(Header, bitmap) == 0x40, "bitmap");
_Static_assert(sizeof(Key) == 16, "key stride");
Result probe_reference(const Header *h, uint64_t identity,
                       uint64_t context, uint64_t hash) {
  uint64_t mask = (UINT64_C(1) << h->scale) - 1;
  uint64_t slot = hash & mask;
  while ((h->bitmap >> slot) & 1) {
    const Key *key = &h->keys[slot];
    if (key->identity == identity && key->context == (uint8_t)context)
      return (Result){slot, 1};
    slot = (slot + 1) & mask;
  }
  return (Result){slot, 0};
}
