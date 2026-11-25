import type { FileHandle } from "node:fs/promises";

/** Fill one caller-bounded positional window, tolerating short OS reads; never closes the borrowed handle. */
export async function readFileHandleWindow(
  handle: FileHandle,
  position: number,
  length: number,
  assertActive: () => void,
): Promise<Buffer> {
  const bytes = Buffer.alloc(length);
  let observed = 0;
  while (observed < length) {
    assertActive();
    const next = await handle.read(
      bytes,
      observed,
      length - observed,
      position + observed,
    );
    assertActive();
    if (next.bytesRead === 0) break;
    observed += next.bytesRead;
  }
  return bytes.subarray(0, observed);
}
