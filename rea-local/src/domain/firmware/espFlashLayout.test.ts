import { describe, expect, it } from "vitest";
import {
  espBootloaderProbeOffsets,
  espImageSegmentsEnd,
  locateEspBootloader,
} from "./espFlashBootloader.js";
import {
  ESP32C3_BOOTLOADER_SEGMENTS,
  esp8266Image,
  espImage,
} from "./espImage.fixture.js";

describe("ESP bootloader location", () => {
  const bootloader = espImage({
    segments: ESP32C3_BOOTLOADER_SEGMENTS,
    chipId: 0x0005,
  });
  const probe = (flashAddress: number, bytes: Uint8Array) => ({
    flashAddress,
    fileOffset: flashAddress,
    prefix: bytes.subarray(0, 32),
    available: bytes.length,
  });

  it("locates the image at its chip's ROM offset", () => {
    expect(locateEspBootloader([probe(0, bootloader)])).toMatchObject({
      location: { flashAddress: 0, fileOffset: 0, chip: { target: "esp32c3" } },
      limitations: [],
    });
  });

  it("reports an image at another chip's ROM offset instead of locating it", () => {
    const esp32 = espImage({
      segments: ESP32C3_BOOTLOADER_SEGMENTS,
      chipId: 0x0000,
    });
    expect(locateEspBootloader([probe(0, esp32)])).toEqual({
      location: undefined,
      limitations: [
        "An esp32 image is at flash 0x0, but its ROM loads the bootloader from 0x1000; the dump may not start at flash 0x0.",
      ],
      // Its chip and offset let the caller look for the origin it implies.
      misplacedImage: {
        chip: expect.objectContaining({ target: "esp32" }),
        fileOffset: 0,
      },
      esp8266: false,
    });
  });

  it("tells an unknown chip and an ESP8266 image from a misplaced origin", () => {
    const unknown = espImage({
      segments: ESP32C3_BOOTLOADER_SEGMENTS,
      chipId: 0x7777,
    });
    expect(locateEspBootloader([probe(0, unknown)])).toMatchObject({
      location: undefined,
      misplacedImage: undefined,
      esp8266: false,
    });
    expect(locateEspBootloader([probe(0, esp8266Image())])).toMatchObject({
      location: undefined,
      limitations: [],
      misplacedImage: undefined,
      esp8266: true,
    });
  });

  it("finds where a located image's segments end by their headers", async () => {
    const read = (position: number, length: number) =>
      bootloader.subarray(position, position + length);
    const declared = ESP32C3_BOOTLOADER_SEGMENTS.reduce(
      (end, { data }) => end + 8 + data.length,
      24,
    );
    expect(await espImageSegmentsEnd(read, 0, bootloader.length)).toBe(
      declared,
    );
    // Segments that run past the file end at the file.
    expect(await espImageSegmentsEnd(read, 0, 40)).toBe(40);
  });

  it("probes only the ROM offsets the file holds after its flash offset", () => {
    expect(espBootloaderProbeOffsets(0, 0x10_0000)).toEqual([
      { flashAddress: 0, fileOffset: 0 },
      { flashAddress: 0x1000, fileOffset: 0x1000 },
      { flashAddress: 0x2000, fileOffset: 0x2000 },
    ]);
    expect(espBootloaderProbeOffsets(0x1000, 0x10_0000)).toEqual([
      { flashAddress: 0x1000, fileOffset: 0 },
      { flashAddress: 0x2000, fileOffset: 0x1000 },
    ]);
  });
});
