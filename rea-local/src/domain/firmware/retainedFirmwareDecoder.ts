import { err, ok, type Result } from "../result.js";
import type { RegionDecoder, RegionDecodeFailure } from "./regionDecoder.js";

/** Admit one carrier allocation, then retain payload views without concatenating chunks. */
export function createRetainedFirmwareDecoder<Image>(
  fileBytes: number,
  maxFileBytes: number,
  parse: (bytes: Uint8Array) => Result<Image, RegionDecodeFailure>,
): Result<RegionDecoder<Image>, RegionDecodeFailure> {
  if (
    !Number.isSafeInteger(fileBytes) ||
    fileBytes < 0 ||
    !Number.isSafeInteger(maxFileBytes) ||
    maxFileBytes < 1
  )
    return err({
      kind: "format",
      message:
        "Firmware size and byte budget must be safe nonnegative/positive integers",
    });
  if (fileBytes > maxFileBytes)
    return err({
      kind: "limit",
      boundary: "file-size",
      message: `Firmware carrier has ${String(fileBytes)} bytes, exceeding max_firmware_file_bytes=${String(maxFileBytes)}`,
    });
  const bytes = new Uint8Array(fileBytes);
  let length = 0,
    finished = false,
    failure: RegionDecodeFailure | undefined;
  return ok({
    write(chunk) {
      if (failure !== undefined) return err(failure);
      if (finished)
        return err({ kind: "format", message: "Firmware decoder is finished" });
      if (length + chunk.length > fileBytes) {
        failure = {
          kind: "limit",
          boundary: "file-size",
          message: "Firmware carrier grew beyond its admitted byte length",
        };
        return err(failure);
      }
      bytes.set(chunk, length);
      length += chunk.length;
      return ok(undefined);
    },
    finish() {
      if (failure !== undefined) return err(failure);
      if (finished)
        return err({ kind: "format", message: "Firmware decoder is finished" });
      finished = true;
      if (length !== fileBytes) {
        failure = {
          kind: "format",
          message: "Firmware carrier ended before its admitted byte length",
        };
        return err(failure);
      }
      const result = parse(bytes);
      if (!result.ok) failure = result.error;
      return result;
    },
  });
}
