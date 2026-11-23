#include "module/alloc.h"
void *swift_allocObject(const void *metadata, uintptr_t size, uintptr_t mask) {
  return (void *)metadata;
}
