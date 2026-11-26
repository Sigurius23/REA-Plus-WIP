import { describe, expect, it } from "vitest";
import {
  decodeEspPartitionTable,
  espBootPartitions,
  type EspPartition,
} from "./espPartitionTable.js";
import { decodeEspOtaRecord, selectEspBootPartition } from "./espOtaData.js";
import {
  TWO_OTA_PARTITIONS,
  otaRecord,
  partitionTable,
} from "./espFlash.fixture.js";
const table = (bytes: Uint8Array) => {
  const decoded = decodeEspPartitionTable(bytes);
  if (!decoded.ok) throw new Error(decoded.error);
  return decoded.value;
};

const partitions = (): readonly EspPartition[] =>
  table(partitionTable(TWO_OTA_PARTITIONS)).partitions;

const select = (
  first: Buffer,
  second: Buffer,
  parts = partitions(),
  otadataSize = 0x2000,
) =>
  selectEspBootPartition(espBootPartitions(parts), {
    offset: 0xd000,
    size: otadataSize,
    records: [decodeEspOtaRecord(first, 0), decodeEspOtaRecord(second, 1)],
  });
const erased = Buffer.alloc(32, 0xff);

describe("ESP otadata selection", () => {
  it("decodes records and checks the CRC the bootloader computes", () => {
    expect(
      decodeEspOtaRecord(otaRecord({ seq: 3, state: 2 }), 0),
    ).toMatchObject({
      index: 0,
      ota_seq: 3,
      ota_state: 2,
      state_name: "valid",
      crc_matches: true,
      valid: true,
    });
    expect(decodeEspOtaRecord(otaRecord({ seq: 3, crc: 0 }), 1)).toMatchObject({
      crc_matches: false,
      valid: false,
    });
    // The CRC otatool v5.5.2 wrote for ota_seq 1 in the real-tool lane.
    expect(
      decodeEspOtaRecord(otaRecord({ seq: 1, crc: 0x4743_989a }), 0),
    ).toMatchObject({ crc_matches: true, valid: true });
    expect(decodeEspOtaRecord(Buffer.alloc(32, 0xff), 1)).toMatchObject({
      ota_seq: 0xffff_ffff,
      state_name: "undefined",
      valid: false,
    });
  });

  it("selects the higher valid sequence and maps it onto the OTA slots", () => {
    expect(select(otaRecord({ seq: 4 }), otaRecord({ seq: 5 }))).toMatchObject({
      active_record: 1,
      slot: 0,
      partition_index: 4,
      basis: "otadata",
    });
    // An invalid state removes a record; a tie keeps record 0.
    expect(
      select(otaRecord({ seq: 6, state: 3 }), otaRecord({ seq: 5 })),
    ).toMatchObject({ active_record: 1, slot: 0 });
    expect(select(otaRecord({ seq: 2 }), otaRecord({ seq: 2 }))).toMatchObject({
      active_record: 0,
      slot: 1,
      partition_index: 5,
    });
    // ota_seq 0 is set; (0 - 1) wraps to 0xFFFFFFFF, and 0xFFFFFFFF % 2 is 1.
    expect(select(otaRecord({ seq: 0 }), erased)).toMatchObject({
      active_record: 0,
      slot: 1,
      partition_index: 5,
    });
  });

  it("falls back as the bootloader does without usable records", () => {
    expect(select(erased, erased)).toMatchObject({
      basis: "factory-fallback",
      partition_index: 3,
      slot: null,
    });
    const noFactory = partitions().filter(({ label }) => label !== "factory");
    expect(select(erased, erased, noFactory)).toMatchObject({
      basis: "ota_0-fallback",
      slot: 0,
      partition_index: 4,
    });
    // Boot index 0 stands without an ota_0 partition.
    const onlyOta1 = noFactory.filter(({ label }) => label !== "ota_0");
    expect(select(erased, erased, onlyOta1)).toMatchObject({
      basis: "ota_0-fallback",
      slot: 0,
      partition_index: null,
    });
    // A set sequence with a bad CRC is not unusable, but no record is valid:
    // the factory index, with no factory partition to name.
    expect(
      select(otaRecord({ seq: 2, crc: 1 }), erased, noFactory),
    ).toMatchObject({ basis: "factory-fallback", partition_index: null });
    expect(select(otaRecord({ seq: 2 }), erased)).toMatchObject({
      running_partition: "unknown",
    });
    expect(select(otaRecord({ seq: 2 }), erased).assumptions).toHaveLength(4);
  });

  it("indexes OTA slots by subtype, so a missing subtype selects no partition", () => {
    const gapped = partitions().filter(({ label }) => label !== "ota_0");
    // Two OTA apps would be counted, but only ota_1 exists: seq 1 selects slot 0.
    const withSecond = [
      ...gapped,
      { ...gapped.at(-1)!, index: 9, subtype: 0x12, label: "ota_2" },
    ];
    expect(select(otaRecord({ seq: 1 }), erased, withSecond)).toMatchObject({
      slot: 0,
      partition_index: null,
      basis: "otadata",
    });
  });
});

describe("ESP boot selection without a derivable slot", () => {
  it("selects the factory index for a table without otadata", () => {
    const withoutOtadata = partitions().filter(
      ({ label }) => label !== "otadata",
    );
    const selection = selectEspBootPartition(
      espBootPartitions(withoutOtadata),
      undefined,
    );
    expect(selection).toMatchObject({
      basis: "no-otadata",
      active_record: null,
      slot: null,
      partition_index: 3,
      running_partition: "unknown",
    });
    // No record is read, so the records assumption does not apply.
    expect(selection.assumptions).toHaveLength(3);
    const factoryOnly = withoutOtadata.filter(
      ({ label }) => !label?.startsWith("ota_"),
    );
    expect(
      selectEspBootPartition(espBootPartitions(factoryOnly), undefined),
    ).toMatchObject({ basis: "no-otadata", partition_index: 3 });
    // Without a factory app the bootloader still selects the factory index.
    expect(
      selectEspBootPartition(
        espBootPartitions(
          withoutOtadata.filter(({ label }) => label !== "factory"),
        ),
        undefined,
      ),
    ).toMatchObject({ basis: "no-otadata", partition_index: null });
  });

  it("selects nothing from a short otadata partition and nothing known from one record", () => {
    expect(
      select(
        otaRecord({ seq: 1 }),
        otaRecord({ seq: 2 }),
        partitions(),
        0x1000,
      ),
    ).toEqual({
      basis: "none",
      active_record: null,
      slot: null,
      partition_index: null,
      assumptions: [],
      running_partition: "unknown",
    });
    const oneRecord = {
      offset: 0xd000,
      size: 0x2000,
      records: [decodeEspOtaRecord(otaRecord({ seq: 1 }), 0)],
    };
    expect(
      selectEspBootPartition(espBootPartitions(partitions()), oneRecord),
    ).toMatchObject({
      basis: "unknown",
      partition_index: null,
      assumptions: [],
    });
    // Without an OTA app the bootloader does not need the records.
    const noOtaApps = partitions().filter(
      ({ label }) => !label?.startsWith("ota_"),
    );
    expect(
      selectEspBootPartition(espBootPartitions(noOtaApps), oneRecord),
    ).toMatchObject({ basis: "factory-fallback", partition_index: 3 });
  });

  it("selects nothing from a rejected table and treats an otadata at offset 0 as absent", () => {
    // An MD5 mismatch fails esp_partition_table_verify before any selection.
    expect(
      select(otaRecord({ seq: 1 }), erased, partitions(), 0x2000),
    ).toMatchObject({
      basis: "otadata",
    });
    expect(
      selectEspBootPartition(
        espBootPartitions(partitions()),
        {
          offset: 0xd000,
          size: 0x2000,
          records: [
            decodeEspOtaRecord(otaRecord({ seq: 1 }), 0),
            decodeEspOtaRecord(erased, 1),
          ],
        },
        true,
      ),
    ).toEqual({
      basis: "none",
      active_record: null,
      slot: null,
      partition_index: null,
      assumptions: [],
      running_partition: "unknown",
    });
    // bootloader_utility_get_selected_boot_partition takes offset 0 for no otadata.
    expect(
      selectEspBootPartition(espBootPartitions(partitions()), {
        offset: 0,
        size: 0x2000,
        records: [],
      }),
    ).toMatchObject({ basis: "no-otadata", partition_index: 3 });
  });
});

it("requires a complete OTA record instead of synthesizing absent zero fields", () => {
  for (const size of [0, 3, 24, 28, 31])
    expect(() => decodeEspOtaRecord(new Uint8Array(size), 0)).toThrow(
      RangeError,
    );
  const complete = otaRecord({ seq: 1 });
  expect(
    decodeEspOtaRecord(Buffer.concat([complete, Buffer.from([99])]), 0),
  ).toEqual(decodeEspOtaRecord(complete, 0));
});
it.each([
  [0, 0xffffffff],
  [1, 0x4743989a],
  [3, 0xed4a5011],
  [0x80000000, 0x12477cdf],
  [0xfffffffe, 0x99f8b879],
  [0xffffffff, 0x2144df1c],
])(
  "keeps exact CRC for unsigned sequence %i using independently calculated Python zlib vectors",
  (seq, crc) => {
    const parsed = decodeEspOtaRecord(otaRecord({ seq, crc }), 0);
    expect(parsed).toMatchObject({
      ota_seq: seq,
      crc,
      computed_crc: crc,
      crc_matches: true,
    });
  },
);
