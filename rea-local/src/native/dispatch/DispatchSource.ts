import { ArtifactReaderFailure } from "../../artifacts/ArtifactReader.js";
import type { DispatchInstruction } from "../../domain/native/nativeTableDispatch.js";
import type { MachoLayout } from "../AppleMachoSelection.js";

export const dispatchHex = (value: bigint): string => `0x${value.toString(16)}`;

/** A unique, initialized, immutable mapping is required for every source read. */
export const dispatchOffset = (
  layout: MachoLayout,
  address: bigint,
  size: number,
  executable: boolean,
): number | null => {
  if (
    address < 0n ||
    address + BigInt(size) > 1n << 64n ||
    (executable && address % 4n !== 0n)
  )
    return null;
  try {
    const offset = layout.offset(address, size);
    const segment = layout.segments.find(
      (s) =>
        address >= s.address && address + BigInt(size) <= s.address + s.size,
    );
    return segment?.writable === false && (!executable || segment.executable)
      ? offset
      : null;
  } catch {
    return null;
  }
};

export const dispatchSource = (
  bytes: Buffer,
  address: bigint,
  offset: number,
  operation: string,
): DispatchInstruction => ({
  address: dispatchHex(address),
  file_offset: offset,
  bytes_hex: bytes.subarray(offset, offset + 4).toString("hex"),
  operation,
});

export const checkDispatchCancellation = (signal?: AbortSignal): void => {
  if (signal?.aborted)
    throw new ArtifactReaderFailure(
      "cancelled",
      "Native table dispatch inspection cancelled.",
    );
};
