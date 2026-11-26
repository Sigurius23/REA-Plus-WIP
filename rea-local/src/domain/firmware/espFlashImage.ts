// Selectively adapted from upstream REA f7849cad3fe3bffb207b4dc30f34394978c20297.
import { err, ok, type Result } from "../result.js";
import type { RegionDecodeFailure } from "./regionDecoder.js";
import {
  locateEspFlashLayout,
  type EspFlashSelection,
} from "./espFlashLocation.js";
import {
  planEspFlashLayout,
  finishEspFlashLayout,
  espFlashPartitionFacts,
  espErasedSlotLimitation,
  type EspFlashRegion,
  type EspFlashWrittenExtent,
} from "./espFlashLayout.js";
import {
  ESP_PARTITION_TABLE_ENTRY_BYTES,
  ESP_PARTITION_TABLE_MAX_BYTES,
  isEspAppPartition,
} from "./espPartitionTable.js";
import { ESP_OTA_SELECT_ENTRY_BYTES } from "./espOtaData.js";
import { parseEspImage } from "./espImage.js";
import { ESP_IMAGE_LIMITATIONS } from "./espImageFacts.js";
import { ESP_CHIP_TABLE_SOURCE } from "./espChips.js";
import type {
  EspFlashImageMetadata,
  espFlashRegionMetadataSchema,
  espFlashPartitionMetadataSchema,
  espFlashImageFactsSchema,
} from "./espFlashMetadata.js";
import type { z } from "zod";
type Facts = z.infer<typeof espFlashImageFactsSchema>;
type RegionMetadata =
  | z.infer<typeof espFlashRegionMetadataSchema>
  | z.infer<typeof espFlashPartitionMetadataSchema>;
export interface EspFlashImage {
  readonly metadata: EspFlashImageMetadata;
  readonly regions: readonly {
    path: string;
    offset: number | null;
    bytes: Uint8Array;
    metadata: RegionMetadata;
  }[];
  readonly limitations: readonly string[];
  readonly integrityFailures: readonly string[];
}
class CapacityFailure extends Error {
  constructor(readonly failure: RegionDecodeFailure) {
    super(failure.message);
  }
}
/** Parse a caller-selected retained dump. No device execution or implicit live state is involved. */
export function parseEspFlashImage(
  bytes: Uint8Array,
  selection: EspFlashSelection,
  capacity: { maxHashBytes: number; maxMetadataBytes: number },
  signal?: AbortSignal,
): Result<EspFlashImage, RegionDecodeFailure> {
  try {
    if (
      !Number.isSafeInteger(capacity.maxHashBytes) ||
      capacity.maxHashBytes < 1 ||
      !Number.isSafeInteger(capacity.maxMetadataBytes) ||
      capacity.maxMetadataBytes < 1
    )
      return err({
        kind: "format",
        message: "Flash work/metadata budgets must be positive safe integers",
      });
    let work = 0,
      metadataBytes = 0;
    const charge = (size: number, cpu = false) => {
      const used = cpu ? work : metadataBytes,
        max = cpu ? capacity.maxHashBytes : capacity.maxMetadataBytes;
      if (size > max - used)
        throw new CapacityFailure({
          kind: "limit",
          boundary: cpu ? "cpu" : "capacity",
          message: `ESP flash exceeds ${cpu ? "max_firmware_hash_bytes" : "max_firmware_metadata_bytes"}=${String(max)}`,
        });
      if (cpu) work += size;
      else metadataBytes += size;
    };
    charge(65536); // Reserve the protocol-bounded locator/table metadata before its expansion.
    const read = (position: number, length: number): Uint8Array => {
      signal?.throwIfAborted();
      if (position < 0 || position >= bytes.length) return new Uint8Array();
      const end = Math.min(bytes.length, position + length);
      charge(end - position, true);
      if (length === ESP_PARTITION_TABLE_MAX_BYTES) {
        const slots = Math.floor(
          (end - position) / ESP_PARTITION_TABLE_ENTRY_BYTES,
        );
        charge(
          (ESP_PARTITION_TABLE_ENTRY_BYTES * slots * (slots - 1)) / 2,
          true,
        );
      }
      return bytes.subarray(position, end);
    };
    const located = locateEspFlashLayout(bytes.length, read, selection, {
      explicit: true,
      ...(signal === undefined ? {} : { signal }),
    });
    if (!located.ok)
      return err({
        kind: "unsupported",
        message: `ESP flash layout is not recognized: ${located.error}`,
      });
    const location = located.value,
      plan = planEspFlashLayout({
        fileSize: bytes.length,
        origin: location.origin,
        bootloader: location.bootloader,
        tableAddress: location.tableAddress,
        tableMethod: location.tableMethod,
        table: location.table,
      });
    charge(4096 + plan.regions.length * 1024);
    const first = (start: number, length: number) => {
      charge(length, true);
      for (let at = start; at < start + length; at++) {
        if ((at & 0xffff) === 0) signal?.throwIfAborted();
        if (bytes[at] !== 0xff) return at;
      }
      return undefined;
    };
    // Split at every declared boundary, scan each covered byte once, then combine small summaries.
    const boundaries = [
      ...new Set(
        plan.regions
          .filter((r) => r.available > 0)
          .flatMap((r) => [
            r.availableFileOffset,
            r.availableFileOffset + r.available,
          ]),
      ),
    ].sort((a, b) => a - b);
    const summaries: {
      start: number;
      end: number;
      first: number | null;
      last: number | null;
      count: number;
    }[] = [];
    for (let i = 0; i < boundaries.length - 1; i++) {
      const start = boundaries[i]!,
        end = boundaries[i + 1]!;
      if (
        !plan.regions.some(
          (r) =>
            r.available > 0 &&
            r.availableFileOffset <= start &&
            r.availableFileOffset + r.available >= end,
        )
      )
        continue;
      charge(end - start, true);
      let firstByte: number | null = null,
        last: number | null = null,
        count = 0;
      for (let at = start; at < end; at++) {
        if ((at & 0xffff) === 0) signal?.throwIfAborted();
        if (bytes[at] !== 0xff) {
          firstByte ??= at;
          last = at + 1;
          count++;
        }
      }
      summaries.push({ start, end, first: firstByte, last, count });
    }
    const written = new Map<EspFlashRegion, EspFlashWrittenExtent>();
    for (const region of plan.regions) {
      if (region.available === 0) continue;
      let start: number | null = null,
        end: number | null = null,
        count = 0;
      for (const item of summaries)
        if (
          item.start >= region.availableFileOffset &&
          item.end <= region.availableFileOffset + region.available
        ) {
          start ??= item.first;
          if (item.last !== null) end = item.last;
          count += item.count;
        }
      written.set(region, {
        offset:
          start === null
            ? null
            : region.storedOffset + start - region.availableFileOffset,
        end:
          end === null
            ? null
            : region.storedOffset + end - region.availableFileOffset,
        bytes: count,
      });
    }
    const facts = finishEspFlashLayout(plan, {
      otadataRecords: (plan.otadata?.records ?? []).map((record) =>
        record.available
          ? read(record.fileOffset, ESP_OTA_SELECT_ENTRY_BYTES)
          : undefined,
      ),
      gapFirstUnerased: plan.gaps.map((gap) => first(gap.offset, gap.length)),
    });
    const limitations = [...location.limitations, ...facts.limitations],
      integrityFailures: string[] = [];
    if (location.tableMethod === "scan")
      limitations.push(
        "The partition table was derived by an MD5-verified sector scan; the bootloader's configured table offset is not recorded.",
      );
    if (location.table.md5.status === "invalid")
      integrityFailures.push(
        "Partition table MD5 metadata is invalid (digest disagreement or duplicate MD5 entries); exact declarations and computations are retained.",
      );
    for (const record of facts.otadata?.records ?? [])
      if (record.ota_seq !== 0xffffffff && !record.crc_matches)
        integrityFailures.push(
          `OTA record ${String(record.index)} CRC mismatch: stored ${record.crc.toString(16)}, computed ${record.computed_crc.toString(16)}`,
        );
    const decoded = new Map<string, Facts>(),
      images = new Map<EspFlashRegion, Facts>();
    let imageUnknown = false;
    for (const region of plan.regions) {
      if (
        region.role !== "bootloader" &&
        (region.partition === undefined || !isEspAppPartition(region.partition))
      )
        continue;
      const key = `${String(region.availableFileOffset)}:${String(region.available)}:${String(region.storedOffset)}`;
      charge(65536);
      let image = decoded.get(key);
      if (image === undefined) {
        const unknown = (status: Facts["status"], message: string): Facts => ({
          status,
          image: null,
          segments: [],
          signature_blocks: [],
          coverage: "unknown",
          limitations: [message],
        });
        if (region.available === 0 || region.storedOffset > 0)
          image = unknown(
            "unavailable",
            "The dump lacks the start or all bytes of this declared image; no ESP header or zero-filled image was invented.",
          );
        else {
          charge(region.available * 3, true);
          const erased =
            first(
              region.availableFileOffset,
              Math.min(region.available, 24),
            ) === undefined;
          if (erased)
            image = {
              status: "erased",
              image: null,
              segments: [],
              signature_blocks: [],
              coverage: null,
              limitations: [],
            };
          else {
            const parsed = parseEspImage(
              bytes.subarray(
                region.availableFileOffset,
                region.availableFileOffset + region.available,
              ),
            );
            if (!parsed.ok)
              image = unknown("unrecognized", parsed.error.message);
            else {
              image = {
                status: "esp-image",
                image: parsed.value.metadata,
                segments: [...parsed.value.segments.map((s) => s.metadata)],
                signature_blocks: [
                  ...parsed.value.signatureBlocks.map((b) => b.metadata),
                ],
                coverage: parsed.value.coverage,
                limitations: [
                  ESP_IMAGE_LIMITATIONS.inventoryScope,
                  ...parsed.value.limitations,
                ],
              };
              integrityFailures.push(
                ...parsed.value.integrityFailures.map(
                  (message) => `${region.path}: ${message}`,
                ),
              );
            }
          }
        }
        decoded.set(key, image);
      }
      images.set(region, image);
      if (image.coverage === "unknown") imageUnknown = true;
      const erasedNote =
        image.status === "erased" && written.has(region)
          ? espErasedSlotLimitation(region.path, written.get(region)!)
          : undefined;
      if (erasedNote !== undefined) limitations.push(erasedNote);
    }
    const regions = plan.regions.map((region) => {
      const window = {
        declared_file_offset: region.fileOffset,
        stored_offset: region.available === 0 ? null : region.storedOffset,
        stored_size: region.available,
        availability: region.availability,
      };
      const metadata: RegionMetadata =
        region.partition === undefined
          ? {
              kind: "esp-flash-region",
              role: region.role as "bootloader" | "partition-table",
              flash_address: region.flashAddress,
              size: region.length,
              ...window,
            }
          : {
              ...espFlashPartitionFacts(region.partition, written.get(region)),
              ...window,
            };
      return {
        path: region.path,
        offset: region.available === 0 ? null : region.availableFileOffset,
        bytes: bytes.subarray(
          region.availableFileOffset,
          region.availableFileOffset + region.available,
        ),
        metadata,
      };
    });
    const bootloader = plan.regions.find((r) => r.role === "bootloader"),
      bootFacts = bootloader === undefined ? undefined : images.get(bootloader);
    const assumptions = [
      ...facts.boot_selection.assumptions,
      "Actual flash capacity, bootloader build configuration, flash encryption and table-capacity acceptance are not established by this dump.",
    ];
    const metadata: EspFlashImageMetadata = {
      kind: "esp-flash-image",
      coverage: imageUnknown ? "unknown" : facts.coverage,
      flash_offset: { ...location.origin },
      chip:
        location.bootloader === undefined
          ? null
          : {
              target: location.bootloader.chip.target,
              isa: location.bootloader.chip.isa,
              source: ESP_CHIP_TABLE_SOURCE,
            },
      bootloader:
        bootloader === undefined || bootFacts === undefined
          ? null
          : {
              path: bootloader.path,
              flash_address: bootloader.flashAddress,
              region_size: bootloader.length,
              facts: bootFacts,
            },
      partition_table: {
        flash_address: location.tableAddress,
        method: location.tableMethod,
        partition_count: location.table.partitions.length,
        md5: {
          status: location.table.md5.status,
          stored: location.table.md5.stored,
          computed: location.table.md5.computed,
        },
        md5_entries: location.table.md5Entries.map((e) => ({
          entry_offset: e.entryOffset,
          stored: e.stored,
          computed: e.computed,
          matches: e.matches,
        })),
      },
      apps: [...images].flatMap(([region, image]) =>
        region.partition === undefined
          ? []
          : [
              {
                path: region.path,
                partition_index: region.partition.index,
                facts: image,
              },
            ],
      ),
      otadata:
        facts.otadata === null
          ? null
          : {
              partition_index: facts.otadata.partition_index,
              records: [...facts.otadata.records],
            },
      boot_selection: { ...facts.boot_selection, assumptions },
      undescribed: [...facts.undescribed],
    };
    if (integrityFailures.length > 0)
      limitations.push(
        "Observed programmed integrity disagreements remain in exact metadata; explicit continuation marks carrier and derived bytes observed-untrusted.",
      );
    limitations.push(
      "Flash layout and OTA choice are conditional derivations from stored bytes. The running partition is unknown; signatures, eFuse/rollback policy, load fallback and actual device boot are unverified. Partition encrypted flags are declarations; raw bytes are preserved without decryption.",
    );
    return ok({ metadata, regions, limitations, integrityFailures });
  } catch (cause) {
    if (cause instanceof CapacityFailure) return err(cause.failure);
    throw cause;
  }
}
