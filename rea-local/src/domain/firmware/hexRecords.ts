// Selectively adapted from upstream REA f7849cad3fe3bffb207b4dc30f34394978c20297.
import type { HexRecordsMetadata } from "./hexRecordMetadata.js";
import { err, ok, type Result } from "../result.js";
import { mergeArenaRuns, type RunConflict } from "./addressRuns.js";
import type { RegionDecodeFailure, RegionDecoder } from "./regionDecoder.js";
import {
  COLON,
  CR,
  LETTER_S,
  LF,
  SREC_DATA_LIMITS,
  SREC_WIDTH_OF,
  hex,
  maxLineChars,
  parseRecord,
  readBigEndian,
  trimTrailingBlanks,
  type HexRecord,
  type HexRecordEncoding,
} from "./hexRecordSyntax.js";

/** Caller-selected resource policy; neither bound is a format restriction. */
export interface HexRecordCapacity {
  readonly maxFileBytes: number;
  readonly maxRuns: number;
}

export const HEX_RECORD_ENCODING_LABELS: Readonly<
  Record<HexRecordEncoding, string>
> = { "intel-hex": "Intel HEX", srec: "S-record" };

/** Decoded bytes for one address-contiguous range; `end` is inclusive. */
export interface HexRecordRegion {
  readonly start: number;
  readonly end: number;
  readonly bytes: Uint8Array;
  readonly recordCount: number;
  readonly firstLine: number;
  readonly lastLine: number;
}

export interface HexRecordImage {
  readonly metadata: HexRecordsMetadata;
  /** Ascending by address; gaps between regions are unwritten, not zero. */
  readonly regions: readonly HexRecordRegion[];
  readonly terminated: boolean;
  readonly limitations: readonly string[];
}

/** Consecutive records whose addresses continue each other. */
interface RecordRun {
  readonly address: number;
  readonly offset: number;
  length: number;
  recordCount: number;
  readonly firstLine: number;
  lastLine: number;
}

interface DeclaredValue<Value> {
  readonly value: Value;
  readonly line: number;
}

/**
 * Recognize a file only by a fully valid first record at byte 0. A byte-order
 * mark, a leading blank line or an invalid first record is not recognized.
 */
export const detectHexRecordEncoding = (
  prefix: Uint8Array,
): HexRecordEncoding | undefined => {
  const encoding =
    prefix[0] === COLON ? "intel-hex" : prefix[0] === LETTER_S ? "srec" : null;
  if (encoding === null) return undefined;
  const max = maxLineChars(encoding);
  const window = prefix.subarray(0, max + 2);
  const lf = window.indexOf(LF);
  let length = lf < 0 ? window.length : lf;
  if (lf >= 0 && window[length - 1] === CR) length -= 1;
  if (length > max) return undefined;
  const line = window.subarray(0, trimTrailingBlanks(window, length));
  return parseRecord(encoding, line).ok ? encoding : undefined;
};

/** Start a streaming decoder whose arena is bounded by the admitted file size. */
export const createHexRecordDecoder = (
  encoding: HexRecordEncoding,
  fileBytes: number,
  capacity: HexRecordCapacity,
): Result<RegionDecoder<HexRecordImage>, RegionDecodeFailure> => {
  if (
    !Number.isSafeInteger(capacity.maxFileBytes) ||
    capacity.maxFileBytes < 0 ||
    !Number.isSafeInteger(capacity.maxRuns) ||
    capacity.maxRuns < 0
  )
    return err({
      kind: "limit",
      boundary: "capacity",
      message:
        "max_firmware_file_bytes and max_firmware_runs must be nonnegative safe integers",
    });
  if (!Number.isSafeInteger(fileBytes) || fileBytes < 0)
    return err({
      kind: "limit",
      boundary: "file-size",
      message: "Admitted firmware file size must be a nonnegative safe integer",
    });
  if (fileBytes > capacity.maxFileBytes)
    return err({
      kind: "limit",
      boundary: "file-size",
      message: `file is ${String(fileBytes)} bytes, exceeding max_firmware_file_bytes=${String(capacity.maxFileBytes)}; raise that caller-selected input limit to admit this file`,
    });
  return ok(
    new StreamingHexRecordDecoder(encoding, fileBytes, capacity.maxRuns),
  );
};

const formatFailure = (line: number, detail: string): RegionDecodeFailure => ({
  kind: "format",
  message: `line ${String(line)}: ${detail}`,
});

class StreamingHexRecordDecoder implements RegionDecoder<HexRecordImage> {
  readonly #encoding: HexRecordEncoding;
  readonly #line: Uint8Array;
  readonly #runs: RecordRun[] = [];
  #arena: Uint8Array;
  #failed: RegionDecodeFailure | undefined;
  #finished = false;
  #arenaWriteOffset = 0;
  #lineLength = 0;
  #lineNumber = 0;
  #recordCount = 0;
  #dataRecordCount = 0;
  #termination: DeclaredValue<string> | undefined;
  #base = 0;
  #baseFromSegment = false;
  #segmentRecords = false;
  #linearRecords = false;
  #start: (DeclaredValue<number> & { readonly record: string }) | undefined;
  #startSegment: DeclaredValue<readonly [number, number]> | undefined;
  #header:
    | (DeclaredValue<Uint8Array> & { readonly address: number })
    | undefined;
  #declaredCount: number | null = null;
  #declaredCountLine: number | null = null;
  #countRecordCount = 0;
  readonly #dataTypes = new Set<string>();

  constructor(
    encoding: HexRecordEncoding,
    fileBytes: number,
    readonly maxRuns: number,
  ) {
    this.#encoding = encoding;
    // One extra byte holds the CR of a CRLF line at the maximum length.
    this.#line = new Uint8Array(maxLineChars(encoding) + 1);
    this.#arena = new Uint8Array(Math.floor(fileBytes / 2));
  }

  write(chunk: Uint8Array): Result<void, RegionDecodeFailure> {
    if (this.#failed !== undefined) return err(this.#failed);
    if (this.#finished)
      return this.#refuse(
        formatFailure(this.#lineNumber, "decoder is already finished"),
      );
    let from = 0;
    while (from < chunk.length) {
      const lf = chunk.indexOf(LF, from);
      const piece = chunk.subarray(from, lf < 0 ? chunk.length : lf);
      if (this.#lineLength + piece.length > this.#line.length)
        return this.#refuse(this.#overlong(this.#lineNumber + 1));
      this.#line.set(piece, this.#lineLength);
      this.#lineLength += piece.length;
      if (lf < 0) break;
      const ended = this.#endLine(true);
      if (!ended.ok) return this.#refuse(ended.error);
      from = lf + 1;
    }
    return ok(undefined);
  }

  finish(): Result<HexRecordImage, RegionDecodeFailure> {
    if (this.#failed !== undefined) return err(this.#failed);
    if (this.#finished)
      return this.#refuse(
        formatFailure(this.#lineNumber, "decoder is already finished"),
      );
    this.#finished = true;
    if (this.#lineLength > 0) {
      const ended = this.#endLine(false);
      if (!ended.ok) return this.#refuse(ended.error);
    }
    const merged = mergeRuns(this.#runs, this.#arena);
    this.#arena = new Uint8Array(0);
    if (!merged.ok) return this.#refuse(merged.error);
    const { regions, duplicateBytes } = merged.value;
    return ok({
      metadata: this.#metadata(regions, duplicateBytes),
      regions,
      terminated: this.#termination !== undefined,
      limitations: this.#limitations(),
    });
  }

  #refuse(failure: RegionDecodeFailure): Result<never, RegionDecodeFailure> {
    this.#failed = failure;
    return err(failure);
  }

  #overlong(line: number): RegionDecodeFailure {
    return formatFailure(
      line,
      `line exceeds the ${String(maxLineChars(this.#encoding))}-character ${HEX_RECORD_ENCODING_LABELS[this.#encoding]} maximum`,
    );
  }

  #endLine(lfTerminated: boolean): Result<void, RegionDecodeFailure> {
    this.#lineNumber += 1;
    let length = this.#lineLength;
    this.#lineLength = 0;
    // Only CRLF ends a line; a lone CR remains an invalid character.
    if (lfTerminated && this.#line[length - 1] === CR) length -= 1;
    if (length > maxLineChars(this.#encoding))
      return err(this.#overlong(this.#lineNumber));
    length = trimTrailingBlanks(this.#line, length);
    if (length === 0) return ok(undefined);
    const parsed = parseRecord(this.#encoding, this.#line.subarray(0, length));
    if (!parsed.ok) return err(this.#failure(parsed.error));
    if (this.#termination !== undefined)
      return err(
        this.#failure(
          `record follows the termination record at line ${String(this.#termination.line)}`,
        ),
      );
    this.#recordCount += 1;
    return this.#encoding === "intel-hex"
      ? this.#applyIntel(parsed.value)
      : this.#applySrec(parsed.value);
  }

  #failure(detail: string): RegionDecodeFailure {
    return formatFailure(this.#lineNumber, detail);
  }

  #applyIntel(record: HexRecord): Result<void, RegionDecodeFailure> {
    const value = readBigEndian(record.data);
    switch (record.type) {
      case "00":
        return this.#intelData(record);
      case "01":
        this.#termination = { value: record.type, line: this.#lineNumber };
        return ok(undefined);
      case "02":
      case "04":
        this.#segmentRecords ||= record.type === "02";
        this.#linearRecords ||= record.type === "04";
        this.#baseFromSegment = record.type === "02";
        this.#base = record.type === "02" ? value * 16 : value * 0x1_0000;
        return ok(undefined);
      case "03":
        return this.#declareStartSegment([value >>> 16, value & 0xffff]);
      default:
        // "05": the start linear address.
        this.#linearRecords = true;
        return this.#declareStart(value, record.type);
    }
  }

  #intelData({ address, data }: HexRecord): Result<void, RegionDecodeFailure> {
    this.#dataRecordCount += 1;
    // The specification wraps within 64 KiB, but some producers continue
    // linearly, so the address of the wrapped bytes is ambiguous.
    if (address + data.length > 0x1_0000)
      return err(
        this.#failure(
          `data at offset 0x${hex(address, 4)} with ${String(data.length)} bytes wraps past 0xffff; producers disagree on the wrapped address`,
        ),
      );
    const start = this.#base + address;
    if (this.#baseFromSegment && start + data.length - 1 > 0xf_ffff)
      return err(
        this.#failure(
          `I16HEX data at 0x${hex(start, 8)} with ${String(data.length)} bytes exceeds the 20-bit address 0xfffff`,
        ),
      );
    return this.#addData(start, data);
  }

  #applySrec(record: HexRecord): Result<void, RegionDecodeFailure> {
    switch (record.type) {
      case "S0":
        if (this.#header !== undefined)
          return err(
            this.#failure(
              `second S0 header record; the first is at line ${String(this.#header.line)}`,
            ),
          );
        this.#header = {
          value: record.data.slice(),
          line: this.#lineNumber,
          address: record.address,
        };
        return ok(undefined);
      case "S1":
      case "S2":
      case "S3":
        return this.#srecData(record);
      case "S5":
      case "S6":
        if (record.address !== this.#dataRecordCount)
          return err(
            this.#failure(
              `record type ${record.type} declares ${String(record.address)} data records, but ${String(this.#dataRecordCount)} precede it`,
            ),
          );
        this.#declaredCount = record.address;
        this.#declaredCountLine = this.#lineNumber;
        this.#countRecordCount += 1;
        return ok(undefined);
      default:
        this.#termination = { value: record.type, line: this.#lineNumber };
        return this.#declareStart(record.address, record.type);
    }
  }

  #srecData({
    type,
    address,
    data,
  }: HexRecord): Result<void, RegionDecodeFailure> {
    this.#dataRecordCount += 1;
    this.#dataTypes.add(type);
    const limit = SREC_DATA_LIMITS[type] ?? 0;
    if (address + data.length - 1 > limit)
      return err(
        this.#failure(
          `record type ${type} data at 0x${hex(address, 8)} with ${String(data.length)} bytes crosses 0x${hex(limit, 2)}`,
        ),
      );
    return this.#addData(address, data);
  }

  #declareStart(
    value: number,
    record: string,
  ): Result<void, RegionDecodeFailure> {
    const existing = this.#start;
    if (existing !== undefined && existing.value !== value)
      return err(
        this.#failure(
          `start address 0x${hex(value, 8)} conflicts with 0x${hex(existing.value, 8)} declared at line ${String(existing.line)}`,
        ),
      );
    this.#start ??= { value, line: this.#lineNumber, record };
    return ok(undefined);
  }

  #declareStartSegment(
    value: readonly [number, number],
  ): Result<void, RegionDecodeFailure> {
    this.#segmentRecords = true;
    const existing = this.#startSegment;
    if (
      existing !== undefined &&
      (existing.value[0] !== value[0] || existing.value[1] !== value[1])
    )
      return err(
        this.#failure(
          `start segment 0x${hex(value[0], 4)}:0x${hex(value[1], 4)} conflicts with 0x${hex(existing.value[0], 4)}:0x${hex(existing.value[1], 4)} declared at line ${String(existing.line)}`,
        ),
      );
    this.#startSegment ??= { value, line: this.#lineNumber };
    return ok(undefined);
  }

  #addData(
    address: number,
    data: Uint8Array,
  ): Result<void, RegionDecodeFailure> {
    if (data.length === 0) return ok(undefined);
    if (this.#arenaWriteOffset + data.length > this.#arena.length)
      return err({
        kind: "limit",
        boundary: "file-size",
        message: `line ${String(this.#lineNumber)}: decoded bytes exceed half of the admitted file size`,
      });
    const run = this.#runs.at(-1);
    if (run !== undefined && run.address + run.length === address) {
      run.length += data.length;
      run.recordCount += 1;
      run.lastLine = this.#lineNumber;
    } else {
      if (this.#runs.length >= this.maxRuns)
        return err({
          kind: "limit",
          boundary: "capacity",
          message: `line ${String(this.#lineNumber)}: data starts more than ${String(this.maxRuns)} address-discontiguous record runs; raise max_firmware_runs to admit more runs`,
        });
      this.#runs.push({
        address,
        offset: this.#arenaWriteOffset,
        length: data.length,
        recordCount: 1,
        firstLine: this.#lineNumber,
        lastLine: this.#lineNumber,
      });
    }
    this.#arena.set(data, this.#arenaWriteOffset);
    this.#arenaWriteOffset += data.length;
    return ok(undefined);
  }

  #variant(): HexRecordsMetadata["variant"] {
    if (this.#encoding === "intel-hex") {
      if (this.#segmentRecords && this.#linearRecords) return "mixed";
      if (this.#linearRecords) return "I32HEX";
      return this.#segmentRecords ? "I16HEX" : "I8HEX";
    }
    const widths = new Set(
      [...this.#dataTypes].map((type) => SREC_WIDTH_OF[type]),
    );
    if (widths.size > 1) return "mixed";
    const width =
      [...widths][0] ??
      (this.#termination === undefined
        ? undefined
        : SREC_WIDTH_OF[this.#termination.value]);
    return width === "S19" || width === "S28" || width === "S37" ? width : null;
  }

  #limitations(): string[] {
    const limitations: string[] = [];
    const label = HEX_RECORD_ENCODING_LABELS[this.#encoding];
    if (this.#termination === undefined)
      limitations.push(
        `${label} has no termination record; the file may be truncated.`,
      );
    else {
      const termination = this.#termination.value;
      const mismatched = [...this.#dataTypes].filter(
        (type) => SREC_WIDTH_OF[type] !== SREC_WIDTH_OF[termination],
      );
      if (this.#encoding === "srec" && mismatched.length > 0)
        limitations.push(
          `S-record termination ${termination} does not match the address width of ${mismatched.sort().join(", ")} data records.`,
        );
    }
    if (
      this.#declaredCount !== null &&
      this.#declaredCount !== this.#dataRecordCount
    )
      limitations.push(
        `The count declaration at line ${String(this.#declaredCountLine)} covers its ${String(this.#declaredCount)} preceding data records; it does not certify the final total of ${String(this.#dataRecordCount)} data records.`,
      );
    if (this.#countRecordCount > 1)
      limitations.push(
        "Multiple count declarations were checked against cumulative preceding data-record totals; count-reset or multiple-block interpretations were not applied.",
      );
    return limitations;
  }

  #metadata(
    regions: readonly HexRecordRegion[],
    duplicateBytes: number,
  ): HexRecordsMetadata {
    const header = this.#header?.value;
    const declaredStart = this.#start;
    return {
      kind: "hex-records",
      encoding: this.#encoding,
      variant: this.#variant(),
      line_count: this.#lineNumber,
      record_count: this.#recordCount,
      data_record_count: this.#dataRecordCount,
      data_bytes: regions.reduce((sum, region) => sum + region.bytes.length, 0),
      duplicate_bytes: duplicateBytes,
      region_count: regions.length,
      lowest_address: regions[0]?.start ?? null,
      highest_address: regions.at(-1)?.end ?? null,
      termination: this.#termination === undefined ? "absent" : "present",
      start_address: declaredStart?.value ?? null,
      start_address_record: startRecord(declaredStart?.record),
      start_segment_cs: this.#startSegment?.value[0] ?? null,
      start_segment_ip: this.#startSegment?.value[1] ?? null,
      header_address: this.#header?.address ?? null,
      header_line: this.#header?.line ?? null,
      header_hex:
        header === undefined
          ? null
          : [...header].map((byte) => hex(byte, 2)).join(""),
      header_text:
        header?.every((byte) => byte >= 0x20 && byte <= 0x7e) === true
          ? String.fromCharCode(...header)
          : null,
      declared_data_record_count: this.#declaredCount,
      declared_data_record_count_line: this.#declaredCountLine,
    };
  }
}

const startRecord = (
  record: string | undefined,
): HexRecordsMetadata["start_address_record"] =>
  record === "05" || record === "S7" || record === "S8" || record === "S9"
    ? record
    : null;

const lineSpan = (run: RecordRun): string =>
  run.firstLine === run.lastLine
    ? `line ${String(run.firstLine)}`
    : `lines ${String(run.firstLine)}-${String(run.lastLine)}`;

/** Merge runs sorted by address; overlaps must repeat the same byte values. */
const mergeRuns = (
  runs: readonly RecordRun[],
  arena: Uint8Array,
): Result<
  { regions: HexRecordRegion[]; duplicateBytes: number },
  RegionDecodeFailure
> => {
  const merged = mergeArenaRuns(runs, arena);
  if (!merged.ok) return err(conflict(merged.error));
  return ok({
    regions: merged.value.ranges.map(({ start, bytes, runs: group }) => ({
      start,
      end: start + bytes.length - 1,
      bytes,
      recordCount: group.reduce((sum, run) => sum + run.recordCount, 0),
      firstLine: group.reduce(
        (line, run) => Math.min(line, run.firstLine),
        Number.MAX_SAFE_INTEGER,
      ),
      lastLine: group.reduce((line, run) => Math.max(line, run.lastLine), 0),
    })),
    duplicateBytes: merged.value.duplicateBytes,
  });
};

const conflict = ({
  address,
  writer,
  run,
  existing,
  incoming,
}: RunConflict<RecordRun>): RegionDecodeFailure => ({
  kind: "format",
  message: `address 0x${hex(address, 8)} written with different values at ${lineSpan(writer)} (0x${hex(existing, 2)}) and ${lineSpan(run)} (0x${hex(incoming, 2)})`,
});
