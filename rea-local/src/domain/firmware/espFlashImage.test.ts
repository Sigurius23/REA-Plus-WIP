import { expect, it } from "vitest";
import { parseEspFlashImage } from "./espFlashImage.js";
import { espFlashImageMetadataSchema } from "./espFlashMetadata.js";
import {
  espFlashDump,
  partitionTable,
  otaData,
  otaRecord,
  TWO_OTA_PARTITIONS,
} from "./espFlash.fixture.js";
import {
  espImage,
  ESP32C3_APP_SEGMENTS,
  ESP32C3_BOOTLOADER_SEGMENTS,
} from "./espImage.fixture.js";
const capacity = { maxHashBytes: 1_073_741_824, maxMetadataBytes: 33_554_432 };
function fixture() {
  return espFlashDump({
    bootloader: {
      at: 0,
      bytes: espImage({ segments: ESP32C3_BOOTLOADER_SEGMENTS }),
    },
    parts: [
      {
        at: 0xd000,
        bytes: otaData(
          otaRecord({ seq: 1, state: 2 }),
          otaRecord({ seq: 2, state: 2 }),
        ),
      },
      ...[0x10000, 0x20000, 0x30000].map((at) => ({
        at,
        bytes: espImage({ segments: ESP32C3_APP_SEGMENTS }),
      })),
    ],
  });
}
const decoded = (bytes: Uint8Array, selection = {}) => {
  const result = parseEspFlashImage(bytes, selection, capacity);
  if (!result.ok) throw Error(result.error.message);
  return result.value;
};
it("retains layout/OTA conditional facts and exact stored source intervals", () => {
  const bytes = fixture(),
    image = decoded(bytes);
  expect(espFlashImageMetadataSchema.parse(image.metadata)).toEqual(
    image.metadata,
  );
  expect(image.regions).toHaveLength(8);
  expect(image.metadata.coverage).toBe("complete");
  expect(image.metadata.boot_selection).toMatchObject({
    basis: "otadata",
    active_record: 1,
    slot: 1,
    partition_index: 5,
    running_partition: "unknown",
  });
  expect(image.metadata.partition_table.md5.status).toBe("valid");
  expect(image.metadata.otadata?.records[0]?.computed_crc).toBe(
    image.metadata.otadata?.records[0]?.crc,
  );
  expect(image.integrityFailures).toEqual([]);
  for (const region of image.regions)
    expect(region.bytes).toEqual(
      bytes.subarray(region.offset!, region.offset! + region.bytes.length),
    );
});
it("preserves leading partial partitions without fabricating their missing prefix", () => {
  const full = espFlashDump({
      table: partitionTable([
        { label: "prefix", type: 1, subtype: 2, offset: 0, size: 0x2000 },
      ]),
    }),
    bytes = full.subarray(0x1000),
    image = decoded(bytes, {
      flashOffset: 0x1000,
      partitionTableOffset: 0x8000,
    });
  const region = image.regions.find((r) => r.path === "partitions/prefix.bin")!;
  expect(region.offset).toBe(0);
  expect(region.bytes.length).toBe(0x1000);
  expect(region.metadata).toMatchObject({
    declared_file_offset: -0x1000,
    stored_offset: 0x1000,
    stored_size: 0x1000,
    availability: "truncated",
  });
  expect(image.metadata.coverage).toBe("unknown");
});
it("keeps erased/unset OTA CRC disagreement as an unusable record, not a corrupt programmed record", () => {
  const image = decoded(
    espFlashDump({
      bootloader: {
        at: 0,
        bytes: espImage({ segments: ESP32C3_BOOTLOADER_SEGMENTS }),
      },
    }),
  );
  expect(image.metadata.otadata?.records[0]).toMatchObject({
    ota_seq: 0xffffffff,
    crc: 0xffffffff,
    computed_crc: 0x2144df1c,
    valid: false,
    crc_matches: false,
  });
  expect(image.integrityFailures).toEqual([]);
});
it("retains exact bad table and programmed OTA CRC facts for strict/continue policy", () => {
  const bytes = espFlashDump({
    bootloader: {
      at: 0,
      bytes: espImage({ segments: ESP32C3_BOOTLOADER_SEGMENTS }),
    },
    table: partitionTable(TWO_OTA_PARTITIONS, { md5: "corrupt" }),
    parts: [{ at: 0xd000, bytes: otaData(otaRecord({ seq: 3, crc: 0 })) }],
  });
  const image = decoded(bytes);
  expect(image.integrityFailures.length).toBe(2);
  expect(image.metadata.partition_table.md5_entries[0]?.matches).toBe(false);
  expect(image.metadata.otadata?.records[0]).toMatchObject({
    ota_seq: 3,
    crc: 0,
    crc_matches: false,
  });
  expect(image.metadata.boot_selection.basis).toBe("none");
});
it("admits conservative CPU work and metadata before expansion", () => {
  const bytes = fixture();
  expect(
    parseEspFlashImage(bytes, {}, { ...capacity, maxHashBytes: 1 }),
  ).toMatchObject({ ok: false, error: { kind: "limit", boundary: "cpu" } });
  expect(
    parseEspFlashImage(bytes, {}, { ...capacity, maxMetadataBytes: 1 }),
  ).toMatchObject({
    ok: false,
    error: { kind: "limit", boundary: "capacity" },
  });
});
it("preserves cancellation instead of reporting an unrecognized layout", () => {
  const controller = new AbortController(),
    reason = new Error("cancelled");
  controller.abort(reason);
  expect(() =>
    parseEspFlashImage(fixture(), {}, capacity, controller.signal),
  ).toThrow(reason);
});
