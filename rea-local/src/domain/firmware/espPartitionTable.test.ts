import { createHash } from "node:crypto";
import { describe, expect, it } from "vitest";
import {
  decodeEspPartitionTable,
  espBootPartitions,
  espPartitionSubtypeName,
  espPartitionTypeName,
} from "./espPartitionTable.js";
import {
  TWO_OTA_PARTITIONS,
  partitionEntry,
  partitionTable,
} from "./espFlash.fixture.js";
const table = (bytes: Uint8Array) => {
  const decoded = decodeEspPartitionTable(bytes);
  if (!decoded.ok) throw new Error(decoded.error);
  return decoded.value;
};

describe("ESP partition tables", () => {
  it("decodes entries, flags and a verified MD5 as gen_esp32part writes them", () => {
    const decoded = table(
      partitionTable([
        ...TWO_OTA_PARTITIONS,
        {
          label: "keys",
          type: 0x01,
          subtype: 0x04,
          offset: 0x4_0000,
          size: 0x1000,
          flags: 0b11,
        },
      ]),
    );
    expect(decoded.md5.status).toBe("valid");
    expect(decoded.md5.entryOffset).toBe(7 * 32);
    expect(decoded.length).toBe(9 * 32);
    expect(decoded.limitations).toEqual([]);
    expect(decoded.partitions.map(({ label }) => label)).toEqual([
      "nvs",
      "otadata",
      "phy_init",
      "factory",
      "ota_0",
      "ota_1",
      "keys",
    ]);
    expect(decoded.partitions.at(-1)).toMatchObject({
      index: 6,
      entryOffset: 6 * 32,
      type: 0x01,
      subtype: 0x04,
      offset: 0x4_0000,
      size: 0x1000,
      encrypted: true,
      readonly: true,
      unknownFlags: 0,
    });
  });

  it("accepts a table without an MD5 entry, as the bootloader does", () => {
    const decoded = table(
      partitionTable(TWO_OTA_PARTITIONS, { md5: "absent" }),
    );
    expect(decoded.md5).toEqual({
      status: "absent",
      entryOffset: null,
      stored: null,
      computed: null,
    });
    expect(decoded.partitions).toHaveLength(6);
  });

  it("keeps the entries of a table whose MD5 does not match", () => {
    const decoded = table(
      partitionTable(TWO_OTA_PARTITIONS, { md5: "corrupt" }),
    );
    expect(decoded.md5.status).toBe("invalid");
    expect(decoded.partitions).toHaveLength(6);
    expect(decoded.limitations).toEqual([
      expect.stringMatching(/MD5.*0xc0.*does not match.*bootloader rejects/iu),
    ]);
  });

  it.each([
    ["erased flash", Buffer.alloc(0xc00, 0xff), "the first entry is empty"],
    [
      "an MD5 entry alone",
      partitionTable([]),
      "entry 1 at 0x20 ends the table before any partition entry",
    ],
    [
      "a foreign entry",
      Buffer.concat([
        partitionEntry(TWO_OTA_PARTITIONS[0]!),
        Buffer.alloc(32, 0),
        Buffer.alloc(0xbc0, 0xff),
      ]),
      "entry 1 at 0x20 has magic 0x0, not a partition, MD5 or terminating entry",
    ],
    [
      "no terminator",
      Buffer.concat(
        Array.from({ length: 96 }, () =>
          partitionEntry(TWO_OTA_PARTITIONS[0]!),
        ),
      ),
      "no terminating entry within 96 entries (0xc00 bytes)",
    ],
    [
      "short bytes",
      partitionEntry(TWO_OTA_PARTITIONS[0]!),
      "the bytes end at 0x20, inside entry 1",
    ],
  ])("rejects %s as not a table", (_name, bytes, reason) => {
    expect(decodeEspPartitionTable(bytes)).toEqual({
      ok: false,
      error: reason,
    });
  });

  it("names types and subtypes as ESP-IDF does, and keeps unknown flags and labels", () => {
    expect(espPartitionTypeName(0x00)).toBe("app");
    expect(espPartitionSubtypeName(0x00, 0x1f)).toBe("ota_15");
    expect(espPartitionSubtypeName(0x01, 0x04)).toBe("nvs_keys");
    expect(espPartitionTypeName(0x40)).toBeNull();
    expect(espPartitionSubtypeName(0x40, 0x00)).toBeNull();
    const entry = partitionEntry({
      label: "x",
      type: 0x40,
      subtype: 0,
      offset: 0x1_0000,
      size: 0x1000,
      flags: 0x8000_0001,
    });
    entry.writeUInt8(0xff, 13);
    const [decoded] = table(
      Buffer.concat([entry, Buffer.alloc(0xbe0, 0xff)]),
    ).partitions;
    expect(decoded).toMatchObject({
      label: null,
      // The source bytes stay comparable when the label is not UTF-8.
      labelHex: "78ff",
      encrypted: true,
      unknownFlags: 0x8000_0000,
    });
  });

  it("keeps the partitions the bootloader keeps: the last of each role", () => {
    const [nvs, otadata, , factory, ota0] = TWO_OTA_PARTITIONS;
    const boot = espBootPartitions(
      table(
        partitionTable([
          ...TWO_OTA_PARTITIONS,
          { ...factory!, label: "factory2", offset: 0x4_0000 },
          { ...otadata!, label: "otadata2", offset: 0x5_0000 },
          { ...ota0!, label: "again", offset: 0x6_0000 },
          { ...nvs!, label: "nvs2", offset: 0x7_0000 },
        ]),
      ).partitions,
    );
    expect(boot.factory?.label).toBe("factory2");
    expect(boot.otadata?.label).toBe("otadata2");
    // A same-subtype OTA entry replaces the slot but still counts.
    expect(boot.otaSlots.get(0)?.label).toBe("again");
    expect(boot.otaAppCount).toBe(3);
    expect(boot.limitations).toEqual([
      expect.stringMatching(/otadata.*2.*#1.*#7.*bootloader.*last/iu),
      expect.stringMatching(/factory.*2.*#3.*#6.*bootloader.*last/iu),
      expect.stringMatching(/ota_0.*2.*#4.*#8.*bootloader.*last/iu),
    ]);
  });
});

it("retains all fixed label bytes, including valid text padding and a BOM", () => {
  const entry = partitionEntry({ ...TWO_OTA_PARTITIONS[0]!, label: "A" });
  entry[14] = 0xff;
  const decoded = table(Buffer.concat([entry, Buffer.alloc(32, 0xff)]));
  expect(decoded.partitions[0]).toMatchObject({
    label: "A",
    labelHex: null,
    labelBytesHex: "4100ff" + "00".repeat(13),
  });
  const bom = partitionEntry({ ...TWO_OTA_PARTITIONS[0]!, label: "\uFEFFA" });
  expect(
    table(Buffer.concat([bom, Buffer.alloc(32, 0xff)])).partitions[0]?.label,
  ).toBe("\uFEFFA");
});
it("retains exact facts for every MD5 declaration when the table has more than one", () => {
  const entry = partitionEntry(TWO_OTA_PARTITIONS[0]!);
  const first = Buffer.concat([
    Buffer.from([0xeb, 0xeb]),
    Buffer.alloc(14, 0xff),
    createHash("md5").update(entry).digest(),
  ]);
  const prefix = Buffer.concat([entry, first]);
  const second = Buffer.concat([
    Buffer.from([0xeb, 0xeb]),
    Buffer.alloc(14, 0xff),
    createHash("md5").update(prefix).digest(),
  ]);
  const decoded = table(
    Buffer.concat([prefix, second, Buffer.alloc(32, 0xff)]),
  );
  expect(decoded.md5.status).toBe("invalid");
  expect(decoded.md5Entries).toEqual([
    {
      entryOffset: 32,
      stored: createHash("md5").update(entry).digest("hex"),
      computed: createHash("md5").update(entry).digest("hex"),
      matches: true,
    },
    {
      entryOffset: 64,
      stored: createHash("md5").update(prefix).digest("hex"),
      computed: createHash("md5").update(prefix).digest("hex"),
      matches: true,
    },
  ]);
  expect(decoded.limitations.join(" ")).toContain("second MD5");
});
it("does not certify later partitions with an earlier MD5 and preserves unsigned invalid ranges", () => {
  const original = partitionTable([TWO_OTA_PARTITIONS[0]!]);
  const beyond = partitionEntry({
    ...TWO_OTA_PARTITIONS[0]!,
    label: "beyond",
    offset: 0xfffff000,
    size: 0x2000,
  });
  const decoded = table(
    Buffer.concat([original.subarray(0, 64), beyond, Buffer.alloc(32, 0xff)]),
  );
  expect(decoded.md5.status).toBe("valid");
  expect(decoded.md5Entries[0]?.entryOffset).toBe(32);
  expect(decoded.partitions[1]).toMatchObject({
    offset: 0xfffff000,
    size: 0x2000,
  });
  expect(decoded.limitations.join(" ")).toContain("not covered");
  expect(decoded.limitations.join(" ")).toContain("32-bit flash address space");
});
it("matches a partition-table MD5 vector independently constructed with Python struct/hashlib", () => {
  const bytes = Buffer.from(
    "aa50010200900000004000006e76730000000000000000000000000000000000",
    "hex",
  );
  const md5 = Buffer.concat([
    Buffer.from([0xeb, 0xeb]),
    Buffer.alloc(14, 0xff),
    Buffer.from("90f3905a9ff42e590b9dd04da80ac5ad", "hex"),
  ]);
  const decoded = table(Buffer.concat([bytes, md5, Buffer.alloc(32, 0xff)]));
  expect(decoded.md5.computed).toBe("90f3905a9ff42e590b9dd04da80ac5ad");
  expect(decoded.md5Entries[0]?.matches).toBe(true);
});
