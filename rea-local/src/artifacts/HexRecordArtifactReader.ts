import { AnalysisResourceConstraintError } from "../domain/analysisErrorCore.js";
import type { RegionDecodeFailure } from "../domain/firmware/regionDecoder.js";
import { streamChunkToBuffer } from "./StreamBytes.js";
import { createHash } from "node:crypto";
import { lstat } from "node:fs/promises";
import { Readable } from "node:stream";
import { finished } from "node:stream/promises";
import { setImmediate } from "node:timers/promises";
import {
  createHexRecordDecoder,
  HEX_RECORD_ENCODING_LABELS,
  type HexRecordImage,
  type HexRecordCapacity,
} from "../domain/firmware/hexRecords.js";
import type { HexRecordEncoding } from "../domain/firmware/hexRecordSyntax.js";
import { resolveHexRecordCapacity } from "../domain/firmware/hexRecordCapacity.js";
import type { HexRecordFormatMetadata } from "../domain/firmware/hexRecordMetadata.js";
import { OwnedFileHandle } from "../filesystem/OwnedFileHandle.js";
import {
  openRegularFile,
  RegularFileAdmissionFailure,
  sameRegularFileState,
  type StableRegularFileDescriptor,
} from "../filesystem/RegularFile.js";
import { readFileHandleChunks } from "../filesystem/readFileHandleChunks.js";
import {
  ArtifactReaderFailure,
  copyArtifactEntry,
  sameArtifactEntry,
  type ArtifactEntry,
  type ArtifactReader,
} from "./ArtifactReader.js";

const textAddress = (address: number) =>
  `0x${address.toString(16).padStart(8, "0")}`;
/** Decode sparse text records through one stable descriptor; gaps never become zero bytes. */
export class HexRecordArtifactReader implements ArtifactReader {
  #source: StableRegularFileDescriptor | undefined;
  #owner: OwnedFileHandle | undefined;
  #preparing: Promise<void> | undefined;
  #image: HexRecordImage | undefined;
  #expectedSha256: string | undefined;
  #decodedSha256: string | undefined;
  readonly #regions = new Map<
    string,
    { entry: ArtifactEntry; bytes: Uint8Array }
  >();
  readonly #streams = new Set<Readable>();
  #closed = false;

  constructor(
    private readonly path: string,
    readonly format: HexRecordEncoding,
    admitted?: StableRegularFileDescriptor,
    private readonly capacity: HexRecordCapacity = resolveHexRecordCapacity(),
  ) {
    this.#source = admitted;
  }

  formatMetadata(): HexRecordFormatMetadata | undefined {
    return this.#image === undefined ? undefined : { ...this.#image.metadata };
  }
  limitations(): readonly string[] {
    return [...(this.#image?.limitations ?? [])];
  }
  provenance() {
    return [];
  }

  async prepareContainer(expectedSha256: string, signal?: AbortSignal) {
    if (
      this.#expectedSha256 !== undefined &&
      this.#expectedSha256 !== expectedSha256
    )
      throw new ArtifactReaderFailure(
        "integrity",
        "Firmware reader was rebound to different carrier bytes",
      );
    this.#expectedSha256 = expectedSha256;
    await this.#ensurePrepared(signal);
    this.#active(signal);
    if (this.#decodedSha256 !== expectedSha256)
      throw new ArtifactReaderFailure(
        "integrity",
        "Firmware carrier differs from the bound root digest",
      );
  }

  async *entries(signal?: AbortSignal): AsyncIterable<ArtifactEntry> {
    await this.#ensurePrepared(signal);
    await this.#verifySource();
    let count = 0;
    for (const { entry } of this.#regions.values()) {
      if (count++ % 256 === 0) await setImmediate();
      this.#active(signal);
      yield copyArtifactEntry(entry);
    }
    this.#active(signal);
  }

  async open(entry: ArtifactEntry, signal?: AbortSignal): Promise<Readable> {
    await this.#ensurePrepared(signal);
    await this.#verifySource();
    this.#active(signal);
    const region = this.#regions.get(entry.adapterKey);
    if (region === undefined || !sameArtifactEntry(entry, region.entry))
      throw new ArtifactReaderFailure(
        "integrity",
        "Firmware region entry differs from the owning inventory",
      );
    const stream = Readable.from(
      (async function* () {
        for (
          let offset = 0;
          offset < region.bytes.length;
          offset += 64 * 1024
        ) {
          if (signal?.aborted === true)
            throw new ArtifactReaderFailure(
              "cancelled",
              "Firmware region read cancelled",
            );
          // Copies prevent a consumer from mutating the retained decoded image.
          yield Buffer.from(region.bytes.subarray(offset, offset + 64 * 1024));
        }
      })(),
      { objectMode: false },
    );
    const onAbort = () =>
      stream.destroy(
        new ArtifactReaderFailure(
          "cancelled",
          "Firmware region read cancelled",
        ),
      );
    signal?.addEventListener("abort", onAbort, { once: true });
    this.#streams.add(stream);
    stream.once("close", () => {
      this.#streams.delete(stream);
      signal?.removeEventListener("abort", onAbort);
    });
    return stream;
  }

  async #ensurePrepared(signal?: AbortSignal) {
    this.#active(signal);
    if (this.#image !== undefined) return;
    if (this.#preparing !== undefined) return this.#preparing;
    const preparing = this.#prepare(signal);
    this.#preparing = preparing;
    try {
      await preparing;
      this.#active(signal);
    } catch (cause) {
      if (
        signal?.aborted === true &&
        (cause === signal.reason ||
          (cause instanceof Error && cause.name === "AbortError"))
      )
        throw new ArtifactReaderFailure(
          "cancelled",
          "Firmware decoding cancelled",
          { cause },
        );
      throw cause;
    } finally {
      if (this.#preparing === preparing) this.#preparing = undefined;
    }
  }

  async #prepare(signal?: AbortSignal) {
    if (this.#source === undefined) {
      if (this.#owner !== undefined) {
        await this.#owner.close();
        this.#owner = undefined;
      }
      try {
        const handle = await openRegularFile(this.path, {
          symlinks: "reject",
          signal,
        });
        this.#owner = new OwnedFileHandle(handle);
        this.#source = { handle, initial: await handle.stat() };
      } catch (cause) {
        if (cause instanceof RegularFileAdmissionFailure)
          this.#owner = cause.owner;
        throw cause;
      }
    }
    await this.#verifySource();
    this.#active(signal);
    const source = this.#source;
    const decoder = createHexRecordDecoder(
      this.format,
      source.initial.size,
      this.capacity,
    );
    if (!decoder.ok) this.#decodeFailure(decoder.error);
    const hash = createHash("sha256");
    let bytes = 0;
    for await (const raw of readFileHandleChunks(source.handle, { signal })) {
      this.#active(signal);
      const chunk = streamChunkToBuffer(raw);
      bytes += chunk.length;
      if (bytes > source.initial.size)
        throw new ArtifactReaderFailure(
          "integrity",
          "Firmware carrier grew during decoding",
        );
      hash.update(chunk);
      const written = decoder.value.write(chunk);
      if (!written.ok) this.#decodeFailure(written.error);
    }
    await this.#verifySource();
    this.#active(signal);
    const decodedSha256 = hash.digest("hex");
    if (
      bytes !== source.initial.size ||
      (this.#expectedSha256 !== undefined &&
        decodedSha256 !== this.#expectedSha256)
    )
      throw new ArtifactReaderFailure(
        "integrity",
        "Firmware carrier differs from the bound root digest",
      );
    const decoded = decoder.value.finish();
    if (!decoded.ok) this.#decodeFailure(decoded.error);
    const image = decoded.value;
    this.#regions.clear();
    for (const region of image.regions) {
      const path = `${textAddress(region.start)}-${textAddress(region.end)}.bin`;
      const entry: ArtifactEntry = {
        path,
        adapterKey: path,
        kind: "file",
        declaredSize: region.bytes.length,
        compressedSize: null,
        byteOffset: null,
        executable: false,
        encrypted: false,
        declaredSha256: null,
        unpacked: false,
        limitations: [
          "Decoded firmware address range; not a contiguous carrier-file interval, CPU profile or observed device memory.",
          ...image.limitations,
        ],
        formatMetadata: {
          kind: "hex-record-region",
          start_address: region.start,
          end_address: region.end,
          length: region.bytes.length,
          record_count: region.recordCount,
          first_line: region.firstLine,
          last_line: region.lastLine,
        },
      };
      this.#regions.set(path, { entry, bytes: region.bytes });
    }
    this.#decodedSha256 = decodedSha256;
    this.#image = image;
  }

  #decodeFailure(failure: RegionDecodeFailure): never {
    if (failure.kind === "limit")
      throw new AnalysisResourceConstraintError(
        "decode_firmware_records",
        failure.boundary === "file-size" ? "file-size" : "memory",
        failure.message,
        {
          max_firmware_file_bytes: this.capacity.maxFileBytes,
          max_firmware_runs: this.capacity.maxRuns,
        },
        {
          remediationAction:
            "Increase the named max_firmware_file_bytes or max_firmware_runs caller input to admit this carrier within available memory. Repeating unchanged limits reproduces the refusal.",
        },
      );
    throw new ArtifactReaderFailure("format", failure.message);
  }
  async #verifySource() {
    if (this.#source === undefined)
      throw new ArtifactReaderFailure(
        "unavailable",
        "Firmware source is unavailable",
      );
    const [handle, path] = await Promise.all([
      this.#source.handle.stat(),
      lstat(this.path).catch((cause: unknown) => {
        if (
          typeof cause === "object" &&
          cause !== null &&
          "code" in cause &&
          ["ENOENT", "ENOTDIR", "ELOOP"].includes(String(cause.code))
        )
          throw new ArtifactReaderFailure(
            "integrity",
            "Firmware carrier path disappeared or changed since admission",
            { cause },
          );
        throw cause;
      }),
    ]);
    if (
      !path.isFile() ||
      path.isSymbolicLink() ||
      !sameRegularFileState(this.#source.initial, handle) ||
      !sameRegularFileState(this.#source.initial, path)
    )
      throw new ArtifactReaderFailure(
        "integrity",
        "Firmware carrier changed since descriptor admission",
      );
  }
  #active(signal?: AbortSignal) {
    if (signal?.aborted === true)
      throw new ArtifactReaderFailure(
        "cancelled",
        `${HEX_RECORD_ENCODING_LABELS[this.format]} decoding cancelled`,
      );
    if (this.#closed)
      throw new ArtifactReaderFailure(
        "unavailable",
        "Firmware reader is closed",
      );
  }
  async close() {
    this.#closed = true;
    if (this.#preparing !== undefined)
      await Promise.allSettled([this.#preparing]);
    const streams = [...this.#streams];
    const stopped = streams.map((stream) =>
      finished(stream).catch(() => undefined),
    );
    for (const stream of streams) stream.destroy();
    await Promise.all(stopped);
    if (this.#owner !== undefined) {
      await this.#owner.close();
      this.#owner = undefined;
    }
    this.#image = undefined;
    this.#decodedSha256 = undefined;
    this.#regions.clear();
  }
}
