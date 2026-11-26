import type { EspFlashSelectionInput } from "../../domain/targetFormatSelection.js";
import type { ArtifactResourceScope } from "../ArtifactResourceScope.js";
import type { FirmwareCapacity } from "../../domain/firmware/firmwareCapacity.js";

/** Resolved integrity behavior admitted to the artifact scanner. */
export type ArtifactIntegrityPolicy =
  | { readonly mode: "fail" }
  | { readonly mode: "record-and-continue" };

export const STRICT_INTEGRITY_POLICY: ArtifactIntegrityPolicy = {
  mode: "fail",
};

/** Options shared by artifact inventory scans. */
export interface ArtifactInventoryOptions {
  readonly expectedCarrierSha256?: string | undefined;
  readonly firmwareFormat?: "esp-flash-image" | undefined;
  readonly espFlashSelection?: EspFlashSelectionInput | undefined;
  readonly firmwareCapacity?: FirmwareCapacity | undefined;
  readonly resourceScope: ArtifactResourceScope;
  readonly signal?: AbortSignal | undefined;
  readonly integrity?: ArtifactIntegrityPolicy | undefined;
  readonly environment?: Readonly<NodeJS.ProcessEnv> | undefined;
}
