import { z } from "zod";
import type { BinaryTarget } from "./binaryTargetTypes.js";

/** Complete target-format vocabulary shared by lifecycle, Evidence and snapshots. */
export const binaryTargetFormatSchema = z.enum({
  "analysis-database": "analysis-database",
  "mach-o": "mach-o",
  elf: "elf",
  pe: "pe",
  "dos-mz": "dos-mz",
  "dos-com": "dos-com",
  dex: "dex",
  zip: "zip",
  ipa: "ipa",
  apk: "apk",
  xapk: "xapk",
  apks: "apks",
  aab: "aab",
  "apk-set": "apk-set",
  msix: "msix",
  appx: "appx",
  hap: "hap",
  hsp: "hsp",
  "app-pack": "app-pack",
  asar: "asar",
  dmg: "dmg",
  pkg: "pkg",
  plist: "plist",
  javascript: "javascript",
  "source-map": "source-map",
  "intel-hex": "intel-hex",
  srec: "srec",
} satisfies { [Format in BinaryTarget["format"]]: Format });
