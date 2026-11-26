import type { EspFlashSelectionInput } from "../../domain/targetFormatSelection.js";
import { createStoredFirmwareReader } from "../createStoredFirmwareReader.js";
import { AsarArtifactReader } from "../AsarArtifactReader.js";
import { Uf2ArtifactReader } from "../Uf2ArtifactReader.js";
import { DfuSeArtifactReader } from "../DfuSeArtifactReader.js";
import { HexRecordArtifactReader } from "../HexRecordArtifactReader.js";
import type { FirmwareCapacity } from "../../domain/firmware/firmwareCapacity.js";
import type { ArtifactReader } from "../ArtifactReader.js";
import { DirectoryArtifactReader } from "../DirectoryArtifactReader.js";
import { MachOSliceArtifactReader } from "../MachOSliceArtifactReader.js";
import { NativeDmgArtifactReader } from "../NativeDmgArtifactReader.js";
import { ZipArtifactReader } from "../ZipArtifactReader.js";
import type { ArtifactOccurrence } from "../../domain/artifactGraph.js";
import {
  isZipPackageFormat,
  ZIP_NON_ENTRY_TAIL_LIMITATION,
} from "../../domain/zipPackageFormat.js";
import type { StableRegularFileDescriptor } from "../../filesystem/RegularFile.js";

export const createReader = (
  path: string,
  format: ArtifactOccurrence["artifact_format"],
  environment: Readonly<NodeJS.ProcessEnv>,
  rootSource?: StableRegularFileDescriptor,
  firmwareCapacity?: FirmwareCapacity,
  integrity: "fail" | "record-and-continue" = "fail",
  espFlashSelection?: EspFlashSelectionInput,
): ArtifactReader | undefined => {
  if (isZipPackageFormat(format))
    return new ZipArtifactReader(path, format, undefined, rootSource);
  switch (format) {
    case "uimage":
    case "fit":
    case "android-boot-image":
    case "android-ota-payload":
    case "esp-image":
    case "esp-flash-image":
      return createStoredFirmwareReader(
        path,
        format,
        rootSource,
        firmwareCapacity,
        integrity,
        espFlashSelection,
      );
    case "uf2":
      return new Uf2ArtifactReader(path, rootSource, firmwareCapacity);
    case "dfuse":
      return new DfuSeArtifactReader(
        path,
        rootSource,
        firmwareCapacity,
        integrity,
      );
    case "intel-hex":
    case "srec":
      return new HexRecordArtifactReader(
        path,
        format,
        rootSource,
        firmwareCapacity,
      );
    case "directory":
      return new DirectoryArtifactReader(path);
    case "asar":
      return new AsarArtifactReader(path);
    case "mach-o-universal":
      return process.platform === "darwin"
        ? new MachOSliceArtifactReader(path, environment, undefined, rootSource)
        : undefined;
    case "dmg":
      if (process.platform !== "darwin") return undefined;
      return new NativeDmgArtifactReader(path, environment);
    default:
      return undefined;
  }
};

export const inventoryLimitations = (
  format: ArtifactOccurrence["artifact_format"],
  reader: ArtifactReader | undefined,
): string[] => {
  if (reader !== undefined)
    return isZipPackageFormat(reader.format)
      ? [ZIP_NON_ENTRY_TAIL_LIMITATION]
      : [...(reader.limitations?.() ?? [])];
  // dmg and pkg reach here only after classifyRootFormat matched their bytes.
  if (format === "dmg" || format === "pkg")
    return [
      `${format.toUpperCase()} root hash is observed; child inventory requires a native macOS adapter.`,
    ];
  if (format === "mach-o-universal" && process.platform !== "darwin")
    return ["Universal Mach-O slices require the native macOS lipo adapter."];
  return ["Artifact has no child container entries."];
};
