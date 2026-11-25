import type { RegionDecodeFailure } from "./regionDecoder.js";

/** Internal tagged exception: the public parser projects expected failures as Result. */
export class FitParseFailure extends Error {
  constructor(readonly failure: RegionDecodeFailure) {
    super(failure.message);
  }
}
export const malformedFit = (message: string): never => {
  throw new FitParseFailure({
    kind: "format",
    message: `FIT is malformed: ${message}`,
  });
};
export interface FitCapacity {
  readonly maxElements: number;
  readonly maxTreeNodes: number;
  readonly maxTreeProperties: number;
  readonly maxTreeDepth: number;
  readonly maxMetadataBytes: number;
  readonly maxHashBytes: number;
}
/** Admits decoded names, paths, lists and retained object metadata before allocation. */
export class FitMetadataBudget {
  #used = 0;
  constructor(readonly capacity: FitCapacity) {}
  charge(bytes: number): void {
    if (bytes > this.capacity.maxMetadataBytes - this.#used)
      this.limit("max_firmware_metadata_bytes", this.capacity.maxMetadataBytes);
    this.#used += bytes;
  }
  limit(
    name: string,
    maximum: number,
    boundary: RegionDecodeFailure["boundary"] = "capacity",
  ): never {
    throw new FitParseFailure({
      kind: "limit",
      boundary,
      message: `FIT exceeds ${name}=${String(maximum)}`,
    });
  }
}
